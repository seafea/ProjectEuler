package euler;

public class SmallestMultiple {
	
	/**
	 * 2520 is the smallest number that can be divided by each 
	 * of the numbers from 1 to 10 without any remainder. What 
	 * is the smallest positive number that is evenly divisible 
	 * by all of the numbers from 1 to 20?
	 */
	
	public static long findSmallestMultiple(int maxMultiple)
	{
		boolean done = false;
		long possibleNum = maxMultiple;
		while (!done)
		{
			for (int i = 2; i <= maxMultiple; i++)
			{
				if (possibleNum % i == 0)
				{
					if (i == maxMultiple)
					{
						done = true;
					}
					continue;
				}
				else
				{
					break;
				}
			}
			if (!done)
			{
				possibleNum++;
			}
		}
		return possibleNum;
	}
}
