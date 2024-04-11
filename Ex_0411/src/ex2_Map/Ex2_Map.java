package ex2_Map;

import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<>();
		
		map.put("k1", 100.0f);
		map.put("k2", 3.14f);
		map.put("k3", 4.15f);
		
		// value값 조회하기
		System.out.println(map.get("k1"));
		
		// 요소 삭제
		map.remove("k1");
		System.out.println(map);
		
		// map의 크기
		System.out.println("map의 크기 : " + map.size());
		
		// containsKey(Object key)
		// map 객체 안에 해당 key가 존재하냐?
		
		if(map.containsKey("k2")) {
			System.out.println("k2라는 key가 존재합니다!");
		}
		
		// containsValue(Object value)
		// map 객체 안에 해당 value가 존재하냐?
		
		if(map.containsValue(3.14f)) {
			System.out.println("3.14라는 value가 있습니다!");
		}
		
		// isEmpty()
		// 요소가 있는지 검사
		// 비어있으면 true
		
		if(map.isEmpty()) {
			System.out.println("map이 비어있습니다!");
		}
		
		// get()
		// key에 해당하는 value
		System.out.println(map.get("k2"));
	}
}
