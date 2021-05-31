package co.yedam.test;

public class Employee {
	int employeeeId;
	String name;
	int departmentId; //10인사 20 개발 30 영업(기본값)
	String department;
	int salary;
	String email;
	
	//public Employee() {}
	
	
	public Employee() {
		this(0,"",0,0,"");
	}
	
	
	public Employee(int employeeeId, String name) {
		
		this(employeeeId, name,0,0,"");
	}



	

	public Employee(int employeeeId, String name, String email) {

		this(employeeeId, name, 0, 0, email);
		//		super();
//		this.employeeeId = employeeeId;
//
//		this.name = name;
//		this.email = email;
	}

	public Employee(int employeeeId, String name, int salary) {
		this(employeeeId, name, 0, 0, "");
	}

	public Employee(int employeeeId, String name, int departmentId, int salary, String email) {
		super();
		this.employeeeId = employeeeId;
		this.name = name;
		
		
		
		this.departmentId = departmentId;
		
		if(departmentId ==0) {
			this.departmentId =30;
			
		}
		
		if(departmentId == 10) {
			this.department ="인사";
		}if(departmentId == 20) {
			this.department ="개발";
		}
		if(departmentId == 30) {
			this.department ="영업";
		}
		
		this.salary = salary;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee [employeeeId=" + employeeeId + ", name=" + name + ", departmentId=" + departmentId
				+ ", department=" + department + ", salary=" + salary + ", email=" + email + "]";
	}

	
	
	
	
}
