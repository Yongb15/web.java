package ex2_calculator;

import java.util.Scanner;

// TimesTable 클래스를 만들고
// showTable() 메서드를 정의한다.
// showTable() 메서드에서는 구구단을 출력하는 코드 작성
// main에서는 키보드에서 값을 입력받아 showTable()메서드로 보내기

public class TimesTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TimesTable tt = new TimesTable();
		
		System.out.print("값을 입력하세요 : ");
		tt.showTable(sc.nextInt());
	}
}
