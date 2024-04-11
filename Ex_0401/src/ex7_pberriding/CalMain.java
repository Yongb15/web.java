package ex7_pberriding;

// Calculator 클래스를 만들고
// 반환형은 정수, 매개변수는 정수형 변수 n1, n2, 반환값은 -1을 getResult()함수를 정의

// CalPlus 클래스를 만들고 Calculator를 상속 받기
// 오버라이딩 하여 getResult()를 n1과 n2를 더하여 반환하는 메서드로 만든다.

//CalMinus 클래스를 만들고 Calculator를 상속 받기
//오버라이딩 하여 getResult()를 n1과 n2를 빼서 반환하는 메서드로 만든다.

// main에서 실행하여 결과를 확인
// CalPlus : 30
// CalMinus : 15
public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		System.out.println("합은 : " + cp.getResult(15, 15));
		
		System.out.println("-------------");
		
		System.out.println("차는 : " + cm.getResult(30, 15));
	}
}