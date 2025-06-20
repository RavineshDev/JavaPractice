package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfDistinctValues {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,5,2,3,4,3,1,21);
		
//		Set<Integer> keys = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).keySet();
//		System.out.println(keys);

//		Collection<Long> vals = list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).values();
//		System.out.println(vals);
		
		list.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().forEach(x -> System.out.println(x.getKey()+" : "+x.getValue()));
		
		List<String> strList = Arrays.asList("Amanda", "Rob", "Sunny", "Amanda", "Rob");
		
		strList.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().forEach(x -> System.out.println(x.getKey()+" : "+x.getValue()));
	}

}
