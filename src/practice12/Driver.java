package practice12;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("商品番号を入力してください");
		int productNo=sc.nextInt();
		System.out.println("商品名を入力してください");
		String productName=sc.next();
		System.out.println("単価を入力してください");
		int unitPrice=sc.nextInt();
		//インスタンス生成
		Product product=new Product();
		//セッター使用
		product.setProductNo(productNo);
		product.setProductName(productName);
		product.setUnitPrice(unitPrice);
		//ゲッター使用
		System.out.println("結果");
		System.out.println("商品番号："+product.getProductNo());
		System.out.println("商品名："+product.getProductName());
		System.out.println("単価："+product.getUnitPrice());
		

	}

}
