package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.EvenFibonacciNumbers;

import org.junit.jupiter.api.Test;

class EvenFionacciNumbersTest {

	@Test
	void FindSumOfEvenFibonacciNumbersSimpleTest() {
		assertEquals(44, EvenFibonacciNumbers.findSumOfEvenFibonacciNumbersSimple(90));
		assertEquals(4613732, EvenFibonacciNumbers.findSumOfEvenFibonacciNumbersSimple(4000000));
	}
	@Test
	void FindSumOfEvenFibonacciNumbersSieveTest() {
		assertEquals(44, EvenFibonacciNumbers.findSumOfEvenFibonacciNumbersSieve(90));
		assertEquals(4613732, EvenFibonacciNumbers.findSumOfEvenFibonacciNumbersSieve(4000000));
	}

}
