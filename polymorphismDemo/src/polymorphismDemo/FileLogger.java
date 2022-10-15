package polymorphismDemo;

public class FileLogger implements BaseLogger{

	@Override
	public void log(String message) {
		
		System.out.println("File logger:"+ message);	
		
	}

}
