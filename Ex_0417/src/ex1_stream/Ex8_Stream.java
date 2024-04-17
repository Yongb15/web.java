package ex1_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex8_Stream {
	public static void main(String[] args) {
		// 람다식
		// iterate(), generate()
		// 람다식을 매개 변수로 받아서 람다식에 의해 계산되는 값들을 요소로 하는 무한 스트림 생성
		
		// iterate() : 이전 결과를 이용해 다음 요소를 계산
		int[] nums = IntStream.iterate(1, x -> x * 2).limit(10).toArray();
		System.out.println(Arrays.toString(nums));
		
		// generator() : 이전 결과를 사용하지 않고 람다식에 의해 계산되는 값을 요소로하는 무한 스트림으로 이전 결과를 사용하지 않으므로 매개 변수의 타입이 Supplier임
		int[] nums2 = IntStream.generate(() -> (int)Math.random() * 101).limit(10).toArray();
		System.out.println(Arrays.toString(nums2));
	}
}