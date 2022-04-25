package practice14;

public class Account {
	private int accountNo;
	private String accountName;
	private int balance;
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo=accountNo;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName=accountName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public void print() {
		System.out.println("口座番号"+this.accountNo);
		System.out.println("口座名義"+this.accountName);
		System.out.println("残高"+this.balance);
	}

}
