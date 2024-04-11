package ex5_class_casting;

class Car{};
class Bus extends Car{};
class SchoolBus extends Bus{};

class OpenCar extends Car{};
class SportCar extends OpenCar{};

public class Ex2_class_casting {
	public static void main(String[] args) {
		
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportCar();
		
//		Bus b3 = new OpenCar();
//		Bus b4 = new SportCar();
		
		// 부모 타입으로 변환한 객체는 더 이상 자신의 클래스에 별개로 추가했던 필드들을 사용할 수 없다.
		// 부모 클래스에 선언된 필드만 사용할 수 있다.
		// 단 부모 클래스의 메서드를 오버라이딩 한 경우는 오버라이딩된 메서드가 먼저 호출된다.
	}
}
