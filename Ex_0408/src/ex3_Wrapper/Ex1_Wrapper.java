package ex3_Wrapper;

public class Ex1_Wrapper {
	public static void main(String[] args) {
		// Wrapper 클래스
		// 프로그램에 따라 기본 타입의 데이터를 객체형으로 표현해야하는 경우가 있다.
		// 이를 위해 자바에서는 기본 자료형을 객체로 다루기 위한 클래스를 제공
		// 이를 Wrapper 클래스라고 부르는데 기본형의 데이터 타입을 클래스로 포장했기 때문이다.
		
		// 생성자를 통한 선언은 JDK 1.9부터 사용하지 않는 것을 권장
		
		// 정수형 타입선언
		Integer num01 = new Integer(10); // ----- <- 취소선 / 향후 업데이트 계획 x / 사용 권장 x
		Integer num02 = Integer.valueOf(10); // valueOf() <- 정적 메서드(static)
		
		System.out.println("정수형 1 : " + num01);
		System.out.println("정수형 2 : " + num02);
		
		// 실수형 타입선언
		Double doubleNum01 = Double.valueOf(30.11);
		
		System.out.println("실수형 : " + doubleNum01);
		
		// 문자형 타입선언
		Character ch = Character.valueOf('A');
		
		System.out.println("문자형 : " + ch);
		
		
	}
}
