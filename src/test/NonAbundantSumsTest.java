package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NonAbundantSums;

import org.junit.jupiter.api.Test;

class NonAbundantSumsTest {

	@Test
	void test() {
		assertEquals(1, NonAbundantSums.findNonAbundantSum());
	}

}
