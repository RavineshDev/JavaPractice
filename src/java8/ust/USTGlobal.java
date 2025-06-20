package java8.ust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
interface TestInterface{
	int multiply(int a, int b);
	
	default void instanceMethod() {
		System.out.println("Called default method from interface");
	}
	
	static void staticMethod() {
		System.out.println("Called static method from interface");
	}
}

public class USTGlobal {
	
	private static List<Employee> createEmployeeList(){
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Ram", "Male"));
		list.add(new Employee("Sohan", "Male"));
		list.add(new Employee("Leela", "Female"));
		list.add(new Employee("Shyam", "Male"));
		list.add(new Employee("Sunita", "Female"));
		list.add(new Employee("Linda", "Female"));
		
		return list;
	}
	
	public static void main(String[] args) {
		//Find word starting with A and collect them.
		String []inputs = {"Amit", "Sunil", "Anil", "Ramesh", "Vikram"};
		List<String> list = Arrays.stream(inputs).filter(s -> s.startsWith("A")).collect(Collectors.toList());
		list.forEach(name -> System.out.println("Name: "+name));
		
		//Filter employees and group based on gender
		System.out.println();
		List<Employee> maleEmployees = USTGlobal.createEmployeeList().stream().filter(emp -> emp.getGender().equals("Male")).collect(Collectors.toList());
		maleEmployees.forEach(emp -> System.out.println("Emp name: "+emp.getName()+" , Gender: "+emp.getGender()));
		
		System.out.println();
		Map<String, List<Employee>> map = USTGlobal.createEmployeeList().stream().collect(Collectors.groupingBy(Employee::getGender));
	    map.forEach((key, value) -> System.out.println("Gender: "+key+", empDetails: "+value.toString()));
	    
	    //Find duplicate words with their count from a given string
	    System.out.println();
	    String str = "Testing program is Testing program";
	    HashMap<String, Long> hMap = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
	    hMap.forEach((k, v) -> {if(v>1)System.out.println("Val:"+k+" , Count: "+v );});
	    
	    //Create custom Functional Interface 
	    // and use it in main method through lambda expression
	    System.out.println();
	    TestInterface test = (a,b) -> (a*b);
	    System.out.println(test.multiply(5, 6));
	    test.instanceMethod();
	    
	    TestInterface.staticMethod();
	}

}
