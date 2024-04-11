package ex2_student;

public class Student {
	
	String name;
	int age;
	int studentID;
	
	// this
	// 객체 자기 자신을 스스로 참조
	// this 참조 변수는 객체가 자기 자신을 참조하는데 사용하는 변수
	// this를 필드에 붙여서 사용하면 중괄호 안에서도 같은 이름의 매개변수와 필드를 구분해서 사용 가능
	
	public Student(String name, int age, int studentId)
	{
		this.name = name;
		this.age = age;
		this.studentID = studentID;
	}
	
	
}
