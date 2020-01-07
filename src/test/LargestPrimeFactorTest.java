package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LargestPrimeFactor;

import org.junit.jupiter.api.Test;

class LargestPrimeFactorTest {

	@Test
	void findLargestPrimeFactorSimpleTestSmall() {
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorSimple(13195));
	}
	
	@Test
	void findLargestPrimeFactorSimpleTestLarger2() {
		assertEquals(5,LargestPrimeFactor.findLargestPrimeFactorSimple(90000000000000L));
	}
	
	@Test
	void findLargestPrimeFactorSimpleTestVeryLarge() {
		assertEquals(6857 ,LargestPrimeFactor.findLargestPrimeFactorSimple(600851475143L));
	}
	
	@Test
	void findLargestPrimeFactorDPTestSmall() {
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorDP(13195));
	}
	
	@Test
	void findLargestPrimeFactorDPTestLarger2() {
		assertEquals(5,LargestPrimeFactor.findLargestPrimeFactorDP(90000000000000L));
	}
	
	@Test
	void findLargestPrimeFactorDPTestVeryLarge() {
		assertEquals(6857 ,LargestPrimeFactor.findLargestPrimeFactorDP(600851475143L));
	}
	
	@Test
	void findLargestPrimeFactorWorstTestSmall()
	{
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorWorst(13195));
	}
	
	@Test
	void findLargestPrimeFactorDivisionTestSmall() {
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorDivision(13195));
	}
	
	@Test
	void findLargestPrimeFactorDivisionTestLarger2() {
		assertEquals(5,LargestPrimeFactor.findLargestPrimeFactorDivision(90000000000000L));
	}
	
	@Test
	void findLargestPrimeFactorDivisionTestVeryLarge() {
		assertEquals(6857 ,LargestPrimeFactor.findLargestPrimeFactorDivision(600851475143L));
	}

}
