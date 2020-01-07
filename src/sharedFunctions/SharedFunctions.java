package sharedFunctions;

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
