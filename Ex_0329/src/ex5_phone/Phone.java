package ex5_phone;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	public Phone(String b, int s, String c)
	{
		brand = b;
		series = s;
		color = c;
	}
	
	// 자바에서는 생성자를 여러 개 선언하는 것을 허용하고 있다.
	public Phone(String b, int s)
	{
		brand = b;
		series = s;
	}
	
	public void phoneInfo()
	{
		System.out.println(color + " " + brand + " " + series);
	}
}
