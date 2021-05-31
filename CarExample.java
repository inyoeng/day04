package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		//2단계 객체 생성 (인스턴스)
		Car myCar = new Car(); //car(): 생성자 부름
		myCar.company = "BMW";
		myCar.color = "red";
		
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		
		myCar.speed = 50;
		System.out.println("현재속도: "+myCar.speed);
		
		Car car2 =new Car("Benz","mini","Beige");
		System.out.println(car2);
	
		//코나 속도 100
		Car miniCar = new Car("코나",100);
		System.out.println(miniCar);
		
	}

}
