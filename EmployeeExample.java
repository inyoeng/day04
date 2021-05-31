package co.yedam.test;

public class EmployeeExample {

	public static void main(String[] args) {
		
		Employee emp0 = new Employee();
		System.out.println(emp0);
		
		Employee emp1 = new Employee(100,"홍길동");
		System.out.println(emp1);
		
		//사번101 , 이름 김유신, a@a.c
		
		Employee emp2 = new Employee(101, "김유신","a@a.c");
		System.out.println(emp2);
		
		//102, 유관순 급여 2500
		Employee emp3 = new Employee(102, "유관순", 2500);
		System.out.println(emp3);
		
		//모든 필드 초기화 
		Employee emp9 =new Employee(104,"정인영",20,5000,"naver");
		System.out.println(emp9);
		
	}

}
