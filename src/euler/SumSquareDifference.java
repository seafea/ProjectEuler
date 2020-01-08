package euler;

public class SumSquareDifference {

	public static int findSumSquareDifference(int maxNum)
	{
		return getSquareOfSum(maxNum) - getSumOfSquares(maxNum);
	}
	
	public static int findSumSquareDifferenceBetter(int maxNum)
	{
		int squareOfSum = (int)Math.pow(maxNum * (maxNum + 1) / 2, 2);
		int sumOfSquares = ((2 * maxNum) + 1) * maxNum * (maxNum + 1) / 6;
		return squareOfSum - sumOfSquares;
	}
	
	private static int getSumOfSquares(int maxNum)
	{
		int returnNum = 0;
		for (int i = 1; i <= maxNum; i++)
		{
			returnNum += Math.pow(i, 2);
		}
		return returnNum;
	}
	
	private static int getSquareOfSum(int maxNum)
	{
		int returnNum = 0;
		for (int i = 1; i <= maxNum; i++)
		{
			returnNum += i;
		}
		return (int)Math.pow(returnNum, 2);
	}
}
