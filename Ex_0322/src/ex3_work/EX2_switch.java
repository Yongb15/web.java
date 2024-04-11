package ex3_work;

import java.util.Scanner;

public class EX2_switch {
	public static void main(String[] args) {
		// 키보드에서 두 개의 값을 입력받는다.
		// 산술연산자 기호를 문자열로 입력받는다.
		// switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		
		// 예시
		// 수1 : 10
		// 수2 : 7
		// 연산자 : +
		
		// 결과
		// 10 + 7 = 17
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("숫자를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.print("산술연산자를 입력하세요 : ");
//		String op = sc.next();
//		
//		switch(op) {	
//		case "+" :
//			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
//			break;
//		case "-" :
//			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
//			break;
//		case "*" :
//			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
//			break;
//		case "/" :
//			System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
//			break;
//		case "%" :
//			System.out.printf("%d % %d = %d", num1, num2, num1 % num2);
//			break;
//		}
		
		System.out.println("--------------------------");
			
		// 정수형 변수를 하나 키보드에서 값을 입력받고(1~12)
		// 해당 달이 몇 일까지 있는지 switch문을 통해 작성하세요
		// 단 break는 3번만 사용할 것
		
		System.out.print("달을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "월은 31까지 있습니다.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(month + "월은 30일까지 있습니다.");
				break;
			case 2:
				System.out.println(month + "월은 28일까지 있습니다.");
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
				break;
		}
	}
}
