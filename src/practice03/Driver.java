package practice03;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("社員番号を入力してください");
		int empNo=sc.nextInt();
		System.out.println("社員名を入力してください");
		String empName=sc.next();
		
		System.out.println("結果");
		Employee employee=new Employee();
		employee.empNo=empNo;
		employee.empName=empName;
		
		employee.print();

	}

}
