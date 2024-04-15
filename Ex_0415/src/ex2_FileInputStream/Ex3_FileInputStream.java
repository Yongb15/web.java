package ex2_FileInputStream;

public class Ex3_FileInputStream {
	public static void main(String[] args) {
		byte[] keyboard = new byte[100];
		
		try {
			System.out.print("값 : ");
			System.in.read(keyboard);	// scanner 대신 사용
			
			String s = new String(keyboard).trim();
			
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
