package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking accchek = new Checking("Maths Alves","123456789",1500);
		Savings accsav = new Savings("Eike Lucio", "987654321", 2800);
		
		accchek.showinfo();
		System.out.println("____________\n");
		accsav.showinfo();
		//Read a File and creat new account
	}

}
