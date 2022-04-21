package practice02;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("社員番号1を入力してください");
			int emp1 = sc.nextInt();
			System.out.println("社員名1を入力してください");
			String Name1 = sc.next();
			
			System.out.println("社員番号2を入力してください");
			int emp2 = sc.nextInt();
			System.out.println("社員名2を入力してください");
			String Name2 = sc.next();
			
			System.out.println("社員番号3を入力してください");
			int emp3 = sc.nextInt();
			System.out.println("社員名3を入力してください");
			String Name3 = sc.next();
			
			System.out.println("結果");
			Employee employee1 = new Employee();
			employee1.empNos=emp1;
			employee1.empName=Name1;
			
			Employee employee2 = new Employee();
			employee2.empNos=emp2;
			employee2.empName=Name2;
			
			Employee employee3 = new Employee();
			employee3.empNos=emp3;
			employee3.empName=Name3;
			
			System.out.println("結果");
			System.out.println("社員番号1"+employee1.empNos);
			System.out.println("社員名1"+employee1.empName);
			System.out.println("社員番号2"+employee2.empNos);
			System.out.println("社員名2"+employee2.empName);
			System.out.println("社員番号"+employee3.empNos);
			System.out.println("社員名"+employee3.empName);

		}

}
