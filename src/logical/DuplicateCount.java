package logical;

import java.util.HashMap;

public class DuplicateCount {
	
	public static void main(String[] args) {
		char []arr = {'c', 'd', 'c', 'e', 'c', 'e'};
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i< arr.length; i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}else {
				int count = hm.get(arr[i]);
				count++;
				hm.put(arr[i], count);
			}
		}
		System.out.println(hm);
	}

}
