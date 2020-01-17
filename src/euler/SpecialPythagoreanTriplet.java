package euler;

public class SpecialPythagoreanTriplet {

	public static int findSpecialPythagoreanTriplet(int sum)
	{
		for (int a = 1; a < sum - 2; a++)
		{
			for (int b = a + 1;  + b < sum - 1 - a; b++)
			{
				int c = sum - a - b;
				if (c * c == (a * a) + (b * b))
				{
					return a * b * c;
				}
			}
		}
		throw new UnsupportedOperationException();
	}
	
	public static int findSpecialPythagoreanTripletBetter(int sum)
	{
		for (int a = 1; a <= (sum - 3) / 3; a++)
		{
			for (int b = a + 1;  + b <= (sum - 1 - a) / 2; b++)
			{
				int c = sum - a - b;
				if (c * c == (a * a) + (b * b))
				{
					return a * b * c;
				}
			}
		}
		throw new UnsupportedOperationException();
	}
}
