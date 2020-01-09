package euler;

import java.util.ArrayList;

import sharedFunctions.SharedFunctions;

public class NthPrime {

	public static int getNthPrimeAwful(int n)
	{
		int numPrime = 1;
		int currentNum = 3;
		while (numPrime < n)
		{
			for (int i = 2; i < currentNum; i++)
			{
				if (currentNum % i == 0)
				{
					// Not prime.
					break;
				}
				if (i == currentNum - 1)
				{
					numPrime++;
				}
			}
			if (numPrime < n)
			{
				currentNum += 2;
			}
		}
		return currentNum;
	}
	public static int getNthPrime(int n)
	{
		ArrayList<Integer> primeList = SharedFunctions.getFirstNPrimes(n);
		return primeList.get(n - 1);
	}
}
