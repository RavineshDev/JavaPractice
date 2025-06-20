package java8;

import java.util.Comparator;
import java.util.stream.IntStream;

public class SecondHighestNumber {
	
	public static void main(String[] args) {
		int nums[] = {32, 64, 96, 21, 653, 23, 653, 123};
		int secHighestNum = IntStream.of(nums).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secHighestNum);
	}

}
