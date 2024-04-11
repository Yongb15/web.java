package ex2_object;

public class Ex1_equals {
	public static void main(String[] args) {
		// equals() 메서드
		// 기본 자료형의 데이터들을 비교하기 위해 ==연산자를 사용
		// 하지만 객체를 비교할 때는 주소값을 비교하게 된다.
		// 객체들의 값을 비교하고 싶을 때는 equals()메서드를 오버라이딩하여 사용
		
		// 묵시적 객체 생성
		String str1 = "hello";
		String str2 = "hello";
		
		// 명시적 객체 생성
		String str3 = new String("hello");
		
		
		System.out.println("str1 vs str2 : " + (str1 == str2));
		System.out.println("str2 vs str3 : " + (str2 == str3));
		
		// System.identifyHashCode()
		// 객체의 고유한 hashcode를 리턴하는 메서드
		
		System.out.println("str1 : " + System.identityHashCode(str1));
		System.out.println("str2 : " + System.identityHashCode(str2));
		System.out.println("str3 : " + System.identityHashCode(str3));
		
		// 객체에 들어있는 값을 비교
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str1 vs str3 : " + str1.equals(str3));
	}
}
