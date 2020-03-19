package euler;

import java.util.ArrayList;

public class DigitFifthPowers {

	public static int findSumOfDigits(int maxPower)
	{
		int maxValue = (int)Math.pow(9, maxPower);
		int sumOfValues = 0;
		int step = maxValue;
		for (int i = 1; i <= maxPower; i++)
		{
			maxValue += step;
		}
		for (int i = 2; i < maxValue; i++)
		{
			ArrayList<Integer> digits = new ArrayList<Integer>();
			int valueToCheck = i;
			int sumToCheck = 0;
			while (valueToCheck / 10 > 0)
			{
				digits.add(valueToCheck % 10);
				valueToCheck /= 10;
			}
			digits.add(valueToCheck % 10);
			for (int value : digits)
			{
				sumToCheck += Math.pow(value, maxPower);
			}
			if (sumToCheck == i)
			{
				sumOfValues += i;
			}
		}
		return sumOfValues;
	}
}
