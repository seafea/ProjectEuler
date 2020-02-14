package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NonAbundantSums;

import org.junit.jupiter.api.Test;

class NonAbundantSumsTest {

	@Test
	void findNonAbundantSumTest() {
		assertEquals(4179871, NonAbundantSums.findNonAbundantSum());
	}
	
	@Test
	void findNonAbundantSumWithSieveTest() {
		assertEquals(4179871, NonAbundantSums.findNonAbundantSumWithSieve());
	}

}
