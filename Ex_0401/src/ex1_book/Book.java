package ex1_book;

public class Book {
	
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	public Book()
	{
		
	}
	
	// 오버로딩 : 매개변수의 개수가 다른 경우
	public Book(String t)
	{
		title = t;
	}
	
	// 오버로딩 : 매개변수의 개수가 다른 경우
	public Book(String t, int p)
	{
		title = t;
		page = p;
	}
	
	// 오버로딩 : 매개변수의 개수는 같으나 타입이 다른 경우 or 순서가 다른 경우 
	public Book(int s, String t)
	{
		title = t;
		series = s;
	}
}
