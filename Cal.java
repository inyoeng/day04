package co.yedam.test;

//클래스= 필드+ 매서드로+생성자 구분됨

public class Cal {
	//power on ->리턴 값, 리턴 없음. 매개변수도 없다. 
	
	void poweron() {
		System.out.println("Power On!");
	}
	
	//sum -> no return, 매개변수 있음
	void sum(int a, int b) {
		System.out.println("int");
		System.out.println("a+b는 "+(a+b));
	}
	
	void sum(double a, double b) {
		System.out.println("double");
		System.out.println("a+b는 "+(a+b));
	}
	
	//리턴(리턴타입 적어주기) 있고 매개변수도 있는 경우
	int sum1 (int a, int b) {
		return a+b; 
	}
	
	//4. 가변인수 (인수 갯수 모름)
	int sum3(int ...a) {
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}

}
