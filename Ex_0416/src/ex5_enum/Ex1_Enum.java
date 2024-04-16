package ex5_enum;

import java.util.Arrays;

public class Ex1_Enum {
	public static void main(String[] args) {
		Item[] items = Item.values();
		
		System.out.println(Arrays.toString(items));
		
		// 열거형의 순서 반환
		
		for(Item item : items) {
			System.out.println("name = " + item.name() + ", ordinal" + item.ordinal());
		}
		
		Item i1 = Item.START;
		System.out.println(i1);
		
		Item i2 = Item.valueOf("START");
		System.out.println(i2);
		
		Item i3 = Item.valueOf(Item.class, "START");
		System.out.println(i3);
		
		Item i4 = Item.STOP;
		
		System.out.println(i1 == i2);
		System.out.println(i1 == i4);
		
		// 열거형 데이터 비교 특징
		// 상수간의 비교에는 ==만 사용할 수 있다.(상수의 주소 비교)
		// <, > 와 같은 비교연산자는 사용할 수 없고 compareTo()는 사용 가능
		
//		System.out.println(i1 > i4);	/  사용X
		
		// 크다(1), 같다(0), 작다(-1)
		
		int res1 = i4.compareTo(i1);	// -1 출력
		System.out.println(res1);
		
		int res2 = i1.compareTo(i2);	// 1 출력
		System.out.println(res2);
		
		switch (i1) {
		case START: 
			System.out.println("게임시작");
			break;
		case STOP :
			System.out.println("게임멈춤");
			break;
		case EXIT :
			System.out.println("게임종료");
			break;
		}
	}
}
