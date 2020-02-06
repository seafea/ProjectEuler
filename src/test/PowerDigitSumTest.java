package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.PowerDigitSum;

import org.junit.jupiter.api.Test;

class PowerDigitSumTest {

	@Test
	void findPowerDigitSumBasic() {
		assertEquals(26, PowerDigitSum.FindPowerDigitSum(15));
	}
	
	@Test
	void findPowerDigitSumProblem() {
		assertEquals(1366, PowerDigitSum.FindPowerDigitSum(1000));
	}

}
