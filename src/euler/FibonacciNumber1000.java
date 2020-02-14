package euler;

import java.math.BigInteger;
import java.util.ArrayList;

public class FibonacciNumber1000 {

	public static int findFirstNDigitFibonacciNumber(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		ArrayList<BigInteger> fibonacciNumbers = new ArrayList<BigInteger>(3);
		fibonacciNumbers.add(new BigInteger("1"));
		fibonacciNumbers.add(new BigInteger("1"));
		int index = 3;
		BigInteger newFibonacciNumber = fibonacciNumbers.get(0).add(fibonacciNumbers.get(1));
		while (newFibonacciNumber.toString().length() < n)
		{
			index++;
			fibonacciNumbers.set(0, fibonacciNumbers.get(1));
			fibonacciNumbers.set(1, newFibonacciNumber);
			newFibonacciNumber = fibonacciNumbers.get(0).add(fibonacciNumbers.get(1));
		}
		return index;
	}
}
