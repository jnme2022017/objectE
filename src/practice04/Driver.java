package practice04;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("カード所有者を入力してください");
		String userName=sc.next();
		
		Card card=new Card();
		card.point=0;
		System.out.println("現在のポイント："+card.point);
		System.out.println("追加ポイントを入力してください");
		int point=sc.nextInt();
		card.addPoint(point);
		System.out.println("現在のポイント："+card.point);
		
		System.out.println("追加ポイントを入力してください");
		int point2=sc.nextInt();
		card.addPoint(point2);
		System.out.println("現在のポイント："+card.point);

	}

}
