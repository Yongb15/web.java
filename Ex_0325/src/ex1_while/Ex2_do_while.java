package ex1_while;

import java.util.Scanner;

public class Ex2_do_while {
	public static void main(String[] args) {
		// while문은 선 비교 후 처리를 하지만
		// do-while문은 선 처리 후 비교를 하기 때문에 조건에 맞지 않아도 무조건 한 번은 실행하게 된다.
		// 제어문 중 유일하게 세미콜론(;)을 붙혀야 한다.
		
		int i = 11;
		
		do {
			System.out.println(i);
		}
		while(i <= 10);
		
		// 상황에 따라 반복문 결정하기
		
		// 반복 횟수가 지정되는 경우 -> 횟수를 만족할 때까지 반복
		// ex) 물통에 물을 10번 채워라 -> for문
		
		// 특정 조건이 부여되는 경우 -> 조건이 만족할 때까지 반복(물이 다 채워질 때까지)
		// 물통에 물이 가득 찰 때까지 채워라 -> while문
		
		// 특정 조건과 옵션이 부여되는 경우 -> 한 번 실행한 후 반복 여부를 판단
		// ex) 물통에 물을 따라보고 새지 않으면 끝까지 채워라 -> do-while문
		
		System.out.println("--------------------");
		
		// 키보드에서 국어 영어 수학 점수를 입력받는데 100점이 넘어가면 다시 입력받아 출력한다.
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		
		do 
		{
			System.out.print("국어 : ");
			kor = sc.nextInt();
			
			System.out.print("영어 : ");
			eng = sc.nextInt();
			
			System.out.print("수학 : ");
			math = sc.nextInt();
		}
		while(kor > 100 || eng > 100 || math > 100);
		
		System.out.println("국어 점수는 : " + kor + "점입니다.");
		System.out.println("영어 점수는 : " + eng + "점입니다.");
		System.out.println("수학 점수는 : " + math + "점입니다.");

//		1 2 3 4 5 6 7 8 9 10
//		2 3 4 5 6 7 8 9 10 1
//		3 4 5 6 7 8 9 10 1 2
//		4 5 6 7 8 9 10 1 2 3
//		6 7 8 9 10 1 2 3 4 5
//		7 8 9 10 1 2 3 4 5 6
//		8 9 10 1 2 3 4 5 6 7
//		9 10 1 2 3 4 5 6 7 8
//		10 1 2 3 4 5 6 7 8 9
		
		System.out.println("--------------------");
		
		int num = 1; 
		
		for(int j = 1; j <= 10; j++)
		{
			for(int k = 0; k < 10; k++)
			{
				if(num < 10)
				{
					System.out.print(num + " ");
					num++;
				}
				else
				{
					System.out.print(num + " ");
					num = 1;
				}
			}
			num++;
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		for(int j = 1; j <= 10; j++)
		{
			for(int k = 0; k < 10; k++)
			{
				int n = j  + k;
				
				if(n > 10)
				{
					n -= 10;
				}
				
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
