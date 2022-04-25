package practice13;

public class Product {
	private int productNo;
	private String productName;
	private int unitPrice;
	
	public int getProductNo() {
		return productNo;
	}	
	
	public String getProductName() {
		return productName;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(int unitPrice) {
		this.unitPrice=unitPrice;
	}
	
	Product(int productNo,String productName){
		this.productNo=productNo;
		this.productName=productName;
	}
	
	int getSalePrice() {
		return (int)(unitPrice*0.5);
	}

}
