package ch04.sec05;

import java.util.Scanner;

public class TeamExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int Money = 0;
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.����  |  2.���  |  3.�ܰ�  |  4.����");
			System.out.println("-----------------------------------");
			System.out.print("����> ");
		
			String strNum = scanner.nextLine();
		
			
			
			if(strNum.equals("1")) {
				System.out.print("���ݾ�> ");
				int strNum2 = scanner.nextInt();
				scanner.nextLine();
				Money += strNum2;
			} else if (strNum.equals("2")) {
				System.out.print("��ݾ�> ");
				int strNum2 = scanner.nextInt();
				scanner.nextLine();
				Money -= strNum2;
			} else if (strNum.equals("3")) { 
				System.out.println("�ܰ�> " + Money);
			} else if (strNum.equals("4")) {
				run = false;
			}
			
		}
		System.out.println("���α׷� ����");
	

	}

}
