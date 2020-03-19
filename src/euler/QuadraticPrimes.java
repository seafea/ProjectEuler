package euler;

import sharedFunctions.SharedFunctions;

public class QuadraticPrimes {

	public static int findProductOfCoefficientsWithSieve(int highestCoefficient, int numPrimes)
	{
		int highestValuePossible = (int)(Math.pow(numPrimes, 2) * (highestCoefficient * 80)) + highestCoefficient; 
		boolean[] primeSieve = SharedFunctions.generatePrimeSieveUnderX(highestValuePossible + 1);
		int productWithMostPrimes = -1;
		int maxPrimeCount = -1;
		for (int i = -highestCoefficient + 1; i < highestCoefficient; i++)
		{
			for (int j = -highestCoefficient; j <= highestCoefficient; j++)
			{
				int primeCount = 0;
				int n = 0;
				while (n <= numPrimes)
				{
					int nextPrime =  (int)(Math.pow(n, 2) + (i * n) + j);
					if (nextPrime > 0 && !primeSieve[nextPrime])
					{	
						primeCount++;
					}
					else if (nextPrime < 0 || primeSieve[nextPrime])
					{
						break;
					}
					n++;
				}
				if (primeCount > maxPrimeCount)
				{
					maxPrimeCount = primeCount;
					productWithMostPrimes = i * j;
				}
			}
		}
		return productWithMostPrimes;
	}
	
	public static int findProductOfCoefficientsNaive(int highestCoefficient)
	{
		int productWithMostPrimes = -1;
		int maxPrimeCount = -1;
		for (int i = -highestCoefficient + 1; i < highestCoefficient; i++)
		{
			for (int j = -highestCoefficient; j <= highestCoefficient; j++)
			{
				int primeCount = 0;
				int n = 0;
				int nextPrime = (int)Math.pow(n, 2) + (i * n) + j;
				while (SharedFunctions.isPrime(nextPrime))
				{
					if (i == -999 && j == -999)
					{
						System.out.println(nextPrime + " is prime.");
					}
					primeCount++;
					n++;
					nextPrime = (int)Math.pow(n, 2) + (i * n) + j;
				}
				if (primeCount > maxPrimeCount)
				{
					System.out.println(primeCount + " primes found for a = " + i + " b = " + j);
					maxPrimeCount = primeCount;
					productWithMostPrimes = i * j;
				}
			}
		}
		return productWithMostPrimes;
	}
}
