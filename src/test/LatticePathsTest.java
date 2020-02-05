package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import euler.LatticePaths;

class LatticePathsTest {

	@Test
	void findLatticePathsTest() {
		assertEquals(6, LatticePaths.findLatticePathsNaive(2));
	}
	
	@Test
	void findLatticePathsProblemTest() {
		assertEquals(137846528820L, LatticePaths.findLatticePathsNaive(20));
	}
	
	@Test
	void findLatticePathsIterativeTest()
	{
		assertEquals(6, LatticePaths.findLatticePathsIterative(2));
	}
	
	@Test
	void findLatticePathsIterativeProblemTest()
	{
		assertEquals(137846528820L, LatticePaths.findLatticePathsIterative(20));
	}

}
