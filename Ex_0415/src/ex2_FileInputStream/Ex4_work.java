package ex2_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

// 특정 경로에 file.txt 문서를 만들고 아무 문장이나 입력
// file.txt의 내용을 FileInputStream으로 읽어온 뒤 이 값이 회문인지 아닌지 판별

public class Ex4_work {
	public static void main(String[] args) {
		String path = "C:\\web1900_KYB/file.txt";
		
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		try {
			FileInputStream fis = new FileInputStream(f);
			
			fis.read(read);
			
			String ori = new String(read);
			
			StringBuilder rev = new StringBuilder(ori).reverse();
			
			if(ori.equals(rev.toString())) {
				System.out.println(ori + "는 회문입니다.");
			}
			else {
				System.out.println(ori + "는 회문이 아닙니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
