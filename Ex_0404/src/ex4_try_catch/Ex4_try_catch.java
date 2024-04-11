package ex4_try_catch;
// 정수 : 100
// 결과 : 100

import java.util.Scanner;


// 정수 : aaa
// 결과 : aaa는 정수가 아닙니다.
public class Ex4_try_catch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		String str = "";
		
		try {
			str = sc.next();
			int num = Integer.parseInt(str);
			System.out.println("결과 : " + num);
		} catch (Exception e) {
			System.out.println("결과 : " + str + "은 정수가 아닙니다.");
		}
	}
}
