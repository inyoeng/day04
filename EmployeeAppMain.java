package homework;

import java.util.Scanner;

public class EmployeeAppMain {

	public static void main(String[] args) {
		EmployeeApp app = new EmployeeApp();
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;

		while (run) {
			System.out.println("1.�����  2.��������Է�  3.�������Ʈ  4.�˻�  5.�޿��հ�   6.����");
			System.out.print("����>");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.init();
			} else if (selectNo == 2) {
				app.input();
			} else if (selectNo == 3) {
				app.printList();
			} else if (selectNo == 4) {
				System.out.print("�˻��� ���>");
				
				String name = app.search();
				System.out.println("�̸��� "+ name);
			}else if (selectNo == 4) {
				int s = app.sum();
				System.out.println("�޿��հ� = " + s);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}
	
}
