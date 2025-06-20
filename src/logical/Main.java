package logical;

import java.util.HashMap;
import java.util.Map;

public class Main {    
    public static void main(String[] args) {
		Main mainObj = new Main();
        
        String STRINPUT = "tttttttttttttttt ttyuuuuuuuuuuuuujiiii iiiiiiiiiyjj  jjjjjjjjjhlllllllllllllopppp";
        
        int secNonRepCharIndex = mainObj.getSecondNonRepetativeChar(STRINPUT);
        mainObj.evaluate(secNonRepCharIndex, 'o', STRINPUT);
    }
    
    int getSecondNonRepetativeChar(String strInput){
        int secNonRepIndex = -1;
        
        char[] chs = strInput.toCharArray();
        int len = chs.length;
        
        Map<Character, Integer> k = new HashMap<>();
        
        for(int i=0; i<len; i++) {
        	
        	if(k.containsKey(chs[i])) {
        		 int count = k.get(chs[i]);
        		 count++;
        		 k.put(chs[i], count);
        	}else {
        		k.put(chs[i], 1);
        	}
        }
        
        int count = 0;
        
        char output = 0;
        
        for(Map.Entry<Character, Integer> ent: k.entrySet()) {
        	if(ent.getValue() == 1) {
        		count++;
        		if(count == 2) {
        			output = ent.getKey();
        			break;
        		}
        	}
        }
        
        for(int i=0; i< len; i++) {
        	if(chs[i] == output) {
        		secNonRepIndex = i;
        		break;
        	}
        }
        
        
        return secNonRepIndex;
    }
    
    void evaluate(int secNonRepCharIndex, char charToTest, String STRINPUT) {
		System.out.print("-- String to test ---> " + STRINPUT + "\n");
        System.out.println("----- Actual Output -----");
        System.out.print("Index of second non-repetative char is :::::: " + secNonRepCharIndex);
		if(secNonRepCharIndex != -1){
			System.out.printf("; **[char at %s index is : %s]", secNonRepCharIndex, STRINPUT.charAt(secNonRepCharIndex));System.out.println("");
		} else {
			System.out.println("; There's no duplicate/there's an error");
		}
        System.out.println("----- Expected Output -----");
        System.out.println("Index of second non-repetative char " + charToTest + " is :::::: " + STRINPUT.indexOf(charToTest) + "\n");
	}
}