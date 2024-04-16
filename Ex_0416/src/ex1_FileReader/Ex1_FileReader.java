package ex1_FileReader;

import java.io.FileReader;


public class Ex1_FileReader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\web1900_KYB/test.txt");
			
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.print(code + " ");
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
