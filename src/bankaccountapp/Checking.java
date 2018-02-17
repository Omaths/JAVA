package bankaccountapp;

public class Checking extends Account {
	
	//list specifics to checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	//Constructor
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2"+accountNumber;
		setDebitCard();

	}
	
	//Checking methods
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your checking account features: "+
				"\n Card Number: "+debitCardNumber+
				"\n Card PIN: "+debitCardPIN);
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()*.15;
	}
	
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10,12));
		debitCardPIN = (int)(Math.random() * Math.pow(10,4));
	}
	
	
}
