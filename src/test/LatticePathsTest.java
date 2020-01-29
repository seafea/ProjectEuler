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
		assertEquals(6, LatticePaths.findLatticePathsNaive(20));
	}

}
