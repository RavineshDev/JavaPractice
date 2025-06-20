package logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 final class ImmutableEmplpyee {
	
	//name, dob, list of phone
	//emp.getPhones().add("12345"); -> output
	private final String name;
	private final String dob;
	private final List<String> phones;
	
	public ImmutableEmplpyee(String name, String dob, List<String> phones) {
		super();
		this.name = name;
		this.dob = dob;
		this.phones = phones;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public List<String> getPhones() {
		return phones;
	}

}

public class ImmutableTest{
	
	public static void main(String[] args) {
//		List<ImmutableEmplpyee> empList=new ArrayList<>();
//		empList.add(new ImmutableEmplpyee("Ram", "10-06-2001",Arrays.asList("9071","1234")));
//		empList.add(new ImmutableEmplpyee("Shayam", "10-06-2010",Arrays.asList("1232","4321")));
//		empList.add(new ImmutableEmplpyee("Kartoon", "10-06-2013",Arrays.asList("5432","6547")));
		
		ImmutableEmplpyee emp = new ImmutableEmplpyee("Ram", "10-06-2001",Arrays.asList("9071","1234"));
		
		//emp.getPhones().add("12345"); // java.lang.UnsupportedOperationException at runtime
		System.out.println(emp.getPhones());
		
	}
	
}
