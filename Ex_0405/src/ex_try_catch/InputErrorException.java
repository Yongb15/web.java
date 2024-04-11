package ex_try_catch;
// 사용자 정의 예외처리
// 자바가 제공하는 예외 객체 외에도 개발자의 목적에 의해서 예외 객체를 만들 수 있다.
// 자바가 제공하는 객체로는 모든 예외를 처리하기는 어렵기 때문
// 목적에 따라 공통기능을 지니는 예외 처리도 필요하기 때문에 개발자가 직접 예외를 생성하여 처리해야 힘

public class InputErrorException extends Exception{
	public InputErrorException() {
		
	}
	
	public InputErrorException(String message) {
		super(message);
	}
}
