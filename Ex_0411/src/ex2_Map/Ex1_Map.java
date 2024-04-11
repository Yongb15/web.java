package ex2_Map;

import java.util.HashMap;
// Map
// 데이터를 키(key)와 값(value)가 한 쌍으로 저장되는 방식을 사용하는 자료구조
// index가 없고 키를 통해 추가, 조회, 삭제, 수정을 함
// key를 통해 값을 검색하므로 많은 양의 데이터를 조회하는데 있어 매우 뛰어난 성능을 발휘

// Hashmap
// map 인터페이스를 구현하고 잇는 클래스 중 가장 많이 사용하는 클래스
public class Ex1_Map {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		
		// 데이터의 추가
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
	
		// map에 저장되는 value는 중복될 수 있음
		map.put(4, 'A');
		
		System.out.println(map);
		
		// map에 key는 중복될 수 없음
		// 이미 있는 key가 있다면 value가 갱신됨
		map.put(1, 'F');
		
		System.out.println(map);
		
		
	}
}
