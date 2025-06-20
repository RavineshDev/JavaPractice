package java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
	
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(12,3245,51,14246,17,29);
		 num.stream().filter(n -> n.toString().startsWith("1")).forEach(System.out::println);
	}

}
