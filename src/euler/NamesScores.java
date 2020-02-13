package euler;

import java.util.ArrayList;
import java.util.Comparator;

import sharedFunctions.SharedFunctions;

public class NamesScores {

	public static int findNamesScoresTotal()
	{
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {return s1.compareToIgnoreCase(s2); }
		};
		int namesScoreTotal = 0;
		ArrayList<String> names = SharedFunctions.readCSVInputFileWithQuotes("C:\\Users\\dmerryman\\Documents\\GitHub\\Practice\\Java\\ProjectEuler\\txt\\p22_names.txt");
		names.sort(comp);
		int nameNum = 1;
		for (String name : names)
		{
			namesScoreTotal += getNameScore(name, nameNum);
			nameNum++;
		}
		return namesScoreTotal;
	}
	
	private static int getNameScore(String name, int nameNum)
	{
		int nameScore = 0;
		for (char c : name.toCharArray())
		{
			nameScore += ((int)c) - 64;
		}
		nameScore *= nameNum;
		return nameScore;
	}
	
}
