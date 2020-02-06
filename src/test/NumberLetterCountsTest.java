package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NumberLetterCounts;

import org.junit.jupiter.api.Test;

class NumberLetterCountsTest {

	@Test
	void test() {
		assertEquals(19, NumberLetterCounts.getNumberLetterCounts(1000));
	}

}
