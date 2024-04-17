package ex1_stream;

import java.util.stream.IntStream;

public class Ex6_Stream {
	public static void main(String[] args) {
		int total = 0;
		
		for(int i = 1; i < 11; i++) {
			total += i;
		}
		
		System.out.println("1부터 10까지의 총 합 : " + total);
		
		System.out.println("--------------------");
		
		int total2 = IntStream.rangeClosed(1, 10).sum();		// rangeClosed(1, 10) : 범위를 얻는 메서드
		
		System.out.println("1부터 10까지의 총 합 : " + total2);
	}
}
