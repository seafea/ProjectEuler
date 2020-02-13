package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NamesScores;

import org.junit.jupiter.api.Test;

class NamesScoresTest {

	@Test
	void findNamesScoresTotalTest() {
		assertEquals(871198282, NamesScores.findNamesScoresTotal());
	}
	
}
