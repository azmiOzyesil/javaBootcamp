package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product myProduct = new Product();
		ProductManager myproProductManager = new ProductManager();
		myProduct.name = "iPhone 14 Pro Max";
		myProduct.description = "1TB - Gold";
		myProduct.price = 1599; // $
		myProduct.stockAmount = 9999;
		myProduct.id = 123456;

		myproProductManager.add(myProduct);
	}

}
