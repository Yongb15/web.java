package ex2_multi_array;

import java.util.Scanner;

public class Ex2_multi_array {
	public static void main(String[] args) {
		int[][] arr = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20} };
	
		// 1. 총합
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				sum += arr[i][j];
			}
		}
		System.out.println("총합은 : " + sum + "입니다.");
		
		// 2. 평균
		
		int count = 0;
		sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				sum += arr[i][j];
				count++;
			}
		}
		System.out.println("평균은 : " + (double)sum / count + "입니다.");
		
		System.out.println("--------------------");
		
		// 학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		// 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받은 후,
		// 입력받은 수만큼 학생들의 이름과 수학, 영어성적을 입력받는 프로그램 작성
		
		// 예시
		// 등록할 인원 수 : 2
		// 이름 : 홍길동
		// 수학 : 90
		// 영어 : 87
		// -----------------
		// 이름 : 제임스
		// 수학 : 70
		// 영어 : 100
		// -----------------
		// 2명 등록 완료
		// 홍길동 90 87
		// 제임스 70 100
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등록할 인원 수 : ");
		
		int n = sc.nextInt();
		
		String[][] ar = new String [n][3];
		
		for(int i = 0; i < ar.length; i++)
		{
			for(int j = 0; j < ar[i].length; j++)
			{
				System.out.print("이름 : ");
				ar[i][j] = sc.next();
				j++;
				
				System.out.print("수학 : ");
				ar[i][j] = sc.next();
				j++;
				
				System.out.print("영어 : ");
				ar[i][j] = sc.next();
			}
			System.out.println("------------------------");
		}
		System.out.println(n + "명 등록 완료");
		
		for(int i = 0; i < ar.length; i++)
		{
			for(int j = 0; j < ar[i].length; j++)
			{
				System.out.print(ar[i][j] + " ");
				j++;
				
				System.out.print(ar[i][j] + " ");
				j++;
				
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		
		
	}
}
