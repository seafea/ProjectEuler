package test;

import static org.junit.jupiter.api.Assertions.*
import euler.NthPrime;

import org.junit.jupiter.api.Test;

class NthPrimeTest {

	@Test
	void test() {
		assertEquals(13, NthPrime.getNthPrime(6));
	}

}
