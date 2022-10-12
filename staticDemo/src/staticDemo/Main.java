package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		
		product.id = 123456;
		product.name = "iPhone XR";
		product.price = 1599.9;
		
		productManager.add(product);
	}

}
