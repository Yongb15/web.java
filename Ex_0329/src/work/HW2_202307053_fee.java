package work;

//주차 요금을 계산하는 Programming
//1) 입차, 출차 시간은 입력받는다
//2) 요금은 최초 30분간은 무료, 이후는 기본 요금 3000원 + 10분당 1,000원씩 증가

import java.util.Scanner;

public class HW2_202307053_fee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입차 시 : ");
		int inH = sc.nextInt();
		
		System.out.print("입차 분 : ");
		int inM = sc.nextInt();
		
		System.out.print("출차 시 : ");
		int outH = sc.nextInt();
		
		System.out.print("출차 분 : ");
		int outM = sc.nextInt();
		
		int sum = 0;
		
		if(inH == outH)
		{
			if((outM - inM) <= 30)
			{
				System.out.println("주차요금은 무료입니다.");
			}
			else
			{
				sum = ((outM - inM) / 10) * 1000;
				System.out.println("주차요금은 " + sum + "원입니다.");
			}
		}
		else
		{
			sum = (((outH - inH) * 6) + (outM - inM) / 10) * 1000;
			System.out.println("주차요금은 " + sum + "원입니다.");
		}
	}
}
