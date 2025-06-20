package java8.listToMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to convert list of employee to map where key is city and value is list of employee related to city
public class EmployeeGroupingByCity {
	
	public static void main(String[] args) throws Exception{
    	List<Employee> list = new ArrayList<>();
    	list.add(new Employee(1, "Ravi", "Bangalore", "Karnataka"));
    	list.add(new Employee(2, "Sonu", "Bangalore", "Karnataka"));
    	list.add(new Employee(3, "Sandeep", "Patna", "Bihar"));
    	list.add(new Employee(4, "Vikash", "Banka", "Bihar"));
    	list.add(new Employee(5, "Amit", "Patna", "Bihar"));
    	//System.out.println(list);
    	
    	
    	// 1st approach
    	Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getCity));
    	map.forEach((key, value) -> System.out.println("city: "+key+" , value: "+value));
    	
    	// 2nd approach
    	//HashMap<String, List<Employee>> listMap = list.stream().collect(Collectors.groupingBy(Employee::getCity, HashMap::new, Collectors.toList()));
    	//listMap.forEach((k, v) -> System.out.println(k+" , "+v));
    	
    	//Map<String, String> temp = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getCity));
    	//temp.forEach((key, value) -> System.out.println("Name: "+key+" , City: "+value));
    	
    	//HashMap<String, Long> countMap = list.stream().collect(Collectors.groupingBy(Employee::getCity, HashMap::new, Collectors.counting()));
    	//countMap.forEach((k, v) -> System.out.println(k+" , "+v));
 
	}

}
