package MarsRoversAplicationTest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import MarsRoversAplication.Rover;


public class RoverTest {
	
	@Test
	public void mustToKnowWhichDirectionToMoveY() {
		Rover robot = new Rover(5,5,1,2,'N');
		robot.toMove("MMM");
		System.out.println(robot.getY());
		assertEquals(5,robot.getY());
	}
	
	@Test
	public void mustToKnowWhichDirectionToMoveX() {
		Rover robot = new Rover(-5,-5,-1,-2,'W');
		robot.toMove("MMMM");
		System.out.println(robot.getX());
		assertEquals(-5,robot.getX());
	}
	
	@Test 
	public void mustToKnowToWhichDirectionToChange() {
		Rover robot = new Rover(5,-5,1,-2,'W');
		robot.toMove("LRRRLLRRRLL");
		assertEquals('N',robot.getOrientation());
	}

}
