package euler;

public class NumberLetterCounts {

	public static int[] firstNineteenValues = new int[] {
			3, 3, 5, 4, 4, 3, 5, 5, 4, 3, 6, 6, 8, 8, 7, 7, 9, 8, 8
	};
	public static int[] tens = new int[] {
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
	
	public static int getNumberOfLetters(int number)
	{
		if (number < firstNineteenValues.length + 1)
		{
			return firstNineteenValues[number - 1];
		}
		else if (number >= firstNineteenValues.length + 1 && 
				number <= 99 && number % 10 == 0)
		{
			return tens[(number / 10) - 2];
		}
		else if (number >= firstNineteenValues.length + 1 && number <= 99)
		{
			int numLetters = 0;
			int tensDigit = number / 10;
			numLetters += tens[tensDigit - 2];
			numLetters += firstNineteenValues[(number % 10) - 1];
			return numLetters;
		}
		else if (number >= 100 && number <= 999 && number % 100 == 0)
		{
			
		}
		return 0;
	}
}
