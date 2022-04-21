package practice06;

public class Tax {
	double rate=0.05;
	
	int getTaxPrice(int price) {
		return (int) (price * rate);
	}
	int gettaxPrice(String price) {
		return (int) (Integer.parseInt(price)*rate);
	}

}
