package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LargestPrimeFactor;

import org.junit.jupiter.api.Test;

class LargestPrimeFactorTest {

	@Test
	void findLargestPrimeFactorSimpleTest() {
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorSimple(13195));
	}
	
	@Test
	void findLargestPrimeFactorDPTest() {
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorDP(13195));
	}

}
