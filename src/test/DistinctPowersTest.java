package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import euler.DistinctPowers;

class DistinctPowersTest {

	@Test
	void findNumberOfDistinctTermsBasicTest() {
		//assertEquals(15, DistinctPowers.findNumberOfDistinctTerms(5));
	}
	
	@Test
	void findNumberOfDistinctTermsProblemTest() {
		assertEquals(422, DistinctPowers.findNumberOfDistinctTerms(100));
	}

}
