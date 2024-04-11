package ex3_string;

import java.util.Scanner;

public class Ex2_String {
	public static void main(String[] args) {
		// 키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		// 입력받은 문자열에서 소문자 a가 몇 개 있는지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		
		System.out.println("a의 개수 : " + count);
		
		System.out.println("---------------------------");
		
		// 키보드에서 문자열을 입력받아 회문인지 아닌지 판별
		// 회문은 앞으로 읽어도 뒤로 읽어도 똑같은 문장을 말한다. / reverse()를 사용하면 더 쉬움
		
		System.out.print("입력 : ");
		String str2 = sc.next();
		
		String rev = "";
		
		for(int i = str2.length()-1; i >= 0; i--) {
			rev += str2.charAt(i);
		}
		
		if(str2.equals(rev)) {
			System.out.println(str2 + "은 회문입니다.");
		}
		else {
			System.out.println(str2 + "은 회문이 아닙니다.");
		}
		
		System.out.println("---------------------------");
		
		// 주민번호를 입력하세요(-포함)
		// ex)911223-1122333
		// 당신은 1999년 11월 22일에 태어난 남자입니다.
		
		System.out.print("주민번호 입력 : ");
		String str3 = sc.next();
		
		if(str3.length() < 14 || str3.charAt(6) != '-') {
			System.out.println("주민번호를 올바르게 입력하세요.");
		}
		else {
			String year = "";
			String result = "";
			
			year = str3.substring(0,2);
			
			if(Integer.parseInt(year) <= 24) {
				result = "당신은 20";
			}
			else {
				result = "당신은 19";
			}
			
			result += year + "년 " + str3.substring(2,4) + "월 " + str3.substring(4,6) + "일에 태어난";
			
			if(str3.charAt(7) % 2 != 0) {
				result += " 남자입니다.";
			}
			else {
				result += " 여자입니다."; 		
			}
			System.out.println(result);
		}
		
		// 불변의 법칙
		// 문자열은 수정될 수 없다.
		// 메모리에 올라가있는 문자열은 값이 수정됐을때 기존의 메모리를 버리고 새로운 값이 들어있는 메모리를 새로 점유
		// GC(Garbage Collector)가 힙 영역을 돌아다니면서 더이상 참조되지 않는 메모리들을 수거합니다.
	}
}
