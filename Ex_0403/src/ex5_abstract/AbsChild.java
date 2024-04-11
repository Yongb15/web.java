package ex5_abstract;

class AbsChild extends AbsParent{
	// 추상 클래스를 상속받은 자식 클래스는 부모가 가지고 있는 추상 메서드를 무조건 받아둬야 한다.
	
	@Override
	public void setValue(int n) {
		System.out.println("추상 메서드 재정의함");
	}
	
	
}
