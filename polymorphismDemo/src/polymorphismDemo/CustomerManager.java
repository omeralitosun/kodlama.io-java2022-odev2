package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}
	public void add() {
		System.out.println("Müşteri Eklendi");
		logger.log("Müşteri eklendi");
	}
}
