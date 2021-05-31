package co.yedam.test;

public class CalExample {

	public static void main(String[] args) {
		Cal c =new Cal();
		c.poweron();
		c.sum(1, 2);
		c.sum(2.5, 23);
		int r = c.sum1(400,500);
		System.out.println(r);
		System.out.println(c.sum3(1,50,1,61,45,5));
	}

}
