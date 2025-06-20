package logical;

public class LargestSumSubArray {
	
	public static void main(String[] args) {
		int input[] = {8, 9, -1, 1, 6, 5, 7, -6}; // Here subarray are {8,9} = 17, after that minus(-) value is there hence next
		                                          // subarray are {1,6,5,7} = 19.  So output is 19
		int maxVal = input[0];
		int globalMaxVal = input[0];
		
		for(int i=1; i < input.length; i++) {
			if(input[i]<0) {
				maxVal = 0;
			}else {
				maxVal+=input[i];
			}
			
			if(maxVal> globalMaxVal) {
				globalMaxVal = maxVal;
			}
		}
		System.out.println("Max sum of subarray: "+globalMaxVal);
	}

}
