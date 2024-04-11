package ex2_super;

// Car클래스는 잔여 가스량인 gasGauge를 필드로 갖고 있다.
// 잔여량을 출력하는 메서드인 showCurrentGauge()를 갖고 있다.
// gasGauge는 생성자를 통해 초기화 한다.

// HybridCar 클래스는 Car 클래스를 상속받는다.
// electricGauge를 필드로 갖는다.
// electricGauge는 생성자를 통해 초기화 한다.
// 메서드는 오버라이딩 하여 가스량과 전기량을 출력한다.

// HybridWaterCar 클래스는 HyBridCar 클래스를 상속받는다.
// waterGauge를 필드로 갖고 있고 메서드는 오버라이딩하여 잔여 가스량, 잔여 전기량, 잔여 물의양을 출력한다.
// waterGauge는 생성자를 통해 초기화 한다.

// main에서 HybridWaterCar 객체를 생성하여 잔여 연료들을 출력하세요
public class CarMain {
	public static void main(String[] args) {
		HybridWaterCar car = new HybridWaterCar(50, 30, 20);
		car.showCurrentGauge();
	}
}
