package practice01;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("社員番号を入力してください");
		int emp=sc.nextInt();
		System.out.println("社員名を入力してください");
		String Name=sc.next();
		
		System.out.println("結果");
		Employee employee=new Employee();

	}

}
