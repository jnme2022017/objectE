package practice11;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//数値入力
		Scanner sc=new Scanner(System.in);
		System.out.println("金額を入力してください");
		int price=sc.nextInt();
		//結果表示
		System.out.println("結果");
		System.out.println("金額の消費税額："+Tax.getTaxPrice(price));
		
		

	}

}
