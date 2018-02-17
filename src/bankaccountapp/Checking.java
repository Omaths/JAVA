package bankaccountapp;

public class Checking extends Account {
	
	//list specifics to checking account
	int debitCardNumber;
	int debitCardPIN;
	
	//Constructor
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2"+accountNumber;
		setDebitCard();
	}
	
	//Checking methods
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10,12));
		debitCardPIN = (int)(Math.random() * Math.pow(10,4));
	}
	
	public void showinfo() {
		super.showInfo();
		System.out.println(" Your checking account features: "+
				"\n Card Number: "+debitCardNumber+
				"\n Card PIN: "+debitCardPIN);
	}
}
