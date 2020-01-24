package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.SummationOfPrimes;

import org.junit.jupiter.api.Test;

class SummationOfPrimesTest {

	@Test
	void test() {
		assertEquals(17, SummationOfPrimes.FindSummationOfPrimes(10));
		assertEquals(142913828922L,
				SummationOfPrimes.FindSummationOfPrimes(2000000));
	}

}
