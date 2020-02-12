package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.FactorialDigitSum;

import org.junit.jupiter.api.Test;

class FactorialDigitSumTest {

	@Test
	void test() {
		assertEquals(27, FactorialDigitSum.findFactorialDigitSum(10));
	}

}
