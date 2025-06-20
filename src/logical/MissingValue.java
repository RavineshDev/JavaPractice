package logical;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingValue {
	
	public static void main(String[] args) {
//		int arr[] = {1,3,4,5,8,10};
//		int lastVal = 10;
//		Set<Integer> set = new LinkedHashSet<>();
//		
//		for(int val:arr) {
//			set.add(val);
//		}
//		System.out.println("Missing values: ");
//		for(int i=1; i<=lastVal; i++) {
//			if(!set.contains(i)) {
//				System.out.print(i+" ");
//			}
//		}
		
		int arr[] = {1,3,4,5,8,10};
		int lastVal = 10;
		int firstVal=1;
		for(int i=0; i<arr.length; i++) {
			while(firstVal< arr[i]) {
				if(arr[i] != firstVal) {
					System.out.println(firstVal);
				}
				firstVal++;
			}
			firstVal=arr[i]+1;
		}
		int assignedLastVal = arr[arr.length-1];
		while(assignedLastVal<lastVal) {
			System.out.println(assignedLastVal+1);
			assignedLastVal++;
		}
	}

}
