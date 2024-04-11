package ex2_super;

public class Car {
	int gasGauge = 0;
	
	public Car(int gasGauge)
	{
		this.gasGauge = gasGauge;
	}
	
	public void showCurrentGauge()
	{
		System.out.println("잔여 가스량은 " + gasGauge + "입니다.");
	}
}
