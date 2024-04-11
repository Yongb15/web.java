package ex1_List;

import java.lang.invoke.CallSite;
import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		// list의 데이터 추가
		list.add(100);
		list.add(100);
		list.add(20);
		
		// list의 크기
		System.out.println("list의 크기 : " + list.size());
		
		System.out.println(list);			// toString을 오버라이딩 함
		
		// 2번 index의 값을 반환
		int res = list.get(2);
		
		System.out.println(res);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		// 향상된 for문
		for(int i : list) {
			System.out.print(i + " ");
		}
	}
}
