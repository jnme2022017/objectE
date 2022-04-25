package practice27;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("EAST,WEST,SOUTH,NORTHの何かを入力してください");
		String jname=sc.next();
		Direction di=Direction.valueOf (jname);
		System.out.println(di.getJname()+"が指定されました");

	}

}
