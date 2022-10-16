package PolymorphismDemo;

public class CustomerManager {
	
	private BaseLogger baseLogger;
	
	

	public CustomerManager(BaseLogger baseLogger) {
		super();
		this.baseLogger = baseLogger;
	}



	public void add() {
		System.out.println("Müþteri eklendi.");
		this.baseLogger.log("Müþteriyi ... ekledi");
	}
}
