package euler;

public class LatticePaths {

	public static long findLatticePathsNaive(int dimension)
	{
		return findLatticePathsHelper(dimension, 0, 0);
	}
	
	private static long findLatticePathsHelper(int dimension, int xPos, int yPos)
	{
		long numWays = 0;
		if (xPos == dimension && yPos == dimension)
		{
			return 1L;
		}
		if (xPos < dimension)
		{
			numWays += findLatticePathsHelper(dimension, xPos + 1, yPos);
		}
		if (yPos < dimension)
		{
			numWays += findLatticePathsHelper(dimension, xPos, yPos + 1);
		}
		return numWays;
	}
	
	public static long findLatticePathsIterative(int dimension)
	{
		long[][] grid = new long[dimension + 1][dimension + 1];
		for (int i = 0; i < grid.length; i++)
		{
			grid[i][grid[i].length - 1] = 1;
		}
		for (int j = 0; j < grid[grid.length - 1].length; j++)
		{
			grid[grid.length - 1][j] = 1;
		}
		for (int i = grid.length - 2; i >= 0; i--)
		{
			for (int j = grid[grid.length - 2].length - 2; j >= 0; j--)
			{
				grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
			}
		}
		return grid[0][0];
	}
}
