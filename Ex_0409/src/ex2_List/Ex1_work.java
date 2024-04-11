package ex2_List;
// ArrayList 문제
// 아래의 결과를 도출하세요
// 아이디 생성 : abc
// abc
// 아래의 결과를 도출하세요
// 아이디 생성 : abc2
// abc abc2
// 아래의 결과를 도출하세요
// 아이디 생성 : abc3
// abc abc3 abc3

// -------------------

// 아이디 생성 : abc
// abc
// 아이디 생성 : abc
// abc
// 중복된 아이디
// 아이디 생성 : abc2
// abc abc2
// 아이디 생성 : abc3
// abc abc2 abc3

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String id = ""; 
		
		for(int i = 0; i < 3; i++) {
			System.out.print("아이디 생성 : ");
			
			list.add(sc.next());
			
			id += list.get(i) + " ";
			
			System.out.println(id);
		}
		
		System.out.println();
		
		while(true) {
			System.out.print("아이디 생성 : ");
			
			list2.add(sc.next());
			
			for(String s : list2) {
				System.out.print(s + " ");
			}
			System.out.println();
			
			if(list2.size() == 3) {
				break;
			}
		}
		
		outer:while(true) {
			System.out.print("아이디 생성 : ");
			
			String id2 = sc.next();
			
			for(int i = 0; i < list3.size(); i++) {
				if(id2.equals(list3.get(i))) {
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			
			list3.add(id2);
			
			for(String s : list3) {
				System.out.print(s + " ");
			}
			System.out.println();
			
			if(list3.size() == 3) {
				break;
			}
		}
	}
}
