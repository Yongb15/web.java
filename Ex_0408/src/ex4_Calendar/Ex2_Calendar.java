package ex4_Calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Ex2_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		 
		// 인자로 전달된 값을 특정 값으로 설정
		cal.set(year, month - 1, 1);	// 4월을 하려면 4월은 3번째 인덱스에 들어가 있으므로 -1
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 달의 마지막 날짜를 구함(1이 일요일, 7이 토요일 / 상수)
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 달력의 시작 날의 주말 처리
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);
			
			// 토요일에 날짜를 표시하고 줄 바꿈
			if(week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
}
