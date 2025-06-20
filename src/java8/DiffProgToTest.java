package java8;

import java.util.Arrays;
import java.util.List;

public class DiffProgToTest {
	
	public static void main(String[] args) {
		List<Integer> vals = Arrays.asList(2,20,4,6,4,5,6,10,14,10, 11);
		//vals.stream().filter(x -> x%2==0).forEach(System.out::println);
		//vals.stream().distinct().forEach(System.out::println);
		
//		Map <Boolean, List<Integer>> mapVal = vals.stream().collect(Collectors.partitioningBy(x -> x%2==0));
//		mapVal.entrySet().forEach(s -> System.out.println(s.getKey() +" -> "+s.getValue()));
		
//		String str = "GeeksForGeeks";
//		Map<String, Long> map = str.chars().mapToObj(s -> Character.toString(s)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		map.entrySet().forEach(x -> System.out.println(x.getKey()+" -> "+x.getValue()));
		
//		int []arr = {2,20,4,6,4,5,6,10,14,10};
//		Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		.entrySet().forEach(k -> System.out.println(k.getKey()+" -> "+k.getValue()));
		
//		vals.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//		vals.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);
//		vals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // Natural sorting order to reverse
		
//		List<String> strVals = Arrays.asList("Ram", "Sohan", "RamaKrishna", "Zoo", "Ravi");
//		strVals.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println); // Based on length of Char, reversing
		
//		String joinedVal = strVals.stream().collect(Collectors.joining(" , ", "[", "]"));
//		System.out.println(joinedVal);
		
//		int maxVal = vals.stream().max(Comparator.naturalOrder()).get().intValue(); //comparing(Integer::valueOf)
//		System.out.println(maxVal);
		
//		int minVal = Arrays.stream(arr).min().getAsInt();
//		System.out.println(minVal);
		
//		int min = IntStream.of(arr).min().getAsInt();
//		System.out.println(min);
		
//		int []secArr = {101,201,1};
//		int []mergedArr = IntStream.concat(Arrays.stream(arr), Arrays.stream(secArr)).sorted().distinct().toArray();
//		System.out.println(Arrays.toString(mergedArr));
		
		
		
//		String name1 = "Ram";
//		String name2 = "arm";
//		String sortedName1 = Stream.of(name1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//		String sortedName2 = Stream.of(name2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
//		
//		
//		System.out.println(sortedName1.equals(sortedName2));// ture - Anagram, false - not anagram
		
//		int rVal = 23123;
//		int sumVal = Stream.of(String.valueOf(rVal).split("")).collect(Collectors.summingInt(Integer::parseInt));
//		System.out.println(sumVal);
		
//		List<Integer> maxThree = vals.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
//		maxThree.forEach(System.out::println);
		
//		int secLarge = vals.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
//		System.out.println(secLarge);
		
//		List<String> list = Arrays.asList("ram", "shyam", "sohan", "RamBabu", "jo","ram");
//		list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
//		List<String> listSec = Arrays.asList("ram", "Krishna", "Vishnu", "RamBabu", "Narayan");
//		List<String> mergedList = Stream.concat(list.stream(), listSec.stream()).collect(Collectors.toList());
//		Set<String> set = new HashSet<>();
//		mergedList.stream().filter(x -> !set.add(x)).distinct().forEach(System.out::println);
		
//		list.stream().filter(listSec::contains).distinct().forEach(System.out::println);
		
		
	}

}
