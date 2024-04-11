package ex1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

// HashSet과 ArrayList를 이용하여 5 * 5의 랜덤 빙고판 만들기
// 1 ~ 50까지 25개를 뽑아서 랜덤으로 배치
public class Bingo {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		
		while(true) {
			set.add(r.nextInt(1, 51));
			
			if(set.size() == 25) {
				break;
			}
		}
		
		List<Integer> list = new ArrayList<>(set);
		
		Collections.shuffle(list);
		
		int[][] board = new int[5][5];				
		
		Iterator<Integer> iter = list.iterator();
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = iter.next();
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
		}
		
	}
}
