package euler;

public class LongestCollatzSequence {

	public static long findLongestChainUnderXNaive(int x)
	{
		int maxChainFrom = x;
		int maxNumSteps = 0;
		while (x > 1)
		{
			long currentNum = x;
			int numSteps = 0;
			while (currentNum > 1)
			{
				if (currentNum % 2 == 0)
				{
					currentNum /= 2;
				}
				else
				{
					currentNum = (currentNum * 3) + 1;
				}
				numSteps++;
			}
			if (numSteps > maxNumSteps)
			{
				maxNumSteps = numSteps;
				maxChainFrom = x;
			}
			x--;
		}
		return maxChainFrom;
	}
}
