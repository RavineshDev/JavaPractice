package logical;

import java.util.Stack;

public class Balanced {
	
	public static void main(String[] args) {
		String input= "){}("; //"[{)]"; //"[{()}(){}]";
		
		Stack<Character> s = new Stack<>();
		
		String valid = "Given input is balanced";
		String inValid = "Given input is not balanced";
		
		if(input.isEmpty()) {
			System.out.println(inValid);
		}else if(input.charAt(0) == ')' || input.charAt(0) == '}' || input.charAt(0) == ']') {
			System.out.println(inValid);
			
		}else {
			for(int i=0; i<input.length(); i++) {
				char ch = input.charAt(i);
				
				if(ch == '[' || ch == '{' || ch == '(') {
					s.push(ch);
					continue;
				}
				
				if((ch == ')') && s.peek() == '(') {
					s.pop();
					continue;	
				}
				if((ch == '}') && s.peek() == '{') {
					s.pop();
					continue;	
				}
				if((ch == ']') && s.peek() == '[') {
					s.pop();
					continue;	
				}
				break;
				
			}
			
			if(s.empty())
				System.out.println(valid);
			else
				System.out.println(inValid);
		}
	}

}
