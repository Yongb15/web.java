package ex2_calculator;

public class TimesTable {

	public void showTable(int num)
	{
		for(int i = 1; i <= 9; i++)
		{
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}

	}
}
