package practice20;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("数字を入力してください");
		int x=scanner.nextInt();
		try {
			int doubleResult=toDouble(x);
			System.out.println("2倍した値："+doubleResult);
		}catch(Exception e) {
			e.printStackTrace();
		}
		int squareResult=toSquare(x);
		System.out.println("2乗した値："+squareResult);
	}
	
	public static int toDouble(int x) throws Exception{
		if(x==0) {
			throw new Exception("x=0");
		}
		return x;
	}
	
	public static int toSquare(int x) {
		if (x == 0) {
            throw new RuntimeException("x=0");
        }
		return x*x;
	}

}
