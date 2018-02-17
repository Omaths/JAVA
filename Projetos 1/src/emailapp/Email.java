package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int passwordLength = 10;
	private String alternativeEmail;
	private String department;
	private int capacity = 500;
	
	public String getPassword() {
		return password;
	}
	public String getAlternativeEmail() {return alternativeEmail;}
	public int getCapacity() {return capacity;}
	public void setPassword(String password) {this.password = password;}
	public void setAlternativeEmail(String alternativeEmail) {this.alternativeEmail = alternativeEmail;	}
	public void setCapacity(int capacity) {this.capacity = capacity;}
	//Construct to recive the first and last nam
	public Email(String firstName, String lastName) {
		//Using "this" the referenced variable is the class and not the local
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Generate the random password
		this.password = RandomPassword(passwordLength);
		System.out.println("Your new password is: "+this.password);
		//Call a method calling method asking the department^
		this.department = setDepartment();
		System.out.println("O departamento escolhido foi "+this.department);
		//Email
		if(this.department.isEmpty()) {
			this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@company.com.br";
		} else {
			this.email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+".company.com.br";
		}
		
		System.out.println(this.email);
	}
	//Ask for the department
	private String setDepartment () {
		System.out.print("Hi, please tell us which department is this emplyee\n 1-Sales \n 2-Development \n 3-Accounting \n 4-None\n");
		Scanner lendo = new Scanner(System.in);
		int depChoice = lendo.nextInt();
		if(depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "development";}
		else if (depChoice == 3) {return "accounting";}
		else {return "";}
	}
	//Generate a Radom password
	private String RandomPassword(int tamanho) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXZ1234567890@$%";
		char[] password = new char[tamanho];
		for(int i=0; i<tamanho; i++) {
			//here, we make sure that rand is equal a random number in the length string passwordSet
			int rand = (int) (Math.random()*passwordSet.length());
			//Get a char at passwordSet and put in vector
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	//Set the capacity of the email
	//Set the alternative email
	//Change the password
}
