package ex2_calculator;

public class CalTest {
	
	public void getResult(int num1, int num2, String op)
	{
		switch(op)
		{
		case "+" :
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			break;
		case "-" :
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			break;
		case "*" :
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			break;
		case "/" :
			System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			break;
		case "%" :
			System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
			break;
		}
	}
}
