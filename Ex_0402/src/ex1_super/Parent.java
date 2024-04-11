package ex1_super;

public class Parent {
	public Parent(int n)
	{
//		System.out.println("부모(Parent) 클래스의 생성자 호출");
		System.out.println("자식에게 받은 " + n + "출력");
	}
	
	public int result()
	{
		return 100;
	}
}
