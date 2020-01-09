package sharedFunctions;

import java.util.ArrayList;
import java.util.List;

public class SharedFunctions {

	public static boolean[] generatePrimeSieve(long maxNum)
	{
		int size = (int)Math.ceil(Math.sqrt(maxNum));
		boolean sieve[] = new boolean[size];
		int tempNum = 0;
		for (int i = 2; i < sieve.length; i++)
		{
			if (!sieve[i])
			{
				tempNum = i;
				while (tempNum < sieve.length)
				{
					tempNum += i;
					if (tempNum < sieve.length)
					{
						sieve[tempNum] = true;
					}
				}
			}
		}
		return sieve;
	}
	
	public static ArrayList<Integer> getFirstNPrimes(int n)
	{
		ArrayList<Integer> primeNumberList = new ArrayList<Integer>(n);
		int upperSieveLimit = (int)(n * (Math.log(n) + Math.log(Math.log(n))));
		boolean[] sieve = new boolean[upperSieveLimit];
		for (int i = 2; i < sieve.length; i++)
		{
			if (!sieve[i])
			{
				int tempNum = i;
				while (tempNum < sieve.length)
				{
					tempNum += i;
					if (tempNum < sieve.length)
					{
						sieve[tempNum] = true;
					}
				}
			}
		}
		for (int i = 2; i < sieve.length; i++)
		{
			if (!sieve[i])
			{
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}
	
	public static boolean isaPalindrome(int num)
	{
		int number = num;
		int reversedInteger = 0;
		while (number != 0)
		{
			int remainder = number % 10;
			reversedInteger *= 10;
			reversedInteger += remainder;
			number /= 10;
		}
		return (num == reversedInteger);
	}
}
