package practice10;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("金額を入力してください");
		int price=sc.nextInt();
		int tax=Tax.getTaxPrice(price);
		System.out.println("結果");
		System.out.println("金額の消費税額："+tax);

	}

}
