
public class Main {

	public static void main(String[] args) {
		Product myProduct = new Product();
		ProductManager myproProductManager = new ProductManager();
		myProduct.setName("iPhone 14 Pro Max");
		myProduct.setDescription("1TB - Gold");
		myProduct.setPrice(1599);// $
		myProduct.setStockAmount(9999);
		myProduct.setId(123456);

		myproProductManager.add(myProduct);

	}

}
