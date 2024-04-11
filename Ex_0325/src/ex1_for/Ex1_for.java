package ex1_for;

import java.util.Scanner;

public class Ex1_for {
	public static void main(String[] args) {
		// 반복문
		// 특정 수행문을 원하는만큼 반복하여 실행하는 제어문
		// 반복문의 종류에는 : for, while
		
		// for문
		// for(초기식; 조건식; 증감식;)			/ 조건식에는 비교 연산자와 논리 연산자가 들어간다.
		// {
		//		조건이 참 일때 반복할 명령;
		// }
		
		// 초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
		// 조건식 : 반복을 하기 위한 종료값으로 비교 연산자를 많이 사용한다.
		// 증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할, 증감 연산자를 많이 사용한다.
		
		for(int i = 0; i <= 3; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("--------------------");
		
		// 1부터 10까지 출력하는 반복문 작성
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n--------------------");
		
		// 10부터 1까지 출력하는 반복문 작성
		
		for(int i = 10; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("\n--------------------");
		
		// 1부터 10까지 3의 배수만 출력하는 반복문 작성하기
		
		for(int i = 1; i <= 10; i++)
		{
			if(i % 3 == 0)
			{
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n--------------------");
		
		// 1부터 100까지의 총 합을 구하는 반복문 작성하기
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			sum += i;
		}
		System.out.println("총 합은 : " + sum + "입니다.");
		
		System.out.println("--------------------");
		
		// 정수형 변수 dan에 1 ~ 9 사이의 수를 초기화한다.
		// dan에 해당하는 구구단 출력하기
		
		int dan = 2;
		
		for(int i = 1; i <= 9; i++)
		{
			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
		}
		
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		// 키보드로부터 정수를 하나 입력받는다.
		// 1부터 입력받은 정수까지의 합을 계산하여 출력하세요.
		// 예를들어 5를 입력받았다면 1+2+3+4+5의 연산 결과인 15를 출력
		
		sum = 0;
		
		System.out.print("정수를 입력하세요 : ");
		
		for(int n = sc.nextInt(); n > 0; n--)
		{
			sum += n;
		}
		System.out.println("합은 : " + sum + "입니다.");
		
		System.out.println("--------------------");
		
		// 10개의 정수를 입력받아 그 수들 중 짝수가 몇 개인지 출력하는 프로그램 작성
		
		int count = 0;
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("정수를 입력하세요 : ");
			int n1 = sc.nextInt();
			
			if(n1 % 2 == 0)
			{
				count += 1;
			}
		}
		System.out.println("짝수의 개수는 " + count + "개입니다.");
	}
}
