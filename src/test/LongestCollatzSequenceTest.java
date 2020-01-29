package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.LongestCollatzSequence;

import org.junit.jupiter.api.Test;

class LongestCollatzSequenceTest {

	@Test
	void test() {
		assertEquals(10, LongestCollatzSequence.findLongestChainUnderXNaive(1000000));
	}

}
