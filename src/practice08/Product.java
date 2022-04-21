package practice08;

public class Product {
	int productNo;
	String productName;
	int unitPrice;
	int stock;

	Product(int pProductNo) {
		productNo=pProductNo;

	}

	Product(int pProductNo, String pProductName) {
		productNo=pProductNo;
		productName=pProductName;

	}

	Product(int pProductNo, String pProductName, int pUnitPrice) {
		productNo=pProductNo;
		productName=pProductName;
		unitPrice=pUnitPrice;

	}

}
