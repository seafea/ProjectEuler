package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.HighlyDivisibleTriangularNumber;

import org.junit.jupiter.api.Test;

class HighlyDivisibleTriangularNumberTest {

	@Test
	void findHighlyDivisibleTriangeNumbersTestSmall() {
		assertEquals(28, 
				HighlyDivisibleTriangularNumber.findHighlyDivisibleTriangularNumber(
						5));
	}
	
	@Test
	void findHighlyDivisibleTriangeNumbersTestProblem() {
		assertEquals(76576500, 
				HighlyDivisibleTriangularNumber.findHighlyDivisibleTriangularNumber(
						500));
	}

}
