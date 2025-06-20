package logical;

import java.util.Arrays;

public class MinimumIntervalFromArray {
	
	public static void main(String[] args) {
		int vals[] = {-5,-2,6,17,12,29,101};
		Arrays.sort(vals);
		int minInterval = vals[1]-vals[0];
		
		for(int i=2; i<vals.length; i++) {
			if((vals[i]-vals[i-1])<minInterval) {
				minInterval = vals[i]-vals[i-1];
			}
		}
		System.out.println("Minimum interval: "+minInterval);
	}

}
