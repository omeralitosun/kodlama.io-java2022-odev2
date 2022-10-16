package interfaces;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.add();
		
		customerDal = new MySqlCustomerDal();
		customerDal.add();

	}

}
