package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import euler.SumSquareDifference;

class SumSquareDifferenceTest {

	@Test
	void findSumSquareDifferenceTest() {
		assertEquals(2640, SumSquareDifference.findSumSquareDifference(10));
	}
	
	@Test
	void findSumSquareDifferenceBetterTest() {
		assertEquals(2640, SumSquareDifference.findSumSquareDifferenceBetter(10));
	}
	
	@Test
	void findSumSquareDifferenceLargerTest() {
		assertEquals(25164150, SumSquareDifference.findSumSquareDifference(100));
	}
	
	@Test
	void findSumSquareDifferenceBetterLargerTest() {
		assertEquals(25164150, SumSquareDifference.findSumSquareDifferenceBetter(100));
	}
	
	

}
