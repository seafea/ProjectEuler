package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.AmicableNumbers;

import org.junit.jupiter.api.Test;

class AmicableNumbersTest {

	@Test
	void findSumOfAmicableNumbersUnderNTest() {
		assertEquals(8442, AmicableNumbers.findSumOfAmicableNumbersUnderN(2925));
	}
	
	@Test
	void findSumOfAmicableNumbersUnderNProblemTest() {
		assertEquals(10, AmicableNumbers.findSumOfAmicableNumbersUnderN(10000));
	}
	
	@Test
	void findSumOfProperDivisorsTest() {
		//assertEquals(284, AmicableNumbers.findSumOfProperDivisors(220));
	}
	
	@Test
	void isNumberAmicableTest() {
		//assertTrue(AmicableNumbers.isNumberAmicable(220));
		//assertTrue(AmicableNumbers.isNumberAmicable(284));
	}

}
