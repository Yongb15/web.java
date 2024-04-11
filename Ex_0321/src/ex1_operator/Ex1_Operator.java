package ex1_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		// 연산자(operator)
		// 연산이란? 데이터를 처리하고 결과를 산출하는 작업
		// 연산작업은 힝(피연산자)과 연산자로 이루어져 있다.
		// 항은 연산에 사용되는 값이며, 연산자는 기호를 의미한다.
		// 항과 연산자를 이용해 연산과정을 나열한 것을 연산식(expression)이라고 한다.
		
		// 기본 연산자의 종류
		// 자바는 사칙연산을 비롯해 다양한 연산자를 제공하고 있다.
		// 피연산자의 개수에 따라 단항, 이항, 삼항 연산자로 분류할 수 있다.
		// 사용 목적에 따라 산술, 증감, 대입, 비교, 논리, 비트, 등으로 분류할 수 있다.
		
		// 최고 연산자 : '.', '()'
		// 중감 연산자 : '++', '--'
		// 산술 연산자 : '+', '-', '*', '/', '%'
		// 시프트 연산자 : '>>', '<<'
		// 비교 연산자 : '>', '<', '>=', '<=', '==', '!='
		// 논리 연산자 : '&&', '||', '!'
		// 비트 연산자 : '&', '|', '~', '^'
		// 대입 연산자 : '=', '+=', '-=', '/=', '*=', '%='
		// 삼항 연산자 : '?:'

		// 산술 연산자
		// 산술 연산자는 사칙연산('+','-','*','/')와 나머지 값을 구하는 연산자('%')로 나뉜다
	
		int n1, n2, n3;
		
		n1 = 20;
		n2 = 7;
		
		n3 = n1 + n2;
		
		System.out.println("n3 = " + n3);
		
		n3 = n1 - n2;
		
		System.out.println("n3 = " + n3);
		
		n3 = n1 / n2;	// 몫만 구함
		
		System.out.println("n3 = " + n3);
		
		n3 = n1 % n2; 	// 나머지만 구함
		
		System.out.println("n3 = " + n3);
		
		// 산술 변환
		// 기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 연산이 가능하다.
		// 컴퓨터는 서로 다른 타입을 게산하지 못하므로 값의 손실이 적은 쪽으로 타입을 맞춰준다.
		// long + int -> long + long -> long
		// float + int -> float + float -> float
		// double + float -> double + double -> double
		
	}
}
