package ex5_abstract;

abstract public class AbsParent {
	
	// 필드
	int value = 100;
	
	// 일반 메서드
	public int getValue()
	{
		
		return value;
	}
	
	// 추상 메서드
	abstract public void setValue(int n);
}
