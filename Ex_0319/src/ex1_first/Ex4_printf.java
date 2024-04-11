package ex1_first;

public class Ex4_printf {
	public static void main(String[] args) {
		// printf : 값의 타입에 따라 서식문자를 이용해 문자열속에서 데이터를 출력할 수 있다.
		
		System.out.println(2+" + "+2+" = "+4);
		System.out.printf("%d + %d = %d\n", 2, 2, 4);	// decimal -> 10진수
		// 실행 crtl + F11
		
		// 서식문자의 종류
		// %d : 정수(10진수)
		// %o : 정수(8진수)
		// %x : 정수(16진수)
		// %f : 실수
		// %s : 문자열
		// %c : 문자형
		// %b : 논리형
		
		System.out.printf("저는 %d살입니다.\n", 25);
		System.out.println("저는 " + 20 + "살입니다.");
		
		// 출력값의 정렬
		// %3d, %5d -> 주어진 숫자만큼 칸을 확보한 후 오른쪽 정렬하여 출력
		System.out.printf("%5d\n", 12);
		
		// %.1f는 자릿수 지정
		System.out.printf("%1f\n", 1.234567);
		
		
		
		
		
	}
}
