package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import euler.DigitFifthPowers;

class DigitFifthPowersTest {

	@Test
	void findSumOfDigitsBasicTest() {
		assertEquals(19316, DigitFifthPowers.findSumOfDigits(4));
	}
	
	@Test
	void findSumOfDigitsProblemTest() {
		assertEquals(443839, DigitFifthPowers.findSumOfDigits(5));
	}

}
