package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import euler.CountingSundays;

import org.junit.jupiter.api.Test;

class CountingSundaysTest {

	@Test
	void getNumberOfSundaysOnThe1stTest() {
		LocalDate startDate = LocalDate.of(1900, 1, 1);
		LocalDate endDate = LocalDate.of(1900, 10, 1);
		assertEquals(2, CountingSundays.getNumberOfSundaysOnThe1st(startDate, endDate));
	}
	
	@Test
	void getNumberOfSundaysOnThe1stProblem() {
		LocalDate startDate = LocalDate.of(1901, 1, 1);
		LocalDate endDate = LocalDate.of(2000, 12, 31);
		assertEquals(171, CountingSundays.getNumberOfSundaysOnThe1st(startDate, endDate));
	}

}
