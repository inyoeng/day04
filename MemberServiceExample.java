package co.yedam.member;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean b = true;
		while (b) {
		System.out.println("1. 입력 2. 전체 조회 3. n번 회원 조회 4. 로그인 5. 로그 아웃");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 1) {
			ms.insert();
		}else if(a == 2) {
			ms.printList();
		}
		else if(a == 3) {
			ms.printMember();
		}
		else if(a ==4) {
			ms.login();
		}
		else if(a ==5) {
			ms.logout();
			b = false;
		}
		
	}
	}
}
