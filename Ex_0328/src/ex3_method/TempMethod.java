package ex3_method;

import java.util.Scanner;

public class TempMethod {
	// 메서드의 정의는 메소드 밖에서만 가능하다
	// 메서드의 호출은 메서드 안에서만 가능하다
	// main에서 섭씨로 변화하고 싶으면 1, 화씨로 변화하고 싶으면 2로 입력받고
	// fahrenheitToCelsius함수를 통해 화씨를 섭씨로 바꾸기 위한 온도도 입력을 받는다.
	// celsiusToFahrehit함수를 통해 섭씨를 화씨로 바꾸기 위한 온도도 입력을 받는다. 
	// 출력하는 프로그램을 만드세요
	
	// 화씨 = 1.8 * 섭씨 + 32, 섭씨 = (화씨 - 32) / 1.8
	
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1을 누르면 섭씨, 2를 누르면 화씨 : ");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			fahrenheitToCelsius(sc);
			break;
		case 2:
			celsiusToFahrehit(sc);
			break;
		}
	}
	
	public void fahrenheitToCelsius(Scanner sc)
	{
		double cel;
		
		System.out.print("화씨를 입력하세요 : ");
		cel = sc.nextInt();
		
		System.out.printf("섭씨로 바뀐 온도는 %.2f입니다.\n", 1.8 * cel + 32);
	}
	
	public void celsiusToFahrehit(Scanner sc)
	{
		double cel;
		
		System.out.print("화씨를 입력하세요 : ");
		cel = sc.nextDouble();
		
		System.out.printf("화씨로 바뀐 온도는 %.2f입니다.\n", (cel - 32) / 1.8);
	}
}
