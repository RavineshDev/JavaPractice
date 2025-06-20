package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloTest{
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Super","name","SeWrT");
		
		list.stream().map(String::toLowerCase).forEach(System.out::println);
		
		//double d = list.stream().mapToDouble(Integer::valueOf).average().getAsDouble();
		//System.out.println(d);
		
		
	}
}




