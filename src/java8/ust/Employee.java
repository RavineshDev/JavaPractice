package java8.ust;

class Employee {
	
	private int id;
	private String name;
	private int age;
	private String active;
	private String department;
	private int yearOfJoining;
	private double salary;
	private String gender;
	
	public Employee(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public Employee(int id, String name, int age, String active, String department, int yearOfJoining, double salary,
			String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.active = active;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", department="
//				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + ", gender=" + gender + "]";
//	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name +", gender=" + gender + "]";
	}
	
}
