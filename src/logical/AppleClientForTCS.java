package logical;

import java.util.Arrays;

//In a given array, we have to get highest number/value by searching left to right and 
//replace all value with highest number before highest number
//and highest number will be replace by -1
//again post highest number, we will follow the same process to get the expected output.

public class AppleClientForTCS {
	
	public static void main(String[] args) {
		int arr[] = {8,9,5,11, 6,1,7,6};
    	//Output: 11, 11, 11, -1, 7, 7, -1, -1
    	
    	int size = arr.length;
    	int maxFromRight = arr[size-1];
    	arr[size-1] = -1;
    	
    	for(int i = size-2; i>=0; i--) {
    		int temp = arr[i];
    		if(maxFromRight>temp) {
    			arr[i] = maxFromRight;
    		}else {
    			arr[i] = -1;
    		}
    		
    		if(maxFromRight<temp) {
    			maxFromRight=temp;
    		}	
    	}
    	System.out.println(Arrays.toString(arr));
	}

}
