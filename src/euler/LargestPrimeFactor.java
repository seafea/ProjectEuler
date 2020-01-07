package euler;
import sharedFunctions.SharedFunctions;

public class LargestPrimeFactor {

	
	public static long findLargestPrimeFactorDivision(long num)
	{
		int factor = 2;
		int lastFactor = 1;
		if (num % 2 == 0)
		{
			num /= 2;
			lastFactor = 2;
			while (num % 2 == 0)
			{
				num /= 2;
			}
		}
		while (num > 1)
		{
			if (num % factor == 0)
			{
				lastFactor = factor;
				num /= factor;
				while (num % factor == 0)
				{
					num /= factor;
				}
			}
			factor++;
		}
		return lastFactor;
	}
	
	public static long findLargestPrimeFactorWorst(long num)
	{
		for (long i = num; i > 1; i--)
		{
			if (num % i == 0 && isItPrime(i))
			{
				return i;
			}
		}
		return num;
	}
	
	public static long findLargestPrimeFactorSimple(long num)
	{
		int startingNum = (int)Math.ceil(Math.sqrt(num));
		for (int i = startingNum; i > 1; i--)
		{
			if (num % i == 0 && isItPrime(i))
			{
				return i;
			}
		}
		return num;
	}
	
	private static boolean isItPrime(long num)
	{
		long tempNum = num - 1;
		while (tempNum > 1)
		{
			if (num % tempNum == 0)
			{
				return false;
			}
			tempNum--;
		}
		return true;
	}
	
	public static long findLargestPrimeFactorDP(long num)
	{
		boolean[] sieve = SharedFunctions.generatePrimeSieve(num);
		for (int i = sieve.length; i > 1; i--)
		{
			if (num % i == 0 && !sieve[i])
			{
				return i;
			}
		}
		return num;
	}
}
