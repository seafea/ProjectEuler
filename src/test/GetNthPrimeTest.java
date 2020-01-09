package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NthPrime;

import org.junit.jupiter.api.Test;

class GetNthPrimeTest {

	@Test
	void getNthPrimeSmallTest() {
		assertEquals(13, NthPrime.getNthPrime(6));
	}
	
	@Test
	void getNthPrimeLargerTest() {
		assertEquals(104743, NthPrime.getNthPrime(10001));
	}
	
	@Test
	void getNthPrimeSmallAwfulTest() {
		assertEquals(13, NthPrime.getNthPrimeAwful(6));
	}
	
	@Test
	void getNthPrimeSmallAwfulLargerTest() {
		assertEquals(104743, NthPrime.getNthPrimeAwful(10001));
	}

}
