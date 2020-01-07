package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LargestPalindromeProduct;

import org.junit.jupiter.api.Test;

class LargestPalindromProductTest {

	@Test
	void findLargestPalindromeTest() {
		assertEquals(906609, LargestPalindromeProduct.findLargestPalindromeSimple());
	}

}
