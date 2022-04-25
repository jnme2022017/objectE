package practice21;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("口座番号を入力してください");
		int accountNo=sc.nextInt();
		System.out.println("残高を入力してください");
		int addBalance=sc.nextInt();
		Account account=new Account(accountNo);
		try {
			account.addBalance(addBalance);
		}catch(IllegalDebidException e) {
			e.printStackTrace();
			System.out.println("不正な貯金額が入力されました");
            return;
		}
		System.out.println("結果");
		System.out.println("口座番号："+account.getAccountNo());
		System.out.println("残高："+account.getBalance());
		
	}

}
