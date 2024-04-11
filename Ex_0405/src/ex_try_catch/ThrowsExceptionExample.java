package ex_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ThrowsExceptionExample {
	public static void checkYoutSelf(Scanner scan) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 잇는 것이 좋다.");
		System.out.print(" 선택 : ");
		
		int check = scan.nextInt();
		
		if(check == 1) {
			System.out.println("당신은 E입니다.");
		}
		else {
			System.out.println("당신은 I입니다.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("==== 성격 유형 검사를 시작합니다.");
			// 메서드 호출
			ThrowsExceptionExample.checkYoutSelf(sc);
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
