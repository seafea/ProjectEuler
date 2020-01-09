package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LargestProductInASeries;	


import org.junit.jupiter.api.Test;

class LargstProductInASeriesTest {

	@Test
	void findLargestProductInASeriesTest() {
		assertEquals(5832, LargestProductInASeries.findLargestProductInSeries(4));
	}

}
