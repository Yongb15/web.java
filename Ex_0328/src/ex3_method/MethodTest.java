package ex3_method;

public class MethodTest {
	// 두 수를 더해 반환하는 함수 add 작성하기
	
	public int add(int a, int b)
	{
		return a + b;
	}
	
	// 1 ~ n까지의 총합을 구해서 출력하는 함수 sum 작성하기
	
	public void sum(int a)
	{
		int total = 0;
		
		for(int i = 1; i <= a; i++)
		{	
			total += i;
		}
		System.out.println("총합 : " + total);
	}
	
	// 배열의 최대값을 찾는 maxFinder메서드
	
	public void maxFinder(int a[])
	{
		int max = a[0];
		
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}
//		for(int x : a)
//		{
//			if(x > max)
//			{
//				max = x;
//			}
//		}
//		System.out.println(max);
		
	// main에서 반지름을 전달받아 원의 넓이를 구하는 circleArea
	// 원의 넓이는 반지름 X 반지름 X 3.14;
		
	public void circleArea(int radius)
	{
		System.out.println("원의 넓이는 : " + (radius * radius * 3.14));
	}
		
		
	// main에서 반지름을 전달받아 원의 넓이를 구하는 circleRound
	// 원의 둘레는 2 x 3.14 x 반지름
		
	public void circleRound(int radius)
	{
		System.out.printf("원의 둘레는 : %.2f\n", (2 * radius * 3.14));
	}
}
