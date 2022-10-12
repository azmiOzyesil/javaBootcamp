package constructor;

public class Product {

	public Product(int id, String name, String description, double price, int stoctAmount, String colour) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stoctAmount;
		this.colour = colour;
	}

	String name;
	String description;
	double price;
	int id;
	int stockAmount;
	String colour;
}
