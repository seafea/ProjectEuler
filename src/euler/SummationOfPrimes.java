package euler;
import sharedFunctions.SharedFunctions;

public class SummationOfPrimes {

	public static long FindSummationOfPrimes(int ceiling)
	{
		long primeSum = 0;
		boolean[] primeSieve = SharedFunctions.generatePrimeSieveUnderX(ceiling);
		for (int i = 2; i < primeSieve.length; i++)
		{
			if (!primeSieve[i])
			{
				primeSum += i;
			}
		}
		return primeSum;
	}
}
