package ex2_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInputStream {
	public static void main(String[] args) {
		String path = "C:\\web1900_KYB/test.txt";
		
		File f = new File(path);
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				while((code = fis.read()) != -1) {
					System.out.print((char)code + " ");
				}
				
				// 스트림은 사용이 완료된 이후 close()를 통해 닫아야 함. / 다음 작업 지장 X
				fis.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
