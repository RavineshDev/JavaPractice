package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MultiplyArrayValue {
	
	public static void main(String[] args) {
//		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);//output: 720
//		int total = nums.stream().reduce((a,b)-> a*b).get();
//		System.out.println("Post multiply arrays value, total is "+total);
		
		int nums[] = {1,2,3,4,5,6};
//		System.out.println(Arrays.toString(nums));
//		double avg = IntStream.of(nums).average().getAsDouble();
//		System.out.println(avg);
		
		//int total = IntStream.of(nums).reduce((a,b) -> a*b).getAsInt();
		int total = IntStream.of(nums).boxed().reduce((a,b) -> a*b).get();
		System.out.println(total);
		
		int total1 = IntStream.of(nums).boxed().reduce(3,(a,b) -> a*b);
		System.out.println(total1);
		
		int val = IntStream.range(2, nums.length).boxed().reduce((a,b) -> a*b).orElse(-1);
		System.out.println(val);
		
		
	}

}
