package ex3_polymorphism;

public class ComputerRoom {
//	samsung com1;
//	samsung com2;
	
	Computer com1;
	Computer com2;
	
	public void allPowerOn()
	{
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff()
	{
		com1.powerOff();
		com2.powerOff();
	}
}
