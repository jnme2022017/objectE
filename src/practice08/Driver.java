package practice08;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("商品番号1を入力してください");
		int productNo1=sc.nextInt();
		System.out.println("商品名1を入力してください");
		String productName1=sc.next();
		System.out.println("単価1を入力してください");
		int unitPrice1=sc.nextInt();
		System.out.println("在庫数1を入力してください");
		int stock1=sc.nextInt();
		
		Product product1=new Product(productNo1);
		product1.productName=productName1;
		product1.unitPrice=unitPrice1;
		product1.stock=stock1;
		
		System.out.println("商品番号2を入力してください");
		int productNo2=sc.nextInt();
		System.out.println("商品名2を入力してください");
		String productName2=sc.next();
		System.out.println("単価2を入力してください");
		int unitPrice2=sc.nextInt();
		System.out.println("在庫数2を入力してください");
		int stock2=sc.nextInt();
		
		Product product2=new Product(productNo2,productName2);
		product2.unitPrice=unitPrice2;
		product2.stock=stock2;
		
		System.out.println("商品番号3を入力してください");
		int productNo3=sc.nextInt();
		System.out.println("商品名3を入力してください");
		String productName3=sc.next();
		System.out.println("単価3を入力してください");
		int unitPrice3=sc.nextInt();
		System.out.println("在庫数3を入力してください");
		int stock3=sc.nextInt();
		
		Product product3=new Product(productNo3,productName3,unitPrice3);
		product3.stock=stock2;
		
		System.out.println("結果");
		System.out.println("商品番号1："+product1.productNo);
		System.out.println("商品名1："+product1.productName);
		System.out.println("単価１："+product1.unitPrice);
		System.out.println("在庫数1："+product1.stock);
		
		System.out.println("商品番号2："+product2.productNo);
		System.out.println("商品名2："+product2.productName);
		System.out.println("単価2："+product2.unitPrice);
		System.out.println("在庫数2："+product2.stock);
		
		System.out.println("商品番号3："+product3.productNo);
		System.out.println("商品名3："+product3.productName);
		System.out.println("単価3："+product3.unitPrice);
		System.out.println("在庫数3："+product3.stock);
	}

}
