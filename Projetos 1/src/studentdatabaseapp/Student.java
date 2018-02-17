package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private static int costOfCourse = 600;
	private int balence = 0;
	private String courses = null;
	private String idStudent;
	private static int id = 2018;
	private int auxiliar = 0;
	
	//Constructor, create n students
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter with a Student First Name\n");
		this.firstName = in.nextLine();
		
		System.out.print("Enter with a Student Last Name\n");
		this.lastName = in.nextLine();
		
		System.out.print("Select the student level\n1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior.\n");
		this.year = in.nextInt();
		
		SetIdStudent();
		System.out.println(idStudent);
		
	}
	//Generate ID
	private void SetIdStudent() {
		id++;
		this.idStudent = year+""+id;
	}
	//Enroll Courses
	public void enroll() {
		String course;
		
		do {
			System.out.println("Enter course to Enroll (Q to Quit).");
			Scanner in = new Scanner(System.in);
			course = in.nextLine();
			/*if(auxiliar == 0) { MUST TO ENROLL AT LIST ONE COURSE
				if(!course.equals("Q") && !course.equals("q")) {
					System.out.println("Must to enroll at list on one course");
					this.courses = course;
					this.balence = this.balence + this.costOfCourse;
					this.auxiliar = 1;
				}			
			}else {		*/
				if(!course.equals("Q") && !course.equals("q")) {
					if(this.courses==null) {
						this.courses = course;
					}
					else {
						this.courses = this.courses +"\n"+course;
					}					
					this.balence = this.balence + this.costOfCourse;
				}
				
				else {
					break;
				}
		    //}
		}while(1!=0);
		
		System.out.println(courses + "\n"+ balence);
	}
	//View Balence
	public void viewBalence() {
		System.out.println("Balance: "+this.balence);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalence();
		System.out.println("How many do you want to pay?");
		Scanner in = new Scanner(System.in);
		viewBalence();
	}
	
	//Show Status
	public String showStatus() {
	
		return "Name: "+firstName+" "+lastName+"\nEnrooled: "+courses+
				"\nBalence: "+balence;
	}
	
	
}
