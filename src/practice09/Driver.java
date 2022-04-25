package practice09;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Store store1=new Store();
		System.out.println("店舗名1を入力してください");
		store1.storeName=sc.next();
		System.out.println("売上金額１を入力してください");
		store1.sales=sc.nextInt();
		
		Store.totalSales+=store1.sales;
		
		Store store2=new Store();
		System.out.println("店舗名2を入力してください");
		store2.storeName=sc.next();
		System.out.println("売上金額2を入力してください");
		store2.sales=sc.nextInt();
		Store.totalSales+=store2.sales;
		
		Store store3=new Store();
		System.out.println("店舗名3を入力してください");
		store3.storeName=sc.next();
		System.out.println("売上金額3を入力してください");
		store3.sales=sc.nextInt();
		Store.totalSales+=store3.sales;
		
		
		System.out.println("結果");
		System.out.println("店舗名1："+store1.storeName);
		System.out.println("売上金額1："+store1.sales);
		System.out.println("店舗名2："+store2.storeName);
		System.out.println("売上金額2："+store2.sales);
		System.out.println("店舗名3："+store3.storeName);
		System.out.println("売上金額3："+store3.sales);
		System.out.println("総売上金額："+Store.totalSales);

	}

}
