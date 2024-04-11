package ex4_try_catch;

import java.util.Scanner;

// 문제
// 키보드에서 정수를 입력받도록 하고, 정수 이외에 값이 입력되면
// "정수만 입력가능"이라는 메세지 출력하기

// 정수 : 100
// 입력받은수 : 100

// 정수 : aaa
// 정수만 입력가능
public class Ex3_try_catch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		
		try {
			int result = sc.nextInt();
			
			System.out.println("입력받은수 : " + result);
		} catch (Exception e) {
			System.out.println("정수만 입력가능");
		}
	}
}
