package ex1_StringBuilder;

public class Ex1_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder(""
				+ "Hello");
		
		// 기존 문자열 뒤에 삽입
		str.append(" World");
		System.out.println(str);
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println();
		
		// 문자열 삭제
		str.delete(0, 6);
		System.out.println(str);
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println();
		
		// 원하는 위치에 문자열 삽입
		str.insert(0, "Hello ");
		System.out.println(str);
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println();
		
		// 문자를 거꾸로 출력
		str.reverse();
		System.out.println(str);
		System.out.println("문자열의 길이 : " + str.length());
	}
}
