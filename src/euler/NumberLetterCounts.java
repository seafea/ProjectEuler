package euler;

public class NumberLetterCounts {

	private static int[] firstNineteenValues = new int[] {
			3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8
	};
	private static int[] tens = new int[] {
			6, 6, 5, 5, 5, 7, 6, 6
	};
	public static int getNumberLetterCounts(int ceiling)
	{
		int sumOfLetters = 0;
		int i = 1;
		while (i <= ceiling)
		{
			sumOfLetters += getNumberOfLetters(i);
			i++;
		}
		return sumOfLetters;
	}
	
	private static int getNumFrom1stDigitOrInitial(int number)
	{
		int returnValue = -1;
		if (number < firstNineteenValues.length + 1)
		{
			returnValue = firstNineteenValues[number - 1];
		}
		else
		{
			returnValue = firstNineteenValues[number - 1];
		}
		return returnValue;
	}
	
	private static int getNumFrom2ndDigit(int number)
	{
		int returnValue = -1;
		returnValue = tens[(number / 10) - 2];
		if (number % 10 != 0)
		{
			returnValue += getNumFrom1stDigitOrInitial(number % 10);
		}
		return returnValue;
	}
	
	private static int getNumFrom3rdDigit(int number)
	{
		int returnValue = firstNineteenValues[(number / 100) - 1];
		returnValue += 7;
		if (number % 100 != 0)
		{
			returnValue += 3;
			if (number % 100 > 19)
			{
				returnValue += getNumFrom2ndDigit(number % 100);
			}
			else
			{
				returnValue += getNumFrom1stDigitOrInitial(number % 100);
			}
		}
		return returnValue;
	}
	
	private static int getNumFrom4thDigit(int number)
	{
		int returnValue = firstNineteenValues[(number / 1000) - 1];
		returnValue += 8;
		if (number % 1000 != 0)
		{
			returnValue += getNumFrom3rdDigit(number % 1000);
		}
		return returnValue;
	}
	
	private static int getNumberOfLetters(int number)
	{
		int returnValue = -1;
		if (number < firstNineteenValues.length + 1)
		{
			returnValue = getNumFrom1stDigitOrInitial(number); 
		}
		else if (number > 19 && number < 100)
		{
			returnValue = getNumFrom2ndDigit(number);
		}
		else if (number > 99 && number < 1000)
		{
			returnValue = getNumFrom3rdDigit(number);
		}
		else if (number > 999 && number < 10000)
		{
			returnValue = getNumFrom4thDigit(number);
		}
		return returnValue;
	}
}
