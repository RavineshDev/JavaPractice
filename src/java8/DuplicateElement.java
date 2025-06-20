package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(12,21,33,456,456,22,33,12,33);
		Set<Integer> distinctVals = new HashSet<>();
		nums.stream().filter(n -> !distinctVals.add(n)).distinct().forEach(System.out::println);
	}

}
