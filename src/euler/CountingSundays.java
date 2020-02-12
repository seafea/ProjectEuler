package euler;

import java.time.LocalDate;

public class CountingSundays {
	
	private static int[] daysPerMonth = new int[] {
			31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};

	public static int getNumberOfSundaysOnThe1st(LocalDate startDate, LocalDate endDate)
	{
		if (endDate.isBefore(startDate))
		{
			return -1;
		}
		LocalDate initial = LocalDate.of(1900, 1, 1);
		int day = 1;
		int numSundaysOnThe1st = 0;
		while (initial.isBefore(startDate))
		{
			if (initial.getMonthValue() == 2 && initial.isLeapYear())
			{
				day += daysPerMonth[initial.getMonthValue() - 1] + 1;
				initial = initial.plusDays(daysPerMonth[initial.getMonthValue() - 1] + 1);
			}
			else
			{
				day += daysPerMonth[initial.getMonthValue() - 1];
				initial = initial.plusDays(daysPerMonth[initial.getMonthValue() - 1]);
			}
		}
		while (initial.isBefore(endDate) || initial.equals(endDate))
		{
			if (day % 7 == 0)
			{
				numSundaysOnThe1st++;
			}
			if (initial.getMonthValue() == 2 && initial.isLeapYear())
			{
				day += daysPerMonth[initial.getMonthValue() - 1] + 1;
				initial = initial.plusDays(daysPerMonth[initial.getMonthValue() - 1] + 1);
			}
			else
			{
				day += daysPerMonth[initial.getMonthValue() - 1];
				initial = initial.plusDays(daysPerMonth[initial.getMonthValue() - 1]);
			}
		}
		return numSundaysOnThe1st;
	}
}
