package ex1_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		
		String path = "C:\\web1900_KYB/aaa/bbb";
		
		File f = new File(path);
		
		// exists() : 경로로 접근하는 중 정상적으로 파일이나 폴더가 존재하면 true, 존재하지 않으면 false
		if(!f.exists()) {	// 존재하지 않은 파일이므로 false가 나옴, 그래서 !연산자 사용
			System.out.println("폴더 생성!");
			
			// mkdir() : 폴더 생성하는 메서드(하나만 만들어짐 / 두 개 이상 만들어지지 않음)
			// mkdirs() : 폴더 생성하는 메서드(여러 개 만들어짐 / 한 개도 생성 가능)
			f.mkdirs();
		}
		
		// 코드를 통해 목적지를 자동으로 만들어줌
		// 실제로 많은 프로그램들이 이런 기능들을 가진 클래스를 가지고 있음 / 파일을 만드는 기능 X
	}
}	
