package euler;

import java.util.ArrayList;

import sharedFunctions.SharedFunctions;

public class NonAbundantSums {

	public static int findNonAbundantSumWithSieve()
	{
		ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
		int nonAbundantNumberSum = 0;
		for (int i = 12; i <= 28123; i++)
		{
			if (isNumberAbundant(i))
			{
				abundantNumbers.add(i);
			}
		}
		boolean[] twoAbundantNumbersSieve = new boolean[28124];
		for (int i = 0; i < abundantNumbers.size(); i++)
		{
			for (int j = i; j < abundantNumbers.size(); j++)
			{
				int abundantNumberSum = abundantNumbers.get(i) + abundantNumbers.get(j);
				if (abundantNumberSum < twoAbundantNumbersSieve.length)
				{
					twoAbundantNumbersSieve[abundantNumberSum] = true;
				}
			}
		}
		for (int i = 1; i <= 28123; i++)
		{
			if (!twoAbundantNumbersSieve[i])
			{
				nonAbundantNumberSum += i;
			}
		}
		return nonAbundantNumberSum;
	}
	
	public static int findNonAbundantSum()
	{
		ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
		int nonAbundantNumberSum = 0;
		for (int i = 12; i <= 28123; i++)
		{
			if (isNumberAbundant(i))
			{
				abundantNumbers.add(i);
			}
		}
		for (int i = 1; i <= 28123; i++)
		{
			boolean done = false;
			for (int j = 0; j < abundantNumbers.size(); j++)
			{
				for (int k = j; k < abundantNumbers.size(); k++)
				{
					if (abundantNumbers.get(j) + abundantNumbers.get(k) == i)
					{
						done = true;
						break;
					}
					else if (abundantNumbers.get(j) + abundantNumbers.get(k) > i)
					{
						break;
					}
				}
				if (done || abundantNumbers.get(j) > i)
				{
					break;
				}
			}
			if (!done)
			{
				nonAbundantNumberSum += i;
			}
		}
		return nonAbundantNumberSum;
	}
	
	public static boolean isNumberAbundant(int num)
	{
		ArrayList<Integer> divisors = SharedFunctions.getAllProperDivisors(num);
		int sumOfDivisors = 0;
		for (Integer i : divisors)
		{
			sumOfDivisors += i;
		}
		return sumOfDivisors > num;
	}
}
