package euler;

import java.util.ArrayList;

public class AmicableNumbers {

	public static int findSumOfAmicableNumbersUnderN(int n)
	{
		int sumOfAmicableNumbers = 0;
		for (int i = 1; i < n; i++)
		{
			if (isNumberAmicable(i))
			{
				System.out.println(i + " is an amicable number.");
				sumOfAmicableNumbers += i;
			}
		}
		return sumOfAmicableNumbers;
	}
	
	private static boolean isNumberAmicable(int number)
	{
		int sumOfProperDivisors = findSumOfProperDivisors(number);
		return (findSumOfProperDivisors(sumOfProperDivisors) == number && sumOfProperDivisors != number);
	}
	
	private static int findSumOfProperDivisors(int number)
	{
		ArrayList<Integer> listOfDivisors = new ArrayList<Integer>();
		int sumOfProperDivisors = 0; 
		for (int i = 1; i <= number / 2; i++)
		{
			if (number % i == 0)
			{
				listOfDivisors.add(i);
			}
		}
		for (int i : listOfDivisors)
		{
			sumOfProperDivisors += i;
		}
		return sumOfProperDivisors;
	}
}
