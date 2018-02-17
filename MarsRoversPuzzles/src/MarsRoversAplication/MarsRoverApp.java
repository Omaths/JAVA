package MarsRoversAplication;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class MarsRoverApp {

	public static void main(String[] args) {
		/*
		Rover robot = new Rover(5,5,1,2,'N');
		robot.toMove("LMLMLMLMM");
		System.out.println(robot.showPosition());*/
		
		List<Rover> robots = new LinkedList<Rover>();
		String file = "D:\\RoversSteps.txt";
		//File arq = new File("D:\\\\Rovers'Steps.txt");
		
		List<String[]> actionsToExecute = utilities.TEXT.read(file);
		
		for(String[] robot : actionsToExecute) {
		

		//System.out.println(robot[0].split("\n"));
			System.out.println(robot[1]);
			//System.out.println(robot[1]);
			
		}
		
	

	}

}
