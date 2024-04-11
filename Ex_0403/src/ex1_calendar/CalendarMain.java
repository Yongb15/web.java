package ex1_calendar;

public class CalendarMain {
	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new Calendar("검은색", 12);
		
		c.info();
		c.hanging();
		// c.onTheDesk();	/ 자식 클래스 호출 X
	}
}
