package euler;

import java.util.ArrayList;

public class LexicographicPermutations {
	public static String findNthLexicographicPermutation(String nums, int n)
	{
		ArrayList<String> permutations = getPermutations(nums);
		return permutations.get(n - 1);
	}
	
	public static ArrayList<String> getPermutations(String nums)
	{
		ArrayList<String> perms = new ArrayList<String>();
		getPermutationsHelper(nums, "", perms);
		return perms;
	}
	
	private static void getPermutationsHelper(String nums, String build, ArrayList<String> perms)
	{
		if (nums.length() == 0)
		{
			perms.add(build);
			return;
		}
		for (int i = 0; i < nums.length(); i++)
			{
				char c = nums.charAt(i);
				String newNums = nums.substring(0, i) + nums.substring(i + 1);
				getPermutationsHelper(newNums, build + c, perms);
			}
	}
}
