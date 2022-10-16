package PolymorphismDemo;

public class Main {

	public static void main(String[] args) {
	/*
		BaseLogger [] loggers = new BaseLogger [] {new FileLogger(),new DatabaseLogger(),new EmailLogger()};
		
		for(BaseLogger i : loggers) {
			i.Log("EKLENDÝ.");
		}
		*/
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}
	
}
