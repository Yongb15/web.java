package ex2_student;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	// this()
	// 현재 클래스에 선언되어잇는 생성자를 가리킬 수 있는 키워드이다.
	public Phone(String b, int s, String c)
	{
//		brand = b;
//		series = s;
//		color = c;
		this(b, s);
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