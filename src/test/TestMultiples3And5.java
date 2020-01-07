package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.Multiples3And5;

import org.junit.jupiter.api.Test;

class TestMultiples3And5 {

	@Test
	void Multiples3And5SimpleTest() {
		assertEquals(3, Multiples3And5.Multiples3And5Simple(4));
		assertEquals(23, Multiples3And5.Multiples3And5Simple(10));
		assertEquals(233168, Multiples3And5.Multiples3And5Simple(1000));
	}
	
	@Test
	void Multiples3And5BetterTest() {
		assertEquals(3, Multiples3And5.Multiples3And5Alt(4));
		assertEquals(23, Multiples3And5.Multiples3And5Alt(10));
		assertEquals(233168, Multiples3And5.Multiples3And5Alt(1000));
	}

}
