package ex3_lamda;

public class Calculator {
	public static void main(String[] args) {
		MyCalculator calc = (num1, num2) -> num1 + num2;
		
		int result = calc.plus(20, 30);
		
		System.out.println(result);
	}
}
