package java8;

import java.util.StringJoiner;

//Input: Hello how are you
//Output: [Hello-how-are-you]

//We can achieve through StringJoiner in Java8
public class StringJoinerExample {
	
	public static void main(String[] args) {
		String input = "Hello how are you";
		String []inputArr = input.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		int len = inputArr.length;
		for(int i=0; i< len; i++) {
			sb.append(inputArr[i]);
			if(i < (len-1)) {
				sb.append("-");
			}
		}
		
		System.out.println("["+sb.toString()+"]");
		
		StringJoiner j = new StringJoiner("-");// delimiter
		for(String val: inputArr) {
			j.add(val);
		}
		System.out.println(j.toString());
		
		StringJoiner sjd = new StringJoiner("-", "[", "]"); // delimiter, prefix, suffix
		for(String val: inputArr) {
			sjd.add(val);
		}
		System.out.println(sjd.toString());
	}

}
