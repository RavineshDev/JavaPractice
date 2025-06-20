package java8;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "c", "Spring");
		//list.stream().findFirst().ifPresent(System.out::println);
		String firstVal = list.stream().findFirst().get();
		System.out.println(firstVal);
	}

}
