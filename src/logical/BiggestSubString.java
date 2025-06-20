package logical;

import java.util.HashSet;
import java.util.Set;

// find biggest and unique substring length
public class BiggestSubString {
	
	public static void main(String[] args) throws Exception{
    	String s = "abcbcabba";
    	int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for(int right = 0; right< n; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right-left+1);
                //System.out.println("doing: "+charSet);
            }else{
                while(charSet.contains(s.charAt(right))){
                	//System.out.println(s.charAt(left));
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        //System.out.println(maxLength+" , "+charSet);
        System.out.println("max substring length: "+maxLength);
	}

}
