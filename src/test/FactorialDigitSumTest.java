package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.FactorialDigitSum;

import org.junit.jupiter.api.Test;

class FactorialDigitSumTest {

	@Test
	void findFactorialDigitSumTest() {
		assertEquals(27, FactorialDigitSum.findFactorialDigitSum(10));
	}
	
	@Test
	void findFactorialDigitSumProblemTest() {
		assertEquals(648, FactorialDigitSum.findFactorialDigitSum(100));
	}

}
