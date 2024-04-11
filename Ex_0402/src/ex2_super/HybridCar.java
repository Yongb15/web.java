package ex2_super;

public class HybridCar extends Car{
	int electricGauge = 0;
	
	public HybridCar(int gasGauge, int electricGauge)
	{
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량은 " + electricGauge + "입니다.");
	}
}
