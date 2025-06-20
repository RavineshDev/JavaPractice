package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Input as List of string value: Hello, how, are, you
//Output: [Hello-how-are-you]

public class CollectorJoiner {
	
	public static void main(String[] args) {
		List<String> vals = Arrays.asList("Hi", "how", "are", "you");
		String val = vals.stream().collect(Collectors.joining());
		System.out.println(val);
		
		String val1 = vals.stream().collect(Collectors.joining("-")); // delimiter
		System.out.println(val1);
		
		String val2 = vals.stream().collect(Collectors.joining("-", "[", "]")); // delimiter, prefix, suffix
		System.out.println(val2);
	}

}
