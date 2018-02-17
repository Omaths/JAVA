package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// How many students do you want?
		
		System.out.println("Enter number of students to enroll");
		Scanner in = new Scanner(System.in);
		int auxiliar = in.nextInt();
		Student[] stud = new Student[auxiliar];
		
	    //Create n students
		
		for(int i=0; i<auxiliar; i++) {
			stud[i] = new Student();
			stud[i].enroll();
		}
		
		//Show Everithing, can use for
		
		System.out.println(stud[0].showStatus());	
		/*System.out.println(stud[1].showStatus());
		System.out.println(stud[2].showStatus());*/		

	}

}
