package java8.wipro;

public class Employee {
	
	private int id;
	private int salary;
	private int deptId;
	private boolean status; // active or inactive
	
	public Employee(int id, int salary, int deptId, boolean status) {
		super();
		this.id = id;
		this.salary = salary;
		this.deptId = deptId;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", deptId=" + deptId + ", status=" + status + "]";
	}
	
	

}
