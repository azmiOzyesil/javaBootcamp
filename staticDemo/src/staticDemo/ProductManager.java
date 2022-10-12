package staticDemo;

public class ProductManager {
	public void add(Product product) {
		// ProductValidator validator = new ProductValidator();
		if (ProductValidator.isValid(product))
			System.out.println("'" + product.name + "' ürün ağacına eklendi");
		else
			System.out.println("Hata - Fiyat veya isim bilgisi eksik");
	}

}
