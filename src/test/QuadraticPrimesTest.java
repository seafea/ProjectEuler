package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.QuadraticPrimes;

import org.junit.jupiter.api.Test;

class QuadraticPrimesTest {

	@Test
	void findProductOfCoefficientsWithSieveTest() {
		assertEquals(-59231, QuadraticPrimes.findProductOfCoefficientsWithSieve(1000, 71));
	}

	@Test 
	void findProductOfCoefficientsNaiveTest() {
		assertEquals(-59231, QuadraticPrimes.findProductOfCoefficientsNaive(1000));
	}
}
