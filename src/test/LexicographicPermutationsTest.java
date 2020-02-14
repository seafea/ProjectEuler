package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LexicographicPermutations;

import org.junit.jupiter.api.Test;

class LexicographicPermutationsTest {

	@Test
	void findNthLexicographicPermutationTest() {
		assertEquals("210", LexicographicPermutations.findNthLexicographicPermutation(
				"012", 6));
	}
	
	@Test 
	void findNthLecicoraphicPermutationProblemTest()
	{
		assertEquals("2783915460", LexicographicPermutations.findNthLexicographicPermutation("0123456789", 1000000));
	}

}
