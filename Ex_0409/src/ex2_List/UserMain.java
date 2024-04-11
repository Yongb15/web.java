package ex2_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 유저의 아이디와 패스워드를 가지는 UserInfo 클래스를 만들고
// UserMain에서 유저의 정보를 ArrayList에 추가하되
// 기존에 추가된 아이디가 잇을 경우 "아이디가 중복됩니다"
// 라는 메세지와 함께 다시 입력받기
// ex)
// 아이디 입력 : aaa
// 패스워드 입력 : 1234
// aaa
// 1234
// ---------------
// 아이디 입력 : bbb
// 패스워드 입력 : 1234
//aaa
//1234
//---------------
// bbb
// 1234
// ---------------
// 아이디 입력 : aaa
// 패스워드 입력 : 1234
// 아이디를 다시 입력하세요

public class UserMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		UserInfo ui = new UserInfo();
		
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
			System.out.print("아이디 입력 : ");
			ui.id = sc.next();
			
			for(int i = 0; i < list.size(); i++) {
				if(ui.id.equals(list.get(i))) {
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			
			list.add(ui.id);
			
			System.out.print("비밀번호 입력 : ");
			
			ui.password = sc.next();
			list2.add(ui.password);
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
				System.out.println(list2.get(i));
				System.out.println("------------------");
			}
			
			if(list.size() == 3) {
				break;
			}
		}
		
//		List<UserInfo> list = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		
//		outer : while(true) {
//			UserInfo ui = new UserInfo();
//			
//			System.out.print("아이디 생성 : ");
//			ui.setId(sc.next());
//			
//			for(int i = 0; i < list.size(); i++) {
//				if(ui.getId().equals(list.get(i).getId())) {
//					System.out.println("아이디가 중복됩니다.");
//					continue outer;
//				}
//			}
//			
//			System.out.print("패스워드 입력 : ");
//			
//			ui.setPassword(sc.next());
//			
//			list.add(ui);
//			
//			for(UserInfo i : list) {
//				System.out.println(i.getId());
//				System.out.println(i.getPassword());
//				System.out.println("--------------");
//			}
//			
//			if(list.size() == 3) {
//				break;
//			}
//		}
	}
}
