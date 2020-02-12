package test;

import static org.junit.jupiter.api.Assertions.*;
import euler.MaximumPathSumI;

import org.junit.jupiter.api.Test;

class MaximumPathSumITest {

	@Test
	void findMaximumPathSumTest() {
		int[][] smallerPyramid = new int[4][];
		smallerPyramid[0] = new int[] {3};
		smallerPyramid[1] = new int[] {7, 4};
		smallerPyramid[2] = new int[] {2, 4, 6};
		smallerPyramid[3] = new int[] {8, 5, 9, 3};
		assertEquals(23, MaximumPathSumI.findMaximumPathSum(smallerPyramid));
	}
	
	@Test
	void findMaximumPathSumProblemTest() {
		int[][] pyramid = new int[15][];
		pyramid[0] =  new int[] {75};
		pyramid[1] = new int[] {95, 64};
		pyramid[2] = new int[] {17, 47, 82};
		pyramid[3] = new int[] {18, 35, 87, 10};
		pyramid[4] = new int[] {20, 4, 82, 47, 65};
		pyramid[5] = new int[] {19, 1, 23, 75, 3, 34};
		pyramid[6] = new int[] {88, 2, 77, 73, 7, 63, 67};
		pyramid[7] = new int[] {99, 65, 4, 28, 6, 16, 70, 92};
		pyramid[8] = new int[] {41, 41, 26, 56, 83, 40, 80, 70, 33};
		pyramid[9] = new int[] {41, 48, 72, 33, 47, 32, 37, 16, 94, 29};
		pyramid[10] = new int[] {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14};
		pyramid[11] = new int[] {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57};
		pyramid[12] = new int[] {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48};
		pyramid[13] = new int[] {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31};
		pyramid[14] = new int[] {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23};
		assertEquals(1074, MaximumPathSumI.findMaximumPathSum(pyramid));
	}

	@Test
	void findMaximumPathSumNaiveTest() {
		int[][] smallerPyramid = new int[4][];
		smallerPyramid[0] = new int[] {3};
		smallerPyramid[1] = new int[] {7, 4};
		smallerPyramid[2] = new int[] {2, 4, 6};
		smallerPyramid[3] = new int[] {8, 5, 9, 3};
		assertEquals(23, MaximumPathSumI.findMaximumPathSumNaive(smallerPyramid));
	}
	
	@Test
	void findMaximumPathSumNaiveProblemTest() {
		int[][] pyramid = new int[15][];
		pyramid[0] =  new int[] {75};
		pyramid[1] = new int[] {95, 64};
		pyramid[2] = new int[] {17, 47, 82};
		pyramid[3] = new int[] {18, 35, 87, 10};
		pyramid[4] = new int[] {20, 4, 82, 47, 65};
		pyramid[5] = new int[] {19, 1, 23, 75, 3, 34};
		pyramid[6] = new int[] {88, 2, 77, 73, 7, 63, 67};
		pyramid[7] = new int[] {99, 65, 4, 28, 6, 16, 70, 92};
		pyramid[8] = new int[] {41, 41, 26, 56, 83, 40, 80, 70, 33};
		pyramid[9] = new int[] {41, 48, 72, 33, 47, 32, 37, 16, 94, 29};
		pyramid[10] = new int[] {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14};
		pyramid[11] = new int[] {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57};
		pyramid[12] = new int[] {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48};
		pyramid[13] = new int[] {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31};
		pyramid[14] = new int[] {04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23};
		assertEquals(1074, MaximumPathSumI.findMaximumPathSumNaive(pyramid));
	}
}
