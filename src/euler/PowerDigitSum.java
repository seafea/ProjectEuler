package euler;

import java.math.BigInteger;

public class PowerDigitSum {

	public static int FindPowerDigitSum(int exponent)
	{
		BigInteger powerValue = new BigInteger("2");
		powerValue = powerValue.pow(exponent);
		int sum = 0;
		String powerDigitString = powerValue.toString();
		for (int i = 0; i < powerDigitString.length(); i++)
		{
			sum += Integer.parseInt(powerDigitString.substring(i, i + 1));
		}
		return sum;
	}
}
