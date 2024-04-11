package ex1_operator;

public class Ex4_Operator {
	public static void main(String[] args) {
		// 증감연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		// '++', '--'
		
		// 선행 증감 연산자
		// 변수의 앞에 사용한다.
		
		int a = 10;
		
		System.out.println("a : " + ++a);
		
		// 후행 증감 연산자
		
		int b = 10;
		
		System.out.println("b : " + b++);
		System.out.println("b : " + b + "\n");
		
		int x = 5;
		int y = 7;
		
		int z = x + y++;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// 연산을 모두 마치고 x, y, z의 값은 각각 무엇인가?
		// x : 5
		// y : 8
		// z : 12
		
		x = 8;
		y = 3;
		z = x++ + --y - ++x + --x + y++;
		//   8     2  - 10  +  9  + 2  
		
		System.out.println(z);
		
		
	}
}
