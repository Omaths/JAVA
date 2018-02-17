package bankaccountapp;

public abstract class Account implements IBaseRate {

	//List Common between savings and checking account
	String name;
	String sSN;
	double balence;
	String accountNumber;
	double rate;
	static int index = 00001;
	
	
	
	//Constructor
	public Account(String name, String sSN, double initDeposit) {
	
		this.name = name;
		this.sSN = sSN;
		balence = initDeposit;
		
		index++;
		
		//Seet account Name
		this.accountNumber = setAccountNumber();
		
		
	}
	private String setAccountNumber() {
		//take just last two number of social security Number.
		//String lastSSN = sSN.substring(sSN.length()-2, sSN.length());
		String lastSSN = sSN.substring(1, sSN.length());
		/*String uniqueID = String.format("%05d", index);
		int randomNumber = (int) (Math.random()*Math.pow(10, 3));
		return lastSSN + uniqueID + randomNumber;*/
		return lastSSN;
	}
	//Common methods
	
	public void showInfo() {
		System.out.println("Name: "+name+
				"\nAccount: "+sSN+
				"\nBALENCE: "+balence+
				"\nNumber Account: "+accountNumber);
		
	}
	
}
