package euler;

import java.util.ArrayList;

public class Multiples3And5 {

	/**
	 * 
	 * If we list all the natural numbers below 10 that 
	 * are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of 
	 * these multiples is 23.
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 * 
	 */
	public static int Multiples3And5Simple(int maxNum)
	{
		int sumOfMultiples3And5 = 0;
		for (int i = 3; i < maxNum; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
				sumOfMultiples3And5 += i;
			}
		}
		return sumOfMultiples3And5;
	}
	
	public static int Multiples3And5Alt(int maxNum)
	{
		int sumOfMultiples3And5 = 0;
		int nextMultipleToAdd = 3;
		int nextMultiple3 = 3;
		int nextMultiple5 = 5;
		while (nextMultipleToAdd < maxNum)
		{
			sumOfMultiples3And5 += nextMultipleToAdd;
			if (nextMultipleToAdd == nextMultiple3)
			{
				nextMultiple3 += 3;
			}
			if (nextMultipleToAdd == nextMultiple5)
			{
				nextMultiple5 += 5;
			}
			nextMultipleToAdd = Math.min(nextMultiple3, nextMultiple5);
		}
		return sumOfMultiples3And5;
	}
}
