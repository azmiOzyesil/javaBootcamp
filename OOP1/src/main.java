
public class main {

	public static void main(String[] args) {

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		product1.setName("Anna Karenina 1");
		product2.setName("Anna Karenina 2");
		product3.setName("Anna Karenina 3");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");
		}
		System.out.println("<ul>");
	}
}
