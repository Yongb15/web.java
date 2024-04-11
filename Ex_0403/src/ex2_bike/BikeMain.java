package ex2_bike;

public class BikeMain {
	public static void main(String[] args) {
		
		Bike b = new FourWheelBike("용빈");
		
		b.info();
		b.ride();
		
		FourWheelBike bike = (FourWheelBike)b;
		
		bike.info();
		bike.ride();
		bike.addWheel();
	}
}
