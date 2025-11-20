
package team_assignment;

import java.util.Scanner;

public class BankApplication {
	
	public static void main(String[] args) {
		
		Account[] accounts=new Account[100];
		int cnt=0;
		Scanner scanner=new Scanner(System.in);
		String option=" ";
		
		while(!option.equals("5")) {
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			
			System.out.print("선택> ");
			option=scanner.nextLine();
			
			switch (option) {
				case "1":
					if(cnt==100) {
						System.out.println("관리 가능 계좌수 초과");
						break;
					}
					accounts[cnt]=new Account();
					System.out.println("--------");
					System.out.println("계좌생성");
					System.out.println("--------");
					System.out.print("계좌번호: ");
					String number=scanner.nextLine();
					accounts[cnt].setNumber(number);
					System.out.print("계좌주: ");
					String name=scanner.nextLine();
					accounts[cnt].setName(name);
					System.out.print("초기입금액: ");
					int input=scanner.nextInt();
					accounts[cnt].setBalance(input);
					System.out.println("결과: 계좌가 생성되었습니다.");
					cnt++;
					scanner.nextLine();
					break;
					
				case "2":
					System.out.println("--------");
					System.out.println("계좌목록");
					System.out.println("--------");
					for(int i=0;i<cnt;i++) {
						System.out.println(accounts[i].getNumber()+" "+accounts[i].getName()+" "+accounts[i].getBalance());
					}
					break;
					
				case "3":
					System.out.println("--------");
					System.out.println("예금");
					System.out.println("--------");
					System.out.print("계좌번호: ");
					String inputAccount=scanner.nextLine();
					System.out.print("예금액: ");
					int inputMoney=scanner.nextInt();
					for(int i=0;i<cnt;i++) {
						if (inputAccount.equals(accounts[i].getNumber())) {
							accounts[i].deposit(inputMoney);
						}
					}
					scanner.nextLine();
					break;
				
				case "4":
					System.out.println("--------");
					System.out.println("출금");
					System.out.println("--------");
					System.out.print("계좌번호: ");
					String outputAccount=scanner.nextLine();
					System.out.print("예금액: ");
					int outputMoney=scanner.nextInt();
					for(int i=0;i<cnt;i++) {
						if (outputAccount.equals(accounts[i].getNumber())) {
							accounts[i].withdraw(outputMoney);
						}
					}
					scanner.nextLine();
					break;
					
				case "5":
					System.out.println("프로그램 종료");
					break;
			}
		}
		
		
	}

}
