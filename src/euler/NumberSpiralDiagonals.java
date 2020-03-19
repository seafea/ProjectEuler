package euler;

public class NumberSpiralDiagonals {
	public static int findSumOfDiagonals(int size)
	{
		int sumOfDiagonals = 1;
		int numToAdd = 1;
		int step = 2;
		while (numToAdd < Math.pow(size, 2))
		{
			for (int i = 0; i < 4; i++)
			{
				numToAdd += step;
				sumOfDiagonals += numToAdd;
			}
			step += 2;
		}
		return sumOfDiagonals;
	}
	
	public static int findSumOfDiagonalsNaive(int size)
	{
		int[][] matrix = generateSpiral(size);
		return findSumOfDiagonalMatrix(matrix);
	}
	
	private static int[][] generateSpiral(int size)
	{
		if (size % 2 == 0)
		{
			throw new UnsupportedOperationException();
		}
		int[][] matrix = new int[size][size];
		int currRow = size / 2;
		int currCol = size / 2;
		int number = 1;
		int step = 3;
		matrix[currRow][currCol] = number;
		while (number < Math.pow(size, 2))
		{
			// Going right.
			number++;
			currCol++;
			matrix[currRow][currCol] = number;
			// Going down.
			for (int i = 0; i < step - 2; i++)
			{
				number++;
				currRow++;
				matrix[currRow][currCol] = number;
			}
			// Going left.
			for (int i = 0; i < step - 1; i++)
			{
				number++;
				currCol--;
				matrix[currRow][currCol] = number;
			}
			// Going up.
			for (int i = 0; i < step - 1; i++)
			{
				number++;
				currRow--;
				matrix[currRow][currCol] = number;
			}
			// Going right.
			for (int i = 0; i < step - 1; i++)
			{
				number++;
				currCol++;
				matrix[currRow][currCol] = number;
			}
			step += 2;
		}
		return matrix;
	}
	
	private static int findSumOfDiagonalMatrix(int[][] matrix)
	{
		int sumOfDiagonals = 0;
		for (int i = 0; i < matrix.length; i++)
		{
			sumOfDiagonals += matrix[i][i] + matrix[i][matrix.length - i - 1]; 
		}
		sumOfDiagonals -= matrix[matrix.length / 2][matrix.length / 2];
		return sumOfDiagonals;
	}
}
