package ex4_final;

public class BookMain {
	public static void main(String[] args) {
		Comic comic = new Comic("주술회전", "게게", true);
		
		comic.info_title();
		comic.info_author();
		comic.info_color();
		
		// 생성자에는 final을 붙일 수 없다.
	}
}
