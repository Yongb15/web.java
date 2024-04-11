package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// 배열 arr에 담겨잇는 모든 값의 합을 출력하세요
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int total = 0;	// 총 합을 담을 변수
		
		for(int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		System.out.println("총 합은 : " + total + "입니다.");
		
		System.out.println("--------------------");
		
		// 문자만 뽑아서 단어를 출력해주세요
		// 출력 결과 : LOVE
		
		char [] cards = {'1', 'L', '2', 'O', 'V', '3', 'E'};
		
		String str = "";
		
		for(int i = 0; i < cards.length; i++)
		{
 			if(cards[i] >= 'A' && cards[i] <= 'Z' || cards[i] >= 'a' && cards[i] <= 'z')
 			{
 				str += cards[i];
 			}
		}
		System.out.println("출력 결과는 : " + str);
		
		System.out.println("--------------------");
		
		// 키보드에서 배열의 길이를 입력받는다.
		// 배열의 크기만큼 알파벳을 출력하세요
		
		// 예를 들어 5를 입력받으면 ABCDE
		// 예를 들어 3을 입력받으면 ABC
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이를 입력하세요 : ");
		int n = sc.nextInt();
		
		char[] c = new char[n];
		
		for(int i = 0; i < c.length; i++)
		{
			if(c.length >= 'Z')
			{
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			c[i] = (char)(65 + i);
			System.out.print(c[i] + "\n");
		}
		
		System.out.println("--------------------");
		
		// 변수 money에 10 ~ 5000사이의 값을 넣는다.
		// money를 동전으로 바꾸면 동전이 몇 개씩 필요한지 판단하는 코드 작성
		// 가능한 적은 수의 동전을 사용하도록 한다.
		
		int[] n1 = {0,0,0,0};
		
		System.out.print("돈을 입력하세요 : ");
		int money = sc.nextInt();
		
		n1[0] = money / 500;
		money = money % 500;
		
		n1[1] = money / 100;
		money = money % 100;
		
		n1[2] = money / 50;
		money = money % 50;
		
		n1[3] = money / 10;
		money = money % 10;
		
		System.out.println("500원의 개수는 " + n1[0] + "개입니다.");
		System.out.println("100원의 개수는 " + n1[1] + "개입니다.");
		System.out.println("50원의 개수는 " + n1[2] + "개입니다.");
		System.out.println("10원의 개수는 " + n1[3] + "개입니다.");
		
		System.out.println("--------------------");
		
		int m = 5000;
		
		int[] coin = {500, 100, 50, 10};
		
		for(int i = 0; i < coin.length; i++)
		{
			int res = m / coin[i];
			System.out.println(coin[i] + "원 : " + res);
			m %= coin[i];
		}
	}
}
