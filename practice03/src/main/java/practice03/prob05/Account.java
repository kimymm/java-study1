package practice03.prob05;

public class Account {
	private String accountNo;	
	private int balance = 0;
	
	
	public Account(String string) {
		this.accountNo = string;
		System.out.println(this.accountNo + " 계죄가 개설되었습니다.");
	}
	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


	public void save(int i) {
		this.balance += i;
		System.out.println(this.accountNo + " 계좌에 " + i+ "만원이 입금되었습니다.");
	}


	public void deposit(int i) {
		this.balance -= i;
		System.out.println(this.accountNo + " 계좌에 " + i + "만원이 출금되었습니다.");
	}

}
