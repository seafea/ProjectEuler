package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.NumberSpiralDiagonals;

import org.junit.jupiter.api.Test;

class NumberSpiralDiagonalsTest {

	@Test
	void findSumOfDiagonalsNaiveBasicTest() {
		assertEquals(25, NumberSpiralDiagonals.findSumOfDiagonalsNaive(3));
	}
	
	@Test
	void findSumOfDiagonalsNaiveSmallTest() {
		assertEquals(101, NumberSpiralDiagonals.findSumOfDiagonalsNaive(5));
	}
	
	@Test
	void findSumOfDiagonalsNaiveProblem() {
		assertEquals(669171001, NumberSpiralDiagonals.findSumOfDiagonalsNaive(1001));
	}
	
	@Test
	void findSumOfDiagonalsBasicTest() {
		assertEquals(25, NumberSpiralDiagonals.findSumOfDiagonals(3));
	}
	
	@Test
	void findSumOfDiagonalsSmallTest() {
		assertEquals(101, NumberSpiralDiagonals.findSumOfDiagonals(5));
	}
	
	@Test
	void findSumOfDiagonalsProblem() {
		assertEquals(669171001, NumberSpiralDiagonals.findSumOfDiagonals(1001));
	}
}
