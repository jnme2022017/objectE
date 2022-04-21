package practice05;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("商品名を入力してください");
		String productName=sc.next();
		System.out.println("単価を入力してください");
		int unitPrice=sc.nextInt();
		
		System.out.println("結果");
		System.out.println("商品名:"+productName);
		System.out.println("単価:"+unitPrice);
		Product product=new Product();
		product.unitPrice=unitPrice;
		System.out.println("税込価格:"+product.getSalePrise());
	}

}
