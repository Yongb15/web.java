package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 7;
		
		System.out.println("n1 = " + n1 + ", n2 = " + n2);
		
		// 복합 대입 연산자
		// 산술 연산자와 대입 연산자가 합쳐진 형태 '+=', '-=', '*=', '%=', '/='
		
		int x = 5;
		int y = 7;
		
		y += x;	// y = y + x;와 같음
		
		System.out.println("y = " + y);
		
		y *= x; // y = y * x;와 같음
		System.out.println("y = " + y);
		
		y %= x; // y = y % x;와 같음
		System.out.println("y = " + y);
		
		System.out.println("-------------------------");
		
		// 관계(비교)연산자
		// 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		// 네 -> true, 아니오 -> false
		
		x = 10;
		y = 20;
		
		boolean result = x < y;
		
		System.out.println(result);
		
		// '>' : 크다, '<' : 작다, '<=' 작거나 같다, '>=' 크거나 같다
		
		result = x == y;
		System.out.println("x == y : " + result);
		
		result = x != y;
		System.out.println("x != y : " + result);
	}
}
