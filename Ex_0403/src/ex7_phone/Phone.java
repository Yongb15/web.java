package ex7_phone;

public interface Phone {
	
	public static int MAX_BATTERY_CAPACITY = 100;
	
	void powerOn();
	void powerOff();
	boolean isOn();
	void watchUtube();
	void charge();
}
