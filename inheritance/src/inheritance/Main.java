package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer myCustomer = new Customer();
		Employee myEmployee = new Employee();
		
		CustomerManager mycCustomerManager = new CustomerManager();
		EmployeeManager myeEmployeeManager = new EmployeeManager();
		
		myCustomer.firstName = "Reha";
		myEmployee.firstName = "Taha";
		
		mycCustomerManager.add();
		myeEmployeeManager.bestEmployee();
	}

}
