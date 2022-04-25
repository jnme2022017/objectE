package practice17;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("口座番号を入力してください");
		int accountNo=sc.nextInt();
		System.out.println("口座名義を入力してください");
		String accountName=sc.next();
		System.out.println("残高を入力してください");
		int balance=sc.nextInt();
		
		NetAccount netaccount=new NetAccount();
		netaccount.setAccountNo(accountNo);
		netaccount.setAccountName(accountName);
		netaccount.setBalance(balance);
		netaccount.print();

	}

}
