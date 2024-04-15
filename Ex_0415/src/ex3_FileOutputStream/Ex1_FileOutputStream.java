package ex3_FileOutputStream;

import java.io.FileOutputStream;

public class Ex1_FileOutputStream {
	public static void main(String[] args) {
		try {
			// FileOutputStream(경로, 이어쓰기 옵션);
			// 이어쓰기 옵션이 true이면 기존 파일에 이어서 내용 추가 false면 기존 내용을 무시하고 새로 작성
			FileOutputStream fos = new FileOutputStream("C:/web1900_KYB/fileOut.txt", true);
		
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			
			String msg = "\nfileOutpuit 예제입니다.";
			String msg2 = "\n여러 줄도 가능합니다!!\n";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
