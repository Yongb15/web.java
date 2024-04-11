package ex1_if;

import java.util.Scanner;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
		// if - else if - else
		// 비교해야할 조건이 여러개 있는 경우 사용하는 문법
		// 물론 if문 안에 두 개 이사으이 조건식과 논리연산자를 사용할 수도 있지만
		// 코드를 간결하게 하고 가독성을 높히기 위한 방법으로 if - else - if문을 구현합니다.
		
		// 기본형
		// if(조건식1) {
		//		조건식1이 참일 때 실행할 명령
		// }
		// else if(조건식2) {
		//		조건식1이 거짓이고 조건식2가 참일 때 실행할 명령
		// }
		// else if(조건식3) {
		//		조건식2가 거짓이고 조건식3이 참일 때 실행할 명령
		// }
		// else {
		//		위 조건이 모두 거짓일 때 실행할 명령
		// }
		
		int favorite = 7;
		
//		if(favorite < 5) {
//			System.out.println("좋아하는 숫자가 5보다 작습니다.");
//		}
//		else if(favorite > 5) {
//			System.out.println("좋아하는 숫자는 5보다 큽니다.");
//		}
//		else {
//			System.out.println("좋아하는 숫자는 5입니다.");
//		}
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5보다 큽니다.");
		}
		else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		
		// elseif문에 있는 조건문이 더 정확함에도 불구하고 if문에 있는 조건식이 true가 되버리기 때문에 
		// elseif문에 있는 조건식은 실행되지 못하고 조건문을 빠져나간다.
		// 보다 효율적인 흐름으로 제어하기 위해 if문과 elseif문의 조건문의 위치를 바꿔야 한다.
		
		System.out.println("----------------------------------");
		
		// 키보드에서 나이를 입력받아 20살이상이면 "성인입니다."
		// 13살보다 많으면 "청소년입니다."
		// 6살보다 많으면 "어린이입니다."
		// 그 이외에는 "유아입니다." 출력하기
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		}
//		else if(age > 13) {
//			System.out.println("청소년입니다.");
//		}
//		else if(age > 6) {
//			System.out.println("어린이입니다.");
//		}
//		else {
//			System.out.println("유아입니다.");
//		}
		
		System.out.println("----------------------------------");
		
		// 키보드에서 성적을 입력받고
		// 90점 이상이면 "A";
		// 80점 이상이면 "B";
		// 70점 이상이면 "C";
		// 60점 이상이면 "D";
		// 59점 이하면 "F";
		
		System.out.print("성적을 입력하세요 : ");
		
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A입니다."); 
		}
		else if(score >= 80) {
			System.out.println("B입니다."); 
		}
		else if(score >= 70) {
			System.out.println("C입니다."); 
		}
		else if(score >= 60) {
			System.out.println("D입니다."); 
		}
		else {
			System.out.println("F입니다."); 
		}
	}
}
