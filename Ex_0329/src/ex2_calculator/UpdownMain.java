package ex2_calculator;

import java.util.Scanner;

// Updown 클래스를 생성하고 1 ~ 50 사이의 난수를 발생시킨다.
// Main 클래스에서 키보드를 통해 정수를 입력받는다.
// Updown 클래스에서 사용자가 입력한 숫자를 판단하여 발생한 난수부터 크다면 down!, 작다면 up!을 출력
// 사용자가 입력한 숫자와 발생한 난수가 같은 경우 프로그램을 종료

// 정답을 맞춘 경우 프로그램의 종료는 Main에서 이루어지도록 한다.
// 몇 회만에 맞췃는지도 추가

// Random 클래스
// Random random = new Random();
// random.nextInt(51) / 1 ~ 50
public class UpdownMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UpDown ud = new UpDown();
		int count = 0;
		
		while(true)
		{
			System.out.print("수를 입력하세요 : ");
			if(ud.r == ud.cheak(sc.nextInt())) 
			{
				System.out.println(count + "회만에 정답을 맞추셨습니다!");
				break;
			}
			count++;
		}
		
	}
}
