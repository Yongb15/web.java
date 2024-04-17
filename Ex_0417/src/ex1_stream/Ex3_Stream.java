package ex1_stream;

import java.util.Arrays;

public class Ex3_Stream {
	public static void main(String[] args) {
		int[] nums = {1, 44, 33, 21, 35, 68, 99, 4, 5, 6, 1, 1, 1, 2, 2, 2};
		Arrays.stream(nums).distinct().sorted().limit(5).forEach(x -> System.out.print(x + " "));

		System.out.println();
		
		System.out.println(Arrays.toString(nums));
	}
}
