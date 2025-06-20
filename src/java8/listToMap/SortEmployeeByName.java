package java8.listToMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeByName {
	
public static void main(String[] args) throws Exception{
    	
    	List<Employee> list = new ArrayList<>();
    	list.add(new Employee(1, "Ravi", "Bangalore", "Karnataka"));
    	list.add(new Employee(2, "Sonu", "Bangalore", "Karnataka"));
    	list.add(new Employee(3, "Sandeep", "Patna", "Bihar"));
    	list.add(new Employee(4, "Vikash", "Banka", "Bihar"));
    	list.add(new Employee(5, "Amit", "Patna", "Bihar"));
    	
    	System.out.println("Sorted in ascending order: ");
    	List<Employee> sortedList = list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
    	sortedList.forEach(emp -> System.out.println(emp.toString()));
    	
    	System.out.println();
    	System.out.println("Sorted in descending order: ");
    	List<Employee> revSortedList = list.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
    	revSortedList.forEach(emp -> System.out.println(emp.toString()));
    	
    	System.out.println();
    	System.out.println("Multi-Sorted in asscending order: ");
    	List<Employee> multiSortedList = list.stream().sorted(Comparator.comparing(Employee::getState).thenComparing(Employee::getName)).collect(Collectors.toList());
    	multiSortedList.forEach(emp -> System.out.println(emp.toString()));
 
	}

}
