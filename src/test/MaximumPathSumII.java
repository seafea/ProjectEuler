package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;

import euler.MaximumPathSumI;

import org.junit.jupiter.api.Test;

class MaximumPathSumII {

	@Test
	void findMaximumSumPathLargeProblemTest() {
		int[][] pyramid = readLargeTriangleFile();
		assertEquals(7273, MaximumPathSumI.findMaximumPathSum(pyramid));
	}
	
	//@Test
	//void findMaximumSumPathLargeNaiveProblemTest() {
		//int[][] pyramid = readLargeTriangleFile();
		//assertEquals(7273, MaximumPathSumI.findMaximumPathSumNaive(pyramid));
	//}

	public static int[][] readLargeTriangleFile()
	{
		BufferedReader reader;
		int[][] pyramid = new int[100][];
		int lineNum = 1;
		try
		{
			reader = new BufferedReader(
					new FileReader(
							"C:\\Users\\dmerryman\\Documents\\GitHub\\Practice\\Java\\ProjectEuler\\txt\\triangle.txt"));
			String line = reader.readLine();
			while (line != null)
			{
				String[] pieces = line.split(" ");
				int[] nums = new int[lineNum];
				for (int i = 0; i < pieces.length; i++)
				{
					nums[i] = Integer.parseInt(pieces[i]);
				}
				pyramid[lineNum - 1] = nums;
				line = reader.readLine();
				lineNum++;
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return pyramid;
	}
}
