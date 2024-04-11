package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest a = new MethodTest();
		
		System.out.println("합은 : " + a.add(2, 3));
		
		System.out.println("----------------------");
		
		a.sum(10);
		
		System.out.println("----------------------");
		
		int[] arr = {3,6,1,2,5};
		
		a.maxFinder(arr);
		
		System.out.println("----------------------");
		
		a.circleArea(5);
		
		System.out.println("----------------------");
		
		a.circleRound(5);
		
		System.out.println("----------------------");
	}
}
