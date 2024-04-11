package ex1_while;

import java.util.Scanner;

public class Ex1_while {
	public static void main(String[] args) {
		// while문
		// 간편한 구성을 가진 반복문
		// 반복횟수가 정해져 있지 않고 조건식이 true일 경우 계속해서 반복하는 문법
		// for문보다 구조가 간단하지만 주의해서 사용하지 않으면 무한루프같은 오류에 빠지기 쉽다.
		
		// 기본형
		//
		// 초기식;
		// 
		// while(조건식)
		// {
		//		조건식이 참일 때 반복할 명령;
		//		증감식;
		// }
		
		// while문은 for문처럼 시작값과 증감값을 가지고 있지 않기 때문에 값을 변화시켜주지 않으면 무한반복이 일어나게 된다.
		
		int num = 1;
		
		while(num <= 10)
		{
			System.out.println(num);
			num++;
		}
		
		System.out.println("--------------------");
		
		// 키보드에서 값을 받는데 -1을 입력하면 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		while(num != -1)
		{
			System.out.println("입력한 정수 : " + num);
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
		}
		
		// while문은 몇 번을 반복해야 하는지 정확하지 않을 때 사용하면 좋다.
		
		System.out.println("--------------------");
		
		// 
	}
}
