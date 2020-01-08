package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.SmallestMultiple;

import org.junit.jupiter.api.Test;

class SmallestMultipleTest {

	@Test
	void findSmallestMultipleSmallerTest() {
		assertEquals(2520, SmallestMultiple.findSmallestMultiple(10));
	}
	
	@Test
	void findSmallestMultipleLargerTest() {
		assertEquals(232792560, SmallestMultiple.findSmallestMultiple(20));
	}

}
