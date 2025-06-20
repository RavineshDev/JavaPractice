package java8;

import java.util.Optional;

public class NullValidation {
	
	public static void main(String[] args) {
		String strs[] = new String[10];
		strs[5] = "RAM";
		Optional<String> str= Optional.ofNullable(strs[5]);
		if(str.isPresent()) {
			String s = strs[5].toLowerCase();
			System.out.println(s+ " is present");
		}else {
			System.out.println(strs[5]+" is not present");
		}
	}

}
