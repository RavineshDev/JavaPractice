package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelCountFromString {
	
	public static void main(String[] args) {
		String str = "hello hello";
		long count = str.chars().filter(x -> (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')).count();
		System.out.println(count);
		
		//Now find duplicate chars from given str
		
		Map<String, Long> map = str.chars().boxed().collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		map.forEach((key, value) -> System.out.println(key+" : "+value));//Here key will be ASCII value as String
		
		Map<String, Long>  maps= str.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		maps.forEach((key, value) -> System.out.println("Key: "+key+" , Value: "+value));
		
		
	}

}
