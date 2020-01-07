package euler;
import sharedFunctions.SharedFunctions;

public class LargestPalindromeProduct {

	public static int findLargestPalindromeSimple()
	{
		int largestPalindrome = 1;
		for (int i = 100; i < 1000; i++)
		{
			for (int j = i; j < 1000; j++)
			{
				int possibleNum = i * j;
				if (SharedFunctions.isaPalindrome(possibleNum))
				{
					largestPalindrome = possibleNum > 
						largestPalindrome ? possibleNum : largestPalindrome;
				}
			}
		}
		return largestPalindrome;
	}
}
