package practice11;

public class Tax {
	static double rate;
	//スタティックイニシャライザ
	static {
		rate=0.05;
	}
	//スタティックメソッド
	static int getTaxPrice(int price) {
		return (int)(price*rate);
	}

}
