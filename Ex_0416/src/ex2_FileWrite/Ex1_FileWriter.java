package ex2_FileWrite;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\web1900_KYB/fileWriter예제.txt", true);
			
			fw.write("첫 번째 줄 작성\n");
			fw.write("두 번째 줄 작성\n");
			fw.write("세 번째 줄 작성\n");
			
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
