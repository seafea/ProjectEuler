package euler;

import java.math.BigInteger;

public class FactorialDigitSum {
	
	public static int findFactorialDigitSum(int n)
	{
		BigInteger factorial = new BigInteger("1");
		int sumOfFactorialDigits = 0;
		for (int i = 2; i <= n; i++)
		{
			factorial = factorial.multiply(new BigInteger(i + ""));
		}
		for (char c : factorial.toString().toCharArray())
		{
			sumOfFactorialDigits += Integer.parseInt(c + "");
		}
		return sumOfFactorialDigits;
	}
}
