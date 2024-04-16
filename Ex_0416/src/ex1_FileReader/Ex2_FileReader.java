package ex1_FileReader;
// test.txt에 아무 내용이나 적기 한글, 영어, 대문자, 소문자 등 섞어서 작성
// test.txt의 내용을 읽어와서 영어 대문자와 소문자의 개수 출력

import java.io.FileReader;
import java.nio.CharBuffer;
import java.util.Arrays;

// 대문자 : x개
// 소문자ㅣ : x개
public class Ex2_FileReader {
	public static void main(String[] args) {
		
		int upper = 0;
		int lower = 0;
		
		try {
			FileReader fr = new FileReader("C:\\web1900_KYB/test.txt");
									
			int code = 0;
			
			while((code = fr.read()) != -1) {
				if(code >= 'a' && code <= 'z') {
					lower++;
				}
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
			}
			
			fr.close();
			
			System.out.println("대문자의 개수는 " + upper + "개이고 소문자의 개수는 " + lower + "개입니다.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
