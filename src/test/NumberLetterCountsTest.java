package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NumberLetterCounts;

import org.junit.jupiter.api.Test;

class NumberLetterCountsTest {

	@Test
	void test() {
		assertEquals(19, NumberLetterCounts.getNumberLetterCounts(5));
	}

	@Test
	void getNumberOfLettersTest() {
		assertEquals(9, NumberLetterCounts.getNumberOfLetters(17));
		assertEquals(8, NumberLetterCounts.getNumberOfLetters(19));
		assertEquals(6, NumberLetterCounts.getNumberOfLetters(20));
		assertEquals(9, NumberLetterCounts.getNumberOfLetters(21));
	}
}
