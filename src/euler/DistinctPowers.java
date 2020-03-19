package euler;

import java.math.BigInteger;
import java.util.HashSet;

public class DistinctPowers {

	public static int findNumberOfDistinctTerms(int maxPower)
	{
		HashSet<BigInteger> terms = new HashSet<BigInteger>();
		for (int a = 2; a <= maxPower; a++)
		{
			for (int b = 2; b <= maxPower; b++)
			{
				BigInteger newTerm = new BigInteger(Integer.toString(a));
				newTerm = newTerm.pow(b);
				if (!terms.contains(newTerm))
				{
					terms.add(newTerm);
				}
			}
		}
		return terms.size();
	}
}
