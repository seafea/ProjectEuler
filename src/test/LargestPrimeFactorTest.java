package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LargestPrimeFactor;

import org.junit.jupiter.api.Test;

class LargestPrimeFactorTest {

	@Test
	void findLargestPrimeFactorSimpleTest() {
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorSimple(13195));
		assertEquals(6857 ,LargestPrimeFactor.findLargestPrimeFactorSimple(600851475143L));
	}
	
	@Test
	void findLargestPrimeFactorDPTest() {
		assertEquals(29,LargestPrimeFactor.findLargestPrimeFactorDP(13195));
	}

}
