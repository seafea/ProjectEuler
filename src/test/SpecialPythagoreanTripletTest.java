package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.SpecialPythagoreanTriplet;

import org.junit.jupiter.api.Test;

class SpecialPythagoreanTripletTest {

	@Test
	void findSpecialPythagoreanTripletBasicTest() {
		assertEquals(60, SpecialPythagoreanTriplet.findSpecialPythagoreanTriplet(12));
	}
	
	@Test
	void findSpecialPythagoreanTripletBetterBasicTest() {
		assertEquals(60, SpecialPythagoreanTriplet.findSpecialPythagoreanTripletBetter(12));
	}
	
	@Test
	void findSpecialPythagoreanTripletProblemTest() {
		assertEquals(31875000, SpecialPythagoreanTriplet.findSpecialPythagoreanTriplet(1000));
	}
	
	@Test
	void findSpecialPythagoreanTripletBetterProblemTest() {
		assertEquals(31875000, SpecialPythagoreanTriplet.findSpecialPythagoreanTripletBetter(1000));
	}
}
