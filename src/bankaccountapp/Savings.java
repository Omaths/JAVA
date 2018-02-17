package bankaccountapp;

public class Savings extends Account {
	//list specifics to savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	
	//Constructor (dont have "void")	
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1"+accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	//Saving methods
	public void showinfo() {
		super.showInfo();
		System.out.println(" Your savings account features: "
				+ "\n Safety Deposit Box ID: "+safetyDepositBoxID+
				"\n Safety Deposit Box Key: "+safetyDepositBoxKey);
	}
	
	

}
