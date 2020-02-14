package test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import euler.FibonacciNumber1000;

import org.junit.jupiter.api.Test;

class FibonacciNumber1000Test {

	@Test
	void findFirstNDigitFibonacciNumberTest() {
		assertEquals(12, FibonacciNumber1000.findFirstNDigitFibonacciNumber(3));
	}
	
	@Test
	void findFirstNDigitFibonacciNumberProblem() {
		assertEquals(4782, FibonacciNumber1000.findFirstNDigitFibonacciNumber(1000));
	}

}
