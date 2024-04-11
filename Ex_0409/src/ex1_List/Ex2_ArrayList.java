package ex1_List;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		
		list.add(10);			// 1번 index 생성
		list.add(10);			// 2번 index 생성
		list.add(1 , 14);		// 1번 index에 값을 추가함 원래 1번 index의 값인 10은 2번 index로 밀려남
								// 데이터를 1번 index에 추가하여 방 번호가 밀림
		
		list.set(2, 20);		// 2번 index의 값인 10을 20으로 바꿈
		
		list.add(50);			// 3번 index 생성
		
		System.out.println(list);
		
		int res = list.remove(1);
		// 중간의 요소를 삭제하면 index가 당겨진다.
		System.out.println(res);
		
		System.out.println(list);
		
		list.clear();
		
		System.out.println(list);
		
	}
}
