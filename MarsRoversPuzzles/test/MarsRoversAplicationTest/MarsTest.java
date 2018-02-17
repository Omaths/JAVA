package MarsRoversAplicationTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import MarsRoversAplication.Mars;


public class MarsTest {

	@Test
	public void mustToKnowIfCoordanateIsInsideOfPlateau() {
		Mars plateau = new Mars(5,5);
		Assert.assertEquals(true, plateau.limit(1,3));	
	}
	@Test
	public void mustToKnowIfCoordanateIsOnTheLineOfPlateau() {
		Mars plateau = new Mars(5,5);
		
		assertTrue(plateau.limit(5, 1));		
		assertTrue(plateau.limit(5, 0));
		assertTrue(plateau.limit(0, 5));
		assertTrue(plateau.limit(5, 5));
		assertTrue(plateau.limit(0, 0));
	}	
	@Test
	public void mustToKnowIfCoordanateIsOutsideOfPlateau() {
		Mars plateau = new Mars(5,5);
		
		assertFalse(plateau.limit(6, 3));	
		
	}
}
