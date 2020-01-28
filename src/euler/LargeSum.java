package euler;
import java.math.BigInteger;

public class LargeSum {

	public static BigInteger findLargeSumCheating(String[] numbers)
	{
		BigInteger total = new BigInteger("0");
		for (int i = 0; i < numbers.length; i++)
		{
			BigInteger number = new BigInteger(numbers[i]);
			total = total.add(number);
		}
		return total;
	}
	
	public static String findFirstTenDigitsOfLargeSum(String[] numbers)
	{
		int[] firstTenDigits = new int[14];
		for (int i = 0; i < numbers.length; i++)
		{
			for (int j = 11; j >= 0; j--)
			{
				firstTenDigits[j + 2] += Integer.parseInt(numbers[i].substring(j, j + 1));
				if (firstTenDigits[j + 2] > 9)
				{
					firstTenDigits[j - 1 + 2]++;
					firstTenDigits[j + 2] %= 10;
				}
			}
		}
		firstTenDigits[0] = firstTenDigits[1] / 10;
		firstTenDigits[1] %= 10;
		String returnValue = "";
		for (int i = 0; i <= 9; i++)
		{
			returnValue += firstTenDigits[i];
			System.out.println(firstTenDigits[i]);
		}
		return returnValue;
	}
}
