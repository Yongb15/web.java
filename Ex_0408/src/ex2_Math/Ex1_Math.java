package ex2_Math;

public class Ex1_Math {
	public static void main(String[] args) {
		// 수학에서 자주 사용하는 상수들과 메서드들을 미리 구현해놓은 클래스
		// 자바에서 수학 계산이 필요할 때 주로 사용한다.
		// 객체를 선언하지 않고 바로 사용할 수 있도록 해당 클래스가 제공하는 모든 메서드는 모두 정적 메서드(static)로 이루어져있다.
		
		// 올림
		System.out.println("3.51 올림 : " + Math.ceil(3.51));
		
		// 버림
		System.out.println("13.61 버림 : " + Math.floor(13.61));
		
		// 반올림
		System.out.println("12.8 반올림 : " + Math.round(12.8));
		System.out.println("3.141592 반올림 : " + Math.round((3.141592) * 1000) / 1000.0);
		
		// 절대값 구하기
		System.out.println(Math.abs(-4.55));
		System.out.println(Math.abs(-50));
		
		// 최대값 구하기
		int x = 30;
		int y = 60;
		int maxValue = Math.max(x, y);
		System.out.println("최대값 : " + maxValue);
		
		// 최소값 구하기
		int minValue = Math.min(x, y);
		System.out.println("최소값 : " + minValue);
	}
}
