package ex3_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex1_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		// set에 데이터 추가하기
		set.add("f");
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("d");
		
		System.out.println(set);		// 넣은 순서대로 나오지는 않음
		
		// set에는 중복되는 데이터를 추가할 수 없다.
		set.add("a");
		set.add("b");
		
		System.out.println(set);		// a와 b 추가 x
		
		// set에 저장되어있는 a라는 데이터를 제거
		set.remove("a");
		
		System.out.println(set);
		
		// 모든 요소 제거
//		set.clear();
		set.removeAll(set);
		
		System.out.println(set);
		
		// 중복이 없기 때문에 난수를 생성해서 넣기가 편함
		Set<Integer> set2 = new HashSet<>();
		Random r = new Random();
		
		// 로또번호 6개 넣기
		while(true) {
			if(set2.size() < 6) {
				set2.add(r.nextInt(1, 46));
			}
			else {
				System.out.println(set2);
				break;
			}
		}
		
		while(set2.size() == 6) {
			if(set2.size() < 6) {
				set2.add(r.nextInt(1, 46));
			}
			else {
				System.out.println(set2);
				break;
			}
		}
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7,8));
		
		System.out.println(list);
		
		Set<Integer> set3 = new HashSet<>(list);
		
		System.out.println(set3);
	}
}
