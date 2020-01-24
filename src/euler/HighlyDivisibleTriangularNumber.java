package euler;
import sharedFunctions.SharedFunctions;
public class HighlyDivisibleTriangularNumber {

	public static int findHighlyDivisibleTriangularNumber(int targetNumDivisors)
	{
		int currentNum = 1;
		int numToAddBy = 2;
		int numDivisors = 1;
		while (numDivisors <= targetNumDivisors)
		{
			if (currentNum <= 0)
			{
				System.out.println("Overflow");
			}
			currentNum += numToAddBy;
			numToAddBy++;
			numDivisors = SharedFunctions.getNumberOfDivisors(currentNum);			
		}
		return currentNum;
	}
	
	public static int findHighlyDivisibleTriangularNumberUsingPrimes(
			int targetNumDivisors)
	{
		throw new UnsupportedOperationException();
	}
}
