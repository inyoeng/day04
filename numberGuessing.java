package homework;

import java.util.Random;
import java.util.Scanner;
public class numberGuessing {

	/*
	 * ���� ������ ����!
	 * up or down!
	 */
	
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			Random r = new Random();
			
			int com = r.nextInt(10);
			
			boolean game = true;
			int count = 0;
			
			System.out.println("���� ������ ���� START!");
			System.out.println("������ �Է��ϼ���! >>");
			int level = s.nextInt();
			int go = 0;
			level = 10 - level;
			
			while (game) {
				
				System.out.println();
				System.out.println("0~10������ ���� �Է��ϼ���! >>");
				int user = s.nextInt(10);
				
				if (com == user) {
					System.out.println("Correct!");
					game = false;
				}
				else if(com > user) {
					if(level == count) {
						System.out.println("���ӿ���...");
						game = false;
					}else {
						System.out.println("�۽��ϴ�. �� ū ���� �Է��ϼ���!");
						System.out.println();
						count +=1;
					}
				}
				else if(com <user) {
					if(level == count) {
						System.out.println("���ӿ���...");
						System.out.println("Press 1 to restart, 2 to quit.: ");
						go = s.nextInt();
						if(go == 2){
							game = false;
						}else{
							count+=1;
						}
					}else {
						System.out.println("Ů�ϴ�. �� ���� ���� �Է��ϼ���!");
						System.out.println();
						count += 1;
					}
				}
				
			}
			
		}

	}

