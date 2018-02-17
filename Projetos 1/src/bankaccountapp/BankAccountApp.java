package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		/*Checking savaccount = new Checking("maths","333333",300);
		 savaccount.showInfo();*/
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Matheus\\Curso Prog Web\\NewBankAccounts.csv";
		//We recive a LikedList, that means a list with lik to another list,
		//so to print this we have to use foreach.
		List<String[]> newCostumers = utilities.CSV.read(file);
		
		for(String[]account : newCostumers) {
			String name = account[0];
			String sSN = account[1];
			String accountType = account[2];
			double initDeposit = Double.parseDouble(account[3]);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,sSN, initDeposit));
			}else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name,sSN, initDeposit));
			}else {
				System.out.println("Error to read Account Type.");
			}
			
		}
		
		//accounts.get(5).showInfo();
		for(Account acc : accounts) {
			System.out.println("__________\n");
			acc.showInfo();
		}
		accounts.get((int) Math.random()*accounts.size()).deposit(400);
		accounts.get((int) Math.random()*accounts.size()).withDraw(250);
		
		
	}

}
