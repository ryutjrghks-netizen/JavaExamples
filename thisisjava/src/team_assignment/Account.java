package team_assignment;

public class Account {
	
	private String number;
	private String name;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(int money) {
		if(money < 0) {
			System.out.println("잘못된 금액입니다.");
			return;
		}else if (money == 0){
			System.out.println("0원은 입금할 수 없습니다.");
			return;
		}else {
			this.balance += money;
		}
	}
	
	public void withdraw(int money) {
		if(money < 0) {
			System.out.println("잘못된 금액입니다.");
			return;
		}else if(money == 0) {
			System.out.println("0원은 출금할 수 없습니다.");
			return;
		}else if(money > this.balance) {
			System.out.println("현재 잔고보다 많은 금액입니다.");
			return;
		}else {
			this.balance -= money;
		}
	}
	
}
