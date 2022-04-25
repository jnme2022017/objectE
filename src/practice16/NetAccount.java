package practice16;

public class NetAccount extends Account {
	
	public void print() {
		System.out.println("インターネット口座");
		System.out.println("口座番号"+getAccountNo());
		System.out.println("口座名義"+getAccountName());
		System.out.println("残高"+getBalance());
	}

}
