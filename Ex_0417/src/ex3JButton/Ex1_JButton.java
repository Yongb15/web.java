package ex3JButton;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

import ex2_JFrame.JFrameTest;

// JButton은 클릭 기능을 제공
// JButton 클래스는 문자열 또는 아이콘을 사용하여 버튼을 생성할 수 있음
// AbstractButton 클래스로 부터 상속 받음
public class Ex1_JButton{
	public static void main(String[] args) {
		JButton jbtn1,jbtn2, jbtn3;
		
		JFrame f = new JFrame();
		
		jbtn1 = new JButton("1");
		// 프레임의 레이아웃이 flowLayout일 때 버튼의 크기를 수정하고 싶으면 setPreferredSize(new Dimension(가로, 세로));
		jbtn1.setPreferredSize(new Dimension(100, 100));
		jbtn2 = new JButton("2");
		jbtn2.setPreferredSize(new Dimension(100, 100));
		jbtn3 = new JButton("3");
		jbtn3.setPreferredSize(new Dimension(100, 100));
		
		f.add(jbtn1);
		f.add(jbtn2);
		f.add(jbtn3);
		
		f.setLayout(new FlowLayout());
		f.setTitle("제목2");
		f.setBounds(300, 300, 500, 500);
		f.setVisible(true);
		
		
	}
}
