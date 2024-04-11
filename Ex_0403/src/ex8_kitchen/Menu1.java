package ex8_kitchen;

// 다중 인터페이스의 구현
// 선언한 모든 인터페이스에 대한 추상 메서드를 구현할 수 있다.

public interface Menu1 extends Menu2, Menu3 {
	// 인터페이스는 일반 클래스 상속이 불가능하고 인터페이스 끼리만 상속이 가능하다.
	// 인터페이스는 구현능력이 없기 때문에 다중 상속이 가능하다.
	String jajang();
}
