package interfaces;

public class Main {

	public static void main(String[] args) {
		//Oracle
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
		//MySql
		customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();

	}

}
