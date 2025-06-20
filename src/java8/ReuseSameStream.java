package java8;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseSameStream {
	
	public static void main(String[] args) {
		String []strArr = {"ram", "shyam", "shankar", "ram"};
//		Stream<String> strs = Arrays.stream(strArr);
//		strs.forEach(System.out::println);
//		long count = strs.filter(x -> "ram".equals(x)).count(); //java.lang.IllegalStateException: stream has already been operated upon/used or closed
//		System.out.println(count);
		
		//Through Supplier Function Interface, we can reuse the stream.
		
		Supplier<Stream<String>> strs = () -> Arrays.stream(strArr);
		strs.get().forEach(System.out::println);
		long count = strs.get().filter(x -> "ram".equals(x)).count();
		System.out.println(count);
		
	}

}
