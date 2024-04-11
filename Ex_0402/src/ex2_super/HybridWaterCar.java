package ex2_super;

public class HybridWaterCar extends HybridCar{
	int waterGauge = 0;
	
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge)
	{
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물의 양은 " + waterGauge + "입니다.");
	}
}
