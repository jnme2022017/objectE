package practice10;

public class Tax {
	static double rate=0.05;
	
	static int getTaxPrice(int price) {
		return (int)(price*rate);
	}

}
