package co.yedam.exam;

import java.util.Scanner;

public class ExamScore {
	String examNum;
	int kor;
	int his;
	int eng;
	
	int total;
	int avg;
	int avg() {
		total = kor + his+ eng;
		return total/3;
	}
	
	Scanner s =new Scanner(System.in);
	
	void input() {
		kor = s.nextInt();
		his = s.nextInt();
		eng = s.nextInt();
		}
	
	
	String isPass = (avg <60 && kor <=40 && his <=40 && eng <=40) ? "불합격" : "합격";
	
	
	
}
