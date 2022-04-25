package practice23;

public class Driver {

	public static void main(String[] args) {
		CDPlayer cdplayer=new CDPlayer();
		cdplayer.setMediaName("ラブマシーン");
		cdplayer.play();
		
		DVDPlayer dvdplayer=new DVDPlayer();
		dvdplayer.setMediaName("ラブマシーン");
		dvdplayer.play();

	}

}
