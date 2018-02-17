package bankaccountapp;

public abstract class Account implements IBaseRate {

	//List Common between savings and checking account
	private String name;
	private String sSN;
	private double balence;
	protected String accountNumber;
	protected double rate;
	static int index = 00001;
	
	
	
	//Constructor
	public Account(String name, String sSN, double initDeposit) {
	
		this.name = name;
		this.sSN = sSN;
		balence = initDeposit;
		
		index++;
		
		//Seet account Name
		this.accountNumber = setAccountNumber();
		setRate();
		
		
	}
	public void showInfo() {
		System.out.println("Name: "+name+
				"\nAccount: "+sSN+
				"\nBALENCE: "+balence+
				"\nNumber Account: "+accountNumber+
				"\nRate: "+ rate);
		
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
	public void deposit(double amount) {
		balence = balence + amount;
		System.out.println("Depositing: $"+amount);
		printBalence();
	}
	
	public void compound() {
		double accruedInterest = balence * (rate/100);
		balence = balence + accruedInterest;
		System.out.println("Acrued Interest: $"+accruedInterest);
		printBalence();
	}
	
	public void withDraw(double withDraw) {
		balence = balence - withDraw;
		System.out.println("Withdrawing: $");
		printBalence();
	}
	
	public void tranfer(String toWhere, double amount) {
		balence = balence - amount;
		System.out.println("Tranfering $"+amount+"To "+toWhere);
		printBalence();
	}
	
	public void printBalence() {
		System.out.println("Your balence is "+balence);
	}
	
	public abstract void setRate();
	

	
}
