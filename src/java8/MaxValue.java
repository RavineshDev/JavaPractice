package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaxValue {
	
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int maxV = myList.stream().max(Integer::compare).get();
		System.out.println(maxV);
		
		List<String> strList = Arrays.asList("Ram", "Shyam", "Mohan", "Shiyaram");
		String maxStr = strList.stream().max(Comparator.comparing(String::valueOf)).get(); // Here compared based on ASCII value.
		System.out.println(maxStr);
		
		String []strArr = {"ram", "shyam", "shankar", "ram"};
    	String strMax = Arrays.stream(strArr).max(Comparator.comparing(String::length)).get();
    	System.out.println(strMax);
    	
    	String strMax1 = Arrays.stream(strArr).collect(Collectors.maxBy(Comparator.comparing(String::length))).get();
    	System.out.println(strMax1);
    	
	    int arr[] = {1,2,7, 0, 5};
        int maxVal = IntStream.of(arr).max().getAsInt();
        System.out.println(maxVal);
        int mVal = IntStream.of(arr).boxed().collect(Collectors.minBy(Integer::compare)).get();
        System.out.println(mVal);
	}

}
