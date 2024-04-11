package ex2_calculator;

import java.util.Scanner;

// CalTest 클래스를 생성하고
// 두 개의 정수와 산술연산자를 매개변수를 갖는 getResult라는 메서드를 정의하기
// main에서 숫자와 산술연산자를 전달하고 결과 확인하기
public class CalMain {
	public static void main(String[] args) {
		
		CalTest s = new CalTest();
		
		s.getResult(10, 7, "%");
	}
}
