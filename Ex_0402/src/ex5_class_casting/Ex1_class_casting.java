package ex5_class_casting;

class Parent{}
class Child extends Parent{}

public class Ex1_class_casting {
	public static void main(String[] args) {
		Parent p1 = new Parent();	// 부모 객체 p1
		Child c1 = new Child();		// 자식 객체 c1
		
		Parent p2 = new Child();	// 자동 타입 변환
		Parent p3 = c1;				// 자동 타입 변환
//		Child c2 = p1; 				// 자동 타입 변환이 되지 않음\
		// 자식 -> 부모 O / 부모 -> 자식 X
		
		if(p3 == c1)
		{
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다!");
		}
		
		// 타입을 반환한다고 객체가 바뀌는게 아니라 객체는 보존되고 사용만 부모 객체처럼 한다.
		// 자동 타입 변환은 반드시 자식 클래스의 객체를 부모 타입으로 변환할 때 적용할 수 있다.
		// 1차 상속관계가 아니더라도 상위 계층의 타입으로 변환할 수 있다.
		// 하지만 같은 상위 계층을 가지고 있더라도 타입 변환을 시도하려는 두 클래스 간의 상속 관계가 없으면 타입 변환은 불가능하다.
	}
}
