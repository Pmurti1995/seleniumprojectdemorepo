package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		HdfcBank b = new HdfcBank();
		b.credit();
		b.debit();
		b.loan();  //overriden method
		b.funds();  //nonoverriden method
		
		Bank b1 = new HdfcBank();
		b1.credit();
		b1.debit();
		b1.loan();
		//b1.funds //not possible because b1 is reference of bank class
		 
		//Bank b2 = new Bank //we cannot create object of abstract class
		
	}

}
