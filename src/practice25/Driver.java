package practice25;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("プレイヤーを入力してください。");
		System.out.println("1:CD 2:DVD");
		int player=sc.nextInt();
		
		if(player==1) {
			System.out.println("タイトルを入力してください。");
			String mediaName=sc.next();
			CDPlayer cd=new CDPlayer();
			cd.setMediaName(mediaName);
			cd.play(cd);
		}else if(player==2){
			System.out.println("タイトルを入力してください。");
			String mediaName=sc.next();
			DVDPlayer dvd=new DVDPlayer();
			dvd.setMediaName(mediaName);
			dvd.play(dvd);
		}else {
			System.out.println("無効な入力です");
			System.exit(0);
		}
		
		
		

	}

}
