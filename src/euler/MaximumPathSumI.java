package euler;

public class MaximumPathSumI {
	
	public static int findMaximumPathSum(int[][] pyramid)
	{
		
		for (int i = pyramid.length - 2; i >= 0; i--)
		{
			for (int j = 0; j < pyramid[i].length; j++)
			{
				pyramid[i][j] += Math.max(pyramid[i + 1][j], 
						pyramid[i + 1][j + 1]);
			}
		}
		return pyramid[0][0];
	}
	
	public static int findMaximumPathSumNaive(int[][] pyramid)
	{
		return findMaximumPathSumNaiveHelper(pyramid, 0, 0);
	}
	
	private static int findMaximumPathSumNaiveHelper(int[][] pyramid, int row, int col)
	{
		if (row == pyramid.length - 1)
		{
			return pyramid[row][col];
		}
		System.out.println("Looking at [" + row + "][" + col + "]");
		int val1 = findMaximumPathSumNaiveHelper(pyramid, row + 1, col);
		int val2 = findMaximumPathSumNaiveHelper(pyramid, row + 1, col + 1);
		return pyramid[row][col] + Math.max(val1, val2);
	}
}
