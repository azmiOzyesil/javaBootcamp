package classes;

public class main {

	public static void main(String[] args) {
		CustomerManager myCustomerManager = new CustomerManager();
		CustomerManager my2CustomerManager = new CustomerManager();
		
		myCustomerManager = my2CustomerManager;
		
		myCustomerManager.customerAdd("Azmi Özyeşil");
		myCustomerManager.customerUpdate("Azmi Özyeşil", "Nuri DEMİROĞ");
		myCustomerManager.customerDelete("Nuri DEMİROĞ");
	}

}