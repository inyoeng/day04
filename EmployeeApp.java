package homework;

import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeApp {
	
	int memberNum;
	Member [] members = new member[memberNum];
	int cnt =0;
	String name;
	String id;
	int salary;


	//��� �� �Է�
	Scanner sc = new Scanner(System.in);
	
	public void init() {
		System.out.println("������� �Է��ϼ���: ");
		
		memberNum = sc.nextInt();
	}
	
	public void input() {
		System.out.println("������� �Է�: ");
		for (int i = 0; i <memberNum ; i++) {
			System.out.println("name: ");
			name =sc.next();
			System.out.println("id: ");
			id =sc.next();
			System.out.println("salary: ");
			salary =sc.nextInt();
		}
	}
	public void printList() {
		System.out.println("�������Ʈ: ");
		
		for (int i = 1; i <= memberNum ; i++) {
		System.out.println(members[i]);
		}
	}
	public String search() {
		int no = sc.nextInt();
		System.out.println(members[no].getName());
		return name;
	}
	
	public int sum() {
		int total =0;
		int sa =0;
		for (int i = 0; i <memberNum ; i++) {
			total += members[i][3];
			
		}
		return total;
	}


	}
	


