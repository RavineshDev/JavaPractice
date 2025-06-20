package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class NonRepeatCharacter {
	public static void main(String[] args) {
		String input = "Java articles are Jvr Awesome";
		Character result = input.chars() // Stream of String       
	            .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
	            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
	            .entrySet()
	            .stream()
	            .filter(entry -> entry.getValue() == 1L)
	            .map(entry -> entry.getKey())
	            .findFirst()
	            .get();
	    System.out.println(result);
	    
	     
	}
     
    
}
