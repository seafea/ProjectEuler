package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LargestProductInASeries;	


import org.junit.jupiter.api.Test;

class LargstProductInASeriesTest {

	@Test
	void findLargestProductInASeriesTest() {
		assertEquals(5832, LargestProductInASeries.findLargestProductInSeries(4));
	}
	
	@Test
	void findLargestProductInASeriesBetterTest() {
		assertEquals(5832, LargestProductInASeries.findLargestProductInSeriesBetter(4));
	}
	
	@Test
	void findLargestProductInASeriesLargerTest() {
		assertEquals(5832, LargestProductInASeries.findLargestProductInSeries(13));
	}

}
