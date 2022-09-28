
public class ProductManager {
	
	public ProductManager() {
		System.out.println("Yapıcı Blok Çalıştı");
		
	}
	public void add(Product product) {
		System.out.println(product.getName() + " ürün ağacına eklendi");
	}
}
