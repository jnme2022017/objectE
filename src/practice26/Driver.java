package practice26;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("走らせたいものを入力してください");
		System.out.println("1:人 2:車");
		int run=sc.nextInt();
		if(run==1) {
			Runner runner=new Human();
			runner.run();
		}else if(run==2) {
			Runner runner=new Car();
			runner.run();
		}
	}

}
