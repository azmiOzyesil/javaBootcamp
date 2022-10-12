
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new SqlServerManagerDal());
		
		customerManager.add();
	}

}
