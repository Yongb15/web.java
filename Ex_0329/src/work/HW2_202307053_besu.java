package work;
// 3과 7의 배수 구하기
import java.util.Scanner;

public class HW2_202307053_besu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 7 == 0)
		{
			System.out.println("3과 7의 배수입니다.");
		}
		else if(num % 3 == 0)
		{
			System.out.println("3의 배수입니다.");
		}
		else if(num % 7 == 0)
		{
			System.out.println("7의 배수입니다.");
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
}
