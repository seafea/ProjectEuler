package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.ReciprocalCycles;

import org.junit.jupiter.api.Test;

class ReciprocalCyclesTest {

	@Test
	void findDenominatorWithLongestRecurringCycleUnderNTest() {
		assertEquals(7, 
				ReciprocalCycles.
				findDenominatorWithLongestRecurringCycleUnderN(10));
	}
	
	@Test
	void findDenominatorWithLongestRecurringCycleUnderNProblemTest() {
		assertEquals(983, 
				ReciprocalCycles.
				findDenominatorWithLongestRecurringCycleUnderN(1000));
	}
}
