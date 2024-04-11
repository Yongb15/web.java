package ex5_generic;

public class PeopleMain {
	public static void main(String[] args) {
		People<String, Integer> p1 = new People<>("제임스", 30);
		People<String, Integer> p2 = new People<>("스티브", 25);
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("----------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}
}
