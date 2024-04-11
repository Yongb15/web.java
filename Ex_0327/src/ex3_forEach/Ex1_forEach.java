package ex3_forEach;

public class Ex1_forEach {
	public static void main(String[] args) {
		// 향상된 for문
		// JDK 1.5부터 추가된 기능으로 배열과 컬렉션의 모든 요소를 참조하기 위한 반복문
		
		// for(변수:배열) {		/ 배열의 값을 담을 수 있는 변수
		//		반복하고자 하는 명령;
		// }
		
		// for문을 실행할 반복 대상이 있으면 변수는 반복대상이 지닌 자료형과 같은 타입으로 지정해야 한다.
		// 반복 대상의 요소를 하나씩 꺼내서 변수에 대입하면서 진행하고 반복 대상의 길이만큼 꺼내서 반복한다.
		
		int[] score = { 90, 92, 93 };
		
		for(int val : score) {
			System.out.println(val);
		}
		
		System.out.println("--------------------");
		
		// 2차원 배열
		
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		for(int[] v : arr)
		{
			for(int val : v)
			{
				System.out.println(val);
			}
		}
		
		System.out.println("--------------------");
		
		
		
		
	}
}
