package ex2_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInputStream {
	public static void main(String[] args) {
		
		String path = "C:\\web1900_KYB/test.txt";
		
		File f = new File(path);
		
		byte[] read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				fis.read(read);
				
				String res = new String(read);
				
				System.out.println(res);
				
				
			} 
			catch (Exception e) {
				// TODO: handle exception
			} 
			finally {
				try {
					fis.close();
				} 
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}
}
