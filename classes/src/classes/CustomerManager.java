package classes;

public class CustomerManager {

	public void customerAdd(String name) {
		System.out.println(name + " müşteri olarak eklendi");
	}

	public void customerDelete(String name) {
		System.out.println(name + " silindi");
	}

	public void customerUpdate(String name, String name2) {
		System.out.println(name + ", " + name2 + " olarak güncellendi");
	}

}
