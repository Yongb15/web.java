package ex5_enum;

// 상수들의 집합
// enum 타입의 클래스


public enum Item {START("시작", "s"), STOP("멈춤", "p"), EXIT("종료", "e");
	
//	public class Item {
//		public static final Item START = new ItemEvent("시작", "s");
//		public static final Item STOP = new ItemEvent("멈춤", "p");
//		public static final Item EXIT = new ItemEvent("종료", "e");
//	}
	
	protected String itemStr;
	protected String symbol;
	
	Item(String itemStr, String symbol) {
		this.itemStr = itemStr;
		this.symbol = symbol;
	}
	
	public String getItemStr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}

}
// Enum 클래스가 컴파일 될 때 자동으로 추가되는 메서드
// name() : 열거형의 상수의 이름을 문자열로 반환
// ordinal() : 열거형 상수가 정의된 순서를 반환
// valueOf("상수명") : String값을 enum에서 가져온다 / 값이 없으면 예외 발생
// valueOf(item.class. "상수명") : 넘겨받은 class에서 상수명을 찾아서 가져옴
// values() : 열거형 상수 안에 들어있는 내용들을 enum 타입의 배열로 반환