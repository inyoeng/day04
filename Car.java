package co.yedam.test;

/*
 * 현재 자동차 정보만 저장하는 역할
 * String[]
 * 
 * 1단계 클래스 선언
 */

public class Car {
	//필드 (상태, 속성)
	
	String company ;
	String model;
	String color;
	int maxSpeed ;
	int speed;
	
	//생성자
	/*
	 * 1. 객체 생성시에 호출되어 필드 초기화를 하는 특수용도의 메서드
	 * 2. 메서드 생성자 이름은 클래스 명과 동일
	 * 3. 리턴 타입 없음!!!!
	 * 4. ((오버로딩))생성자를 여러개 중복 선언은 가능하지만, 매개 변수의 타입, 개수, 순서는 달라야함.
	 */
	
	Car(String company, String model, String color){
		this.company = company;
		this.model =model;
		this.color = color;
				
	}
	
	
	

	//Car(){} //기본생성자
	
	
	
	Car() {
		this("현대","그랜저","검정",350,0);
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}// source 에서 toString 하면서 생성해줌.

	public Car (String model,int speed) {
		this("",model,null,0,speed);
	}
	
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		if(maxSpeed>100) {this.maxSpeed =maxSpeed;}
			else{
				this.maxSpeed=100;}
		
		if (speed >0) {
			this.speed =speed;
		}else {
			this.speed =0;
		}
		this.speed = speed;
	}
	
	
}

