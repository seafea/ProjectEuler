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
		assertEquals(5832, LargestProductInASeries.findLargestProductInSeriesNoZeros(4));
	}
	
	@Test
	void findLargestProductInASeriesBestTest() {
		assertEquals(5832, LargestProductInASeries.findLargestProductInSeriesMinDigit(4));
	}
	
	@Test
	void findLargestProductInASeriesLargerTest() {
		assertEquals(23514624000L, LargestProductInASeries.findLargestProductInSeries(13));
	}
	
	@Test
	void findLargestProductInASeriesBetterLargerTest() {
		assertEquals(23514624000L, LargestProductInASeries.findLargestProductInSeriesNoZeros(13));
	}
	
	@Test
	void findLargestProductInASeriesBestLargerTest() {
		assertEquals(23514624000L, LargestProductInASeries.findLargestProductInSeriesNoZeros(13));
	}

	//@Test
	//void getSmallestPossibleDigitTest()
	//{
		//assertEquals(5, LargestProductInASeries.getSmallestPossibleDigit(4, 3645));
	//}
}
