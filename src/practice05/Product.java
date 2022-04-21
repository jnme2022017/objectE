package practice05;

public class Product {
	String productName;
	int unitPrice;
	double rate=0.20;
	
	int getSalePrise() {
		unitPrice*=(1+rate);
		return unitPrice;
	}
}
