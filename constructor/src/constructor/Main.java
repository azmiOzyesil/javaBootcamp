package constructor;

public class Main {

	public static void main(String[] args) {
		//Product myProduct = new Product();
		
		ProductManager myproProductManager = new ProductManager();
		Product myProduct = new Product(123456, "iPhone 14", "1TB - Gold", 1599, 9999, "Gold");

		myproProductManager.add(myProduct);
	}

}
