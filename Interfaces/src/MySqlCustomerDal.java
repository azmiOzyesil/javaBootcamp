
public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("Added in My SQL Database");
	}

}
