package java8.wipro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOperation {
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, 2000, 101, true));
		employees.add(new Employee(2, 4200, 102, false));
		employees.add(new Employee(3, 6500, 101, true));
		employees.add(new Employee(7, 3200, 103, true));
		employees.add(new Employee(5, 4500, 101, false));
		employees.add(new Employee(6, 7500, 102, true));
		employees.add(new Employee(4, 3200, 104, true));
		
		//program to print max and min salary from given employees
		int maxSalary = employees.stream().map(emp -> emp.getSalary()).max(Integer::compare).get();
		System.out.println("Max salary of an Employee: "+maxSalary);
		
		int minSalary = employees.stream().map(emp -> emp.getSalary()).min(Integer::compare).get();
		System.out.println("Min salary of an Employee: "+minSalary);
		
		//program to print max salary of employee from each department
		System.out.println();
		Map<Integer, Optional<Employee>> maxSalaryByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		maxSalaryByDept.forEach((key, value) -> System.out.println("DeptID: "+key+" , max salary: "+value.get().getSalary()));
		
		//program to print active and inactive employees in the given collection
		System.out.println();
		List<Employee> activeEmployees= employees.stream().filter(emp -> emp.isStatus() == true).collect(Collectors.toList());
		activeEmployees.forEach(System.out::println);
		//activeEmployees.forEach(emp -> System.out.println(emp.toString())); // Its also correct
		
		//program to print employee details working in each department
		System.out.println();
		Map<Integer, List<Employee>> empDetailsByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDeptId));
		empDetailsByDept.forEach((key, value) -> System.out.println("Dept ID: "+key+", Employee List: "+value));
		
		//program to print employees count working in each department
		System.out.println();
		Map<Integer, Long>  deptWithEmpCount=employees.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
		deptWithEmpCount.forEach((key, value) -> System.out.println("Dept ID: "+key+", Count of Employee: "+value));
		
		//program to print reverse sort employee based on salary
		System.out.println();
		List<Employee> revSalarySortedList = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		revSalarySortedList.forEach(emp -> System.out.println(emp.toString()));
		
		//program to print reverse sort employee based on salary 
		//where if 2 or more salary are same then id is sorted as ascending order
//		System.out.println();
//		Collections.sort(employees, Comparator.comparing(Employee::getId));
//		Collections.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
//		employees.forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println();
		List<Employee> revSortedList = employees.stream().sorted(Comparator.comparing(Employee::getId))
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		revSortedList.forEach(emp -> System.out.println(emp.toString()));
		
		
	}

}
