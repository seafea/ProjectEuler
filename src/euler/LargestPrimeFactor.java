package euler;
import sharedFunctions.SharedFunctions;

public class LargestPrimeFactor {

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
