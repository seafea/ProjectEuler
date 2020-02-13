package euler;

import java.util.ArrayList;

import sharedFunctions.SharedFunctions;

public class NonAbundantSums {

	public static int findNonAbundantSumALT()
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
		boolean[] TwoAbundantNumbers = new boolean[28124];
		
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
				for (int k = j + 1; k < abundantNumbers.size(); k++)
				{
					if (abundantNumbers.get(j) + abundantNumbers.get(k) == i)
					{
						//System.out.println(i + " is the sum of " + abundantNumbers.get(j) + " and " + abundantNumbers.get(k));
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
