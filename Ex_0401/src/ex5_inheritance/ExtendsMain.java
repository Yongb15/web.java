package ex5_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		Child c1 = new Child();
		
		System.out.println(c1.car);
		System.out.println(c1.money);
		System.out.println(c1.home);
		
		Parent p1 = new Parent();
		
		// 부모 클래스는 자식의 재산을 마음대로 가져다 사용할 수 없다.
//		System.out.println(p1.car);
		System.out.println(p1.money);
		System.out.println(p1.home);
		
		// 상속의 특징
		// 한 개의 자식 클래스가 두 개의 부모 클래스를 상속받는 것은 불가능하다.
		// 한 개의 부모 클래스가 두 개의 자식 클래스를 상속받는 것은 가능하다.
		// 명시되지는 않았지만 모든 클래스는 Object 클래스를 상속받고 있다.
		// Object는 모든 타입을 받아들일 수 있는 최상위 객체이다.
	}
}
