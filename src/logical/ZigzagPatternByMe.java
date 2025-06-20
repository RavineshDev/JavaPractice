package logical;

import java.util.ArrayList;
import java.util.List;

//Input
//String str = "ACCOLITE.COM";
//int row = 4;

//Input: 
//String str = "ACCOLOTE";
//int numRows = 3;

public class ZigzagPatternByMe {
	
	public static void main(String[] args) {

		String str = "ACCOLITE.COM";
		int row = 4;
		int i=0;
		
		
		List<List<Character>> firstList = new ArrayList<>();
		//List<List<Character>> secList = new ArrayList<>();
		
		List<Character> inFirstLoop = new ArrayList<>();
		//List<Character> inSecLoop = new ArrayList<>();
		
		boolean flag = false;
		
		while( i< str.length()) {
			
			for(int j=0; j< row; j++) {
				if(flag) {
					firstList.add(inFirstLoop);
					inFirstLoop = new ArrayList<>();
					flag = false;
				}
				inFirstLoop.add(str.charAt(i));
				i++;
				continue;
			}
			
			for(int k = (row-1); k> 1; k--) {
				
				if(flag == false) {
					firstList.add(inFirstLoop);
					inFirstLoop = new ArrayList<>();
					flag = true;
				}
				
				inFirstLoop.add(str.charAt(i));
				i++;
				
			}
		}
		firstList.add(inFirstLoop);
		
		for( List<Character> chs: firstList) {
			System.out.println(chs);
		}
		
		System.out.println("Printing result:");
		
		int columnSize = firstList.get(0).size();
		int revSize = columnSize -2;
		
		for(int k=0; k< row; k++) {
			int temp = revSize;
			//int firstSize = columnSize;
			//boolean flag = true;
			
			for(int l=0; l< (columnSize + revSize); l++) {
				
				if((l<columnSize) && flag) {
				System.out.print(firstList.get(l).get(0));
				}
				
				if(temp>0) {
					System.out.print(" ");
				}
				
			}
		}
		
	}
	
}
