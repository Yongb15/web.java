package ex3_bread;

// Bread 클래스를 만들어 각기 다른 기능을 하는 makeBread() 메서드를 세 개 만들기
// 메인클래스에서 각각의 메서드를 호출했을 때 결과를 보고 로직을 구현해보기

// 빵을 만들었습니다. -> method1번을 호출해서 나온 결과
// -------------------------------------

// 빵을 만들었습니다.
// 빵을 만들었습니다.
// 빵을 만들었습니다.
// ...
// 요청하신 n개의 빵을 만들었습니다. -> method2번을 호출해서 나온 결과
//-------------------------------------

// XX빵을 만들었습니다.
// XX빵을 만들었습니다.
// XX빵을 만들었습니다.
// ...
//요청하신 XX빵을 n개 만들었습니다. -> method3번을 호출해서 나온 결과
//-------------------------------------

public class BreadMain {
	public static void main(String[] args) {
		Bread br = new Bread();
		br.makeBread();
		
		Bread br1 = new Bread();
		br1.makeBread(10);
		
		Bread br2 = new Bread();
		br2.makeBread(10, "크림");
	}
}
