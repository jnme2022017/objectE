package practice22;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("割られる数を入力してください");
		int x=sc.nextInt();
		System.out.println("割る数を入力して下さい");
		int y=sc.nextInt();
		try {
			int result=Calculator.divide(x, y);
			System.out.println("結果："+result);
		}catch(Exception e) {
			System.out.println("不正な数が入力されました");
			e.printStackTrace();
			return;
		}
	}

}
