package ex1_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "C:\\web1900_KYB";
		
		File f = new File(path);
		
		String[] names = new String[100];	// 크기를 모르므로 1)
		
		// isDirectory() : 최종 목적지가 폴더면 true, 아니면 false
		if(f.isDirectory()) {
			
			// list() : 경로의 하위 요소들의 이름을 String 배열에 저장
			String[] arr = f.list();		// isDirectory 안에 넣어줘야 함 2)
			
			for(String s : arr) {
				System.out.println(s);	// 경로 안에 있는 모든 파일명 출력 / 자동 정렬
			}
		}		
	}
}
