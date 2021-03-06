package euler;

public class LargestProductInASeries {
	
	private static String Number = "70167176531330624919225119674426574742355349194934" +
			"85861560789112949495459501737958331952853208805511" +
			"12540698747158523863050715693290963295227443043557" +
			"66896648950445244523161731856403098711121722383113" +
			"62229893423380308135336276614282806444486645238749" +
			"30358907296290491560440772390713810515859307960866" +
			"70172427121883998797908792274921901699720888093776" +
			"65727333001053367881220235421809751254540594752243" +
			"52584907711670556013604839586446706324415722155397" +
			"53697817977846174064955149290862569321978468622482" +
			"83972241375657056057490261407972968652414535100474" +
			"82166370484403199890008895243450658541227588666881" +
			"16427171479924442928230863465674813919123162824586" +
			"17866458359124566529476545682848912883142607690042" +
			"24219022671055626321111109370544217506941658960408" +
			"07198403850962455444362981230987879927244284909188" +
			"84580156166097919133875499200524063689912560717606" +
			"05886116467109405077541002256983155200055935729725" +
			"71636269561882670428252483600823257530420752963450";

	public static long findLargestProductInSeries(int numAdjacentDigits)
	{
		long largestProduct = 0;
		for (int i = 0; i < Number.length() - numAdjacentDigits + 1; i++)
		{
			long possibleProduct = 1;
			for (int offset = 0; offset < numAdjacentDigits; offset++)
			{
				possibleProduct *= Character.getNumericValue(Number.charAt(i + offset));
			}
			//int possibleProduct = Character.getNumericValue(Number.charAt(i)) * Character.getNumericValue(Number.charAt(i + 1)) * 
					//Character.getNumericValue(Number.charAt(i + 2)) * Character.getNumericValue(Number.charAt(i + 3));
			largestProduct = possibleProduct > largestProduct ? 
					possibleProduct : largestProduct;
		}
		return largestProduct;
	}
	
	public static long findLargestProductInSeriesNoZeros(int numAdjacentDigits)
	{
		long largestProduct = 0;
		int startingPosition = 0;
		if ((Number.substring(0, numAdjacentDigits - 1)).contains("0"))
		{
			startingPosition = Number.substring(0, numAdjacentDigits - 1).lastIndexOf('0') + 1;
		}
		int index = startingPosition;
		while (index < Number.length() - numAdjacentDigits + 1)
		{
			if (Number.substring(index, index + numAdjacentDigits - 1).contains("0"))
			{
				// It has a zero in it.
				index += numAdjacentDigits - 1;
			}
			else
			{
				long possibleProduct = 1;
				for (int offset = 0; offset < numAdjacentDigits; offset++)
				{
					possibleProduct *= Character.getNumericValue(Number.charAt(index + offset));
				}
				largestProduct = possibleProduct > largestProduct ? 
						possibleProduct : largestProduct;
				index++;
			}
		}
		return largestProduct;
	}
	
	public static long findLargestProductInSeriesMinDigit(int numAdjacentDigits)
	{
		long largestProduct = 0;
		int startingPosition = 0;
		int smallestPossibleDigit = 1;
		if ((Number.substring(0, numAdjacentDigits - 1)).contains("0"))
		{
			startingPosition = Number.substring(0, numAdjacentDigits - 1).lastIndexOf('0') + 1;
		}
		int index = startingPosition;
		while (index < Number.length() - numAdjacentDigits + 1)
		{
			if (!isDigitHigherThanMin(Number.charAt(index + numAdjacentDigits - 1), 
					smallestPossibleDigit))
			{
				index += numAdjacentDigits - 1;
			}
			else
			{
				long possibleProduct = 1;
				for (int offset = 0; offset < numAdjacentDigits; offset++)
				{
					possibleProduct *= Character.getNumericValue(Number.charAt(index + offset));
				}
				if (possibleProduct > largestProduct)
				{
					largestProduct = possibleProduct;
					smallestPossibleDigit = getSmallestPossibleDigit(numAdjacentDigits, largestProduct);
				}
				index++;
			}
		}
		return largestProduct;
	}
	
	private static boolean isDigitHigherThanMin(char digit, int smallestPossibleDigit)
	{
		return Character.getNumericValue(digit) >= smallestPossibleDigit;
	}
	
	private static int getSmallestPossibleDigit(int numDigits, long product)
	{
		int smallestPossibleDigit = 1;
		long hypotheticalProduct = 1;
		while (hypotheticalProduct <= product)
		{
			for (int i = 1; i < numDigits; i++)
			{
				hypotheticalProduct *= 9;
			}
			if (hypotheticalProduct <= product)
			{
				smallestPossibleDigit++;
				hypotheticalProduct = smallestPossibleDigit;
			}
		}
		return Math.max(1, smallestPossibleDigit - 1);
	}
}
