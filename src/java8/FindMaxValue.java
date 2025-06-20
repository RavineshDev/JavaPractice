package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxValue {
	
	public static void main(String[] args) {
		/*List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 * int maxVal = num.stream().max(Integer::compare).get();
		 * System.out.println(maxVal);
		 */
		
		List<String> val = Arrays.asList("Game", "GAME", "game");
		String maxVal = val.stream().max(Comparator.comparing(String::valueOf)).get();
		System.out.println(maxVal);
	}

}
