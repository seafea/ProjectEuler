package sharedFunctions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SharedFunctions {

	public static int getNumberOfDivisors(int num)
	{
		int numDivisors = 0;
		for (int i = 1; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				numDivisors += 2;
			}
			if (i * i == num)
			{
				numDivisors--;
			}
		}
		numDivisors++;
		return numDivisors;
	}
	public static int[][] getGridOfNumbers(String grid)
	{
		String[] lines = grid.split(System.getProperty("line.separator"));
		int width = getWidth(lines[0]);
		int height = lines.length;
		int j = 0;
		int[][] nums = new int[height][width];
		for (String line : lines)
		{
			int i = 0;
			String[] numsInput = line.split(" ");
			for (String num : numsInput)
			{
				nums[j][i] = Integer.parseInt(num);
				i++;
			}
			j++;
		}
		return nums;
	}
	
	private static int getWidth(String line)
	{
		String[] nums = line.split(" ");
		return nums.length;
	}
	
	public static boolean[] generatePrimeSieve(long maxNum)
	{
		int size = (int)Math.ceil(Math.sqrt(maxNum));
		boolean sieve[] = new boolean[size];
		int tempNum = 0;
		for (int i = 2; i < sieve.length; i++)
		{
			if (!sieve[i])
			{
				tempNum = i;
				while (tempNum < sieve.length)
				{
					tempNum += i;
					if (tempNum < sieve.length)
					{
						sieve[tempNum] = true;
					}
				}
			}
		}
		return sieve;
	}
	
	public static boolean[] generatePrimeSieveUnderX(int x)
	{
		boolean sieve[] = new boolean[x];
		int tempNum = 0;
		for (int i = 2; i < sieve.length; i++)
		{
			if (!sieve[i])
			{
				tempNum = i;
				while (tempNum < sieve.length)
				{
					tempNum += i;
					if (tempNum < sieve.length)
					{
						sieve[tempNum] = true;
					}
				}
			}
		}
		return sieve;
	}
	
	public static ArrayList<Integer> getFirstNPrimes(int n)
	{
		ArrayList<Integer> primeNumberList = new ArrayList<Integer>(n);
		int upperSieveLimit = (int)(n * (Math.log(n) + Math.log(Math.log(n))));
		boolean[] sieve = new boolean[upperSieveLimit];
		for (int i = 2; i < sieve.length; i++)
		{
			if (!sieve[i])
			{
				int tempNum = i;
				while (tempNum < sieve.length)
				{
					tempNum += i;
					if (tempNum < sieve.length)
					{
						sieve[tempNum] = true;
					}
				}
			}
		}
		for (int i = 2; i < sieve.length; i++)
		{
			if (!sieve[i])
			{
				primeNumberList.add(i);
			}
		}
		return primeNumberList;
	}
	
	public static boolean isaPalindrome(int num)
	{
		int number = num;
		int reversedInteger = 0;
		while (number != 0)
		{
			int remainder = number % 10;
			reversedInteger *= 10;
			reversedInteger += remainder;
			number /= 10;
		}
		return (num == reversedInteger);
	}
	
	public static ArrayList<String> readCSVInputFileWithQuotes(String fileName)
	{
		BufferedReader reader;
		ArrayList<String> returnValues = new ArrayList<String>();
		try
		{
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while (line != null)
			{
				String[] pieces = line.split(",");
				for (String s : pieces)
				{
					returnValues.add(s.replaceAll("\"", ""));
				}
				line = reader.readLine();
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return returnValues;
	}
	
	public static ArrayList<Integer> getAllProperDivisors(int num)
	{
		ArrayList<Integer> properDivisors = new ArrayList<Integer>();
		for (int i = 1; i <= num / 2; i++)
		{
			if (num % i == 0)
			{
				properDivisors.add(i);
			}
		}
		return properDivisors;
	}
	
	public static ArrayList<String> findPermutations(String s)
	{
		ArrayList permutations = new ArrayList<String>();
		findPermutationsHelper(s, "", permutations);
		return permutations;
	}
	
	private static void findPermutationsHelper(String s, String build, ArrayList<String> permutations)
	{
		if (s.length() == 0)
		{
			permutations.add(build);
			return;
		}
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			String newS = s.substring(0, i) + s.substring(i + 1);
			findPermutationsHelper(newS, build + c, permutations);
		}
	}
}
