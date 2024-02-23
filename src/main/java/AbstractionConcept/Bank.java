package AbstractionConcept;

public abstract class Bank {
	
	//partial abstraction
    //hiding the implementation details - abstraction
	//abs class can have abstract as well as non abs methods
	//we cannot create object of abstract class
	 
	public abstract void loan(); //no method body

	
	//non abstract methods
	public void credit() {
		System.out.println("Bank--credit");
		
		
	}
	public void debit() {
		System.out.println("Bank--debit");
		
		
	}
	 
	
	

}
