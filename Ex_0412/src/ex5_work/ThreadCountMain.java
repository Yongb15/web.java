package ex5_work;

import java.util.Scanner;

// 스캐너를 이용하여 키보드에서 숫자를 입력
// ThreadCount 클래스를 스레드로 만들어서 입력받은 숫자가 1씩 감소하다가
// 0이 되었을 때 "종료"메세지와 함께 프로그램 종료
public class ThreadCountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 입력 : ");
		
		ThreadCount tc = new ThreadCount(sc.nextInt());
		tc.start();
	}
}
