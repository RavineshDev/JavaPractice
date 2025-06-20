package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageMarksCoding {

	public static void main(String[] args) {
		String[] input = {"1-english:45", "2-english:45", "3-hindi:60", "4-hindi:90", "5-math:90"};
		Map<String, List<Integer>> map = new HashMap<>();
		
		for(int i=0; i< input.length; i++) {
			String subject = input[i].substring(input[i].indexOf("-")+1, input[i].indexOf(":"));
			int marks = Integer.parseInt(input[i].substring(input[i].indexOf(":")+1));
			
			if(map.containsKey(subject)) {
				List<Integer> list = map.get(subject);
				list.add(marks);
				map.put(subject, list);
			}
			else {
				List<Integer> list = new ArrayList<>();
				list.add(marks);
				map.put(subject, list);
			}
		}
		
		map.forEach((key, value) -> System.out.println(key+" : "+value.stream().mapToDouble(x -> x).average().getAsDouble()));
		
	}
}
