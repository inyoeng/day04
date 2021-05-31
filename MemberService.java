package co.yedam.member;

import java.util.Scanner;

import co.yedam.test.Member;

public class MemberService {
	Member[] members = new Member[3];
	int cnt = 0;
	
	//sign in
	//Scanner sc = new Scanner();
	
	
	
	void insert( String name,String id, String pw, int age) {
		members[cnt++] = new Member(name, id, pw,age);
	}
	
	Scanner sc = new Scanner(System.in);
	
	void insert() {
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("id: ");
		String id = sc.next();
		System.out.println("pw: ");
		String pw =sc.next();
		System.out.println("age: ");
		int age = sc.nextInt();
		members[cnt++] = new Member(id, pw, name, age);
	}
	//list
	void printList() {
		System.out.println("회원정보 전체 출력: ");
		for (int i =0 ; i <members.length; i ++) {
			System.out.println(members[i].name);
			System.out.println(members[i].id);
			System.out.println(members[i].age);
			
		}
	}
	
	void printMember() {
		System.out.println("확인할 회원의 번호를 입력하세요: ");
		int a = sc.nextInt();
		System.out.printf("[%d]번째 회원 정보 ",a);
		System.out.println(members[a].name);
		System.out.println(members[a].id);
		System.out.println(members[a].age);
	}
	
//	void login(String id, String pw){
//		//hong pw 12345 들어 갓을때만
//		String result = "";
//		for  (int i =0 ; i <members.length; i++) {
//			if (id.equals(members[i].id) && pw.equals(members[i].pw)) {
//				result = "true";
//				}
//			}
//		if(result == "true") {
//			System.out.println("logged in.");
//		}
//		else {
//		System.out.println("wrong id or password");
//		}
//			}
	
	
		
	void login () {
		
		String id = sc.next();
		String pw =sc.next();
		
		String result = "";
		for  (int i =0 ; i <members.length; i++) {
			if (id.equals(members[i].id) && pw.equals(members[i].pw)) {
				result = "true";
				}
			}
		if(result == "true") {
			System.out.println("logged in.");
		}
		else {
		System.out.println("wrong id or password");
		}
	}
	
	void logout() {
		System.out.println("logged out.");
	}
}
