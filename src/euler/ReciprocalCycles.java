package euler;

import java.util.ArrayList;
import java.util.HashMap;

import sharedFunctions.SharedFunctions;

public class ReciprocalCycles {

	public static int findDenominatorWithLongestRecurringCycleUnderN(int n)
	{
		if (n <= 0)
		{
			return -1;
		}
		int highestNumRepeatingDecimal = -1;
		int returnValue = -1;
		for (int i = 2; i < n; i++)
		{
			int repeatingDecimal = getNumberOfNonRepeatingDecimals(i);
			if (repeatingDecimal > highestNumRepeatingDecimal)
			{
				highestNumRepeatingDecimal = repeatingDecimal;
				returnValue = i;
			}
		}
		return returnValue;
	}
	
	public static int getNumberOfNonRepeatingDecimals(int n)
	{
		HashMap<Integer, Integer> stateToIter = new HashMap<Integer, Integer>();
		int state = 1;
		int iter = 0;
		while (!stateToIter.containsKey(state))
		{
			stateToIter.put(state, iter);
			state = state * 10 % n;
			iter++;
		}
		return iter - stateToIter.get(state);
	}
}
