package ex1_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_ArrayList {
	public static void main(String[] args) {
		List<ArrayFriend> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		ArrayFriend af1 = new ArrayFriend();
		
		af1.name = "제임스";
		af1.age = 20;
		
		list.add(af1);

		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);
		
	}
}
