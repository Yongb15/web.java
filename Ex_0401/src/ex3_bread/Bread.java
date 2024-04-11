package ex3_bread;

public class Bread {
	
	int count = 0;
	
	public void makeBread()
	{
		System.out.println("빵을 만들었습니다.");
		System.out.println("-------------------------");
	}
	
	public void makeBread(int num)
	{
		for(int i = 0; i < num; i++)
		{
			System.out.println("빵을 만들었습니다.");
			count++;
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", count);
		System.out.println("-------------------------");
	}
	
	public void makeBread(int num, String s)
	{
		for(int i = 0; i < num; i++)
		{
			System.out.println(s + "빵을 만들었습니다.");
			count++;
		}
		System.out.printf("요청하신 %s빵을 %d개 만들었습니다.\n", s, count);
		System.out.println("-------------------------");
	}
}
