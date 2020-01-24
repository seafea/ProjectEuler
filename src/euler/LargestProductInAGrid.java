package euler;

import sharedFunctions.SharedFunctions;

public class LargestProductInAGrid {

	public static int findLargestProductInAGrid(String grid, int length)
	{
		int[][] nums = SharedFunctions.getGridOfNumbers(grid);
		int largestProduct = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums.length; j++)
			{
				int largestProductFromHere = findMaxFromHere(nums, i, j, length);
				if (largestProductFromHere > largestProduct)
				{
					largestProduct = largestProductFromHere;
				}
			}
		}
		return largestProduct;
	}
	
	private static boolean canGoDown(int rowLength, int row, int length)
	{
		if (row <= rowLength - length)
		{
			return true;
		}
		return false;
	}
	
	private static boolean canGoRight(int colLength, int col, int length)
	{
		if (col <= colLength - length)
		{
			return true;
		}
		return false;
	}
	
	private static boolean canGoDiagonalDown(int rowLength, int colLength, int row, 
			int col, int length)
	{
		if (row <= rowLength - length && 
				col <= colLength - length)
		{
			return true;
		}
		return false;
	}
	
	private static boolean canGoDiagonalUp(int rowLength, int colLength,
			int row, int col, int length)
	{
		if (row >= length && col <= colLength - length)
		{
			return true;
		}
		return false;
	}
	
	private static int findMaxFromHere(int[][] grid, int row, int col, 
			int length)
	{
		int biggestProduct = Integer.MIN_VALUE;
		if (canGoDown(grid.length, row, length))
		{
			int tempProduct = grid[row][col] * grid[row + 1][col] * 
					grid[row + 2][col] * grid[row + 3][col];
			biggestProduct = tempProduct > biggestProduct ? tempProduct : biggestProduct;
		}
		if (canGoRight(grid[row].length, col, length))
		{
			int tempProduct = grid[row][col] * grid[row][col + 1] * 
					grid[row][col + 2] * grid[row][col + 3]; 
			biggestProduct = tempProduct > biggestProduct ? tempProduct : biggestProduct;
		}
		if (canGoDiagonalDown(grid.length, grid[row].length, row, col, length))
		{
			int tempProduct = grid[row][col] * grid[row + 1][col + 1] * 
					grid[row + 2][col + 2] * grid[row + 3][col + 3];
			biggestProduct = tempProduct > biggestProduct ? tempProduct : biggestProduct;
		}
		if (canGoDiagonalUp(grid.length, grid[row].length, row, col, length))
		{
			int tempProduct = grid[row][col] * grid[row - 1][col + 1] *
					grid[row - 2][col + 2] * grid[row - 3][col + 3];
			biggestProduct = tempProduct > biggestProduct ? tempProduct : biggestProduct;
			
		}
		return biggestProduct;
	}
}
