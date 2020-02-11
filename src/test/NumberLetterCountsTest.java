package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NumberLetterCounts;

import org.junit.jupiter.api.Test;

class NumberLetterCountsTest {

	@Test
	void getNumberLetterCountsTest() {
		assertEquals(19, NumberLetterCounts.getNumberLetterCounts(5));
	}
	
	@Test
	void getNumberLetterCounts() {
		assertEquals(21124, NumberLetterCounts.getNumberLetterCounts(1000));
	}

	//@Test
	//void getNumberOfLettersTest() {
		//assertEquals(9, NumberLetterCounts.getNumberOfLetters(17));
		//assertEquals(8, NumberLetterCounts.getNumberOfLetters(19));
		//assertEquals(6, NumberLetterCounts.getNumberOfLetters(20));
		//assertEquals(9, NumberLetterCounts.getNumberOfLetters(21));
		//assertEquals(10, NumberLetterCounts.getNumberOfLetters(57));
		//assertEquals(10, NumberLetterCounts.getNumberOfLetters(100));
		//assertEquals(22, NumberLetterCounts.getNumberOfLetters(117));
		//assertEquals(23, NumberLetterCounts.getNumberOfLetters(555));
		//assertEquals(11, NumberLetterCounts.getNumberOfLetters(1000));
	//}
}
