package practice06;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("金額１を入力してください");
		int price1=sc.nextInt();
		System.out.println("金額2を入力してください");
		int price2=sc.nextInt();
		
		System.out.println("結果");
		Tax tax=new Tax();
		System.out.println("金額１の消費税額"+tax.getTaxPrice(price1));
		System.out.println("金額2の消費税額"+tax.getTaxPrice(price2));

	}

}
