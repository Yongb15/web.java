package ex1_for;

public class Ex2_multi_for {
	public static void main(String[] args) {
		// 다중 for문
		// for문 안에 for문이 있는 경우
		// for문 자체를 반복
		
		// for(초기식; 조건식; 증감식;)
		// {
		//		for(초기식; 조건식; 증감식;)
		//		{
		//			반복하고자 하는 명령
		//		}
		// }
		
		
		// 2중으로 감싸면 2중 for문 3중으로 감싸면 3중 for문
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 3; j++)
			{
				System.out.println(i + " " + j);
			}
		}
		
		System.out.println("--------------------");
		
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		// 2중 for문은 면처럼 표현 가능
		
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		//1 1 1 
		//1 1 1 
		//1 1 1 
		//1 1 1
		// 위처럼 출력하기
		
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= 3; j++)
			{
				System.out.print(1 + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		// 1 2 3 4
		// 5 6 7 8 
		// 9 10 11 12
		
		int num = 0;
		
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				num++;
				System.out.printf("%02d ", num);
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		// A B C D
		// A B C D
		// A B C D
		
		char s = ' ';
		
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				s = (char)(65 + j);
				System.out.print(" " + s);
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		// A B C D
		// E F G H
		// I J K L
		
		s = 'A';
		
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.printf(" %c",s++);
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
