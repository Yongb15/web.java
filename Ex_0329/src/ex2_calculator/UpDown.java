package ex2_calculator;

import java.util.Random;

public class UpDown {
	Random rd = new Random();
	int r = rd.nextInt(51);
	
	public int cheak(int i)
	{
		if(i > r)
		{
			System.out.println("down!");
		}
		else if(i < r)
		{
			System.out.println("up!");
		}
		else
		{
			return r;
		}
		return 0;
	}
}
