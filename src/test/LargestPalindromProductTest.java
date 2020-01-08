package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LargestPalindromeProduct;

import org.junit.jupiter.api.Test;

class LargestPalindromProductTest {

	@Test
	void findLargestPalindromeSimpleTest() {
		assertEquals(906609, LargestPalindromeProduct.findLargestPalindromeSimple());
	}
	
	@Test
	void findLargestPalindromeTopDownTest() {
		assertEquals(906609, LargestPalindromeProduct.findLargestPalindromeTopDown());
	}
}
