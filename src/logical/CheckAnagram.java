package logical;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagram {
	
	public void approachFirst(String s1, String s2) {
		int strLen1 = s1.length();
        int strLen2 = s2.length();
        
        if(strLen1 == strLen2) {
        	boolean flag = false;
        	char []ch1 = s1.toCharArray();
        	char []ch2 = s2.toCharArray();
        	
        	for(int i=0; i<strLen1; i++) {
        		int count = 0;
        		
        		for(int j=0; j< strLen2; j++) {
        			count++;
        			if(ch1[i] == ch2[j]) {
        				count=0;
        				ch2[j] = 0;
                        break;
        			}else if(count == strLen1) {
        				flag = true;
        				break;
        			}
        		}
        		
        		if(flag) {
        			System.out.println("It is not anagram");
        			break;
        		}else if(i == strLen1-1){
        			System.out.println("It is anagram");
        		}
        			
        	}
        	
        }else {
        	System.out.println("Its not anagram");
        }
	}
	
	public void approachSecond(String s1, String s2) {
		int strLen1 = s1.length();
        int strLen2 = s2.length();
        
        if(strLen1 ==strLen2) {
        	char []ch1 = s1.toCharArray();
        	char []ch2 = s2.toCharArray();
        	
        	
        	
        	Arrays.sort(ch1);
        	Arrays.sort(ch2);
        	
        	boolean result = Arrays.equals(ch1, ch2);
        	
        	if(result)
        		System.out.println("It is anagram");
        	else
        		System.out.println("It is not anagram");
        	
        }else {
        	System.out.println("Its not anagram");
        }
	}
	
	
	
	public static void main(String[] args) {
		String s1 = "sbckr";
        String s2 = "bckrs";
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        CheckAnagram chan = new CheckAnagram();
        chan.approachFirst(s1, s2);
        chan.approachSecond(s1, s2);
        
        
	}

}
