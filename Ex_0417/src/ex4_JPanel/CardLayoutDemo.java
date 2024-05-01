package ex4_JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutDemo extends JPanel{
	public CardLayoutDemo() {
		JPanel cards = new JPanel(new CardLayout());
		
		// 패널 1
		JPanel card1 = new JPanel();
		JButton nextButton = new JButton("next");
		card1.setBackground(Color.YELLOW);
		card1.add(nextButton);
		
		// 패널 2
		JPanel card2 = new JPanel();
		JButton prevButton = new JButton("prev");
		card2.setBackground(Color.CYAN);
		card2.add(prevButton);
		
		cards.add(card1);
		cards.add(card2);
		
		add(cards);	
		
		// 화면 레이아웃 가져오기
		CardLayout cl = (CardLayout)cards.getLayout();
		
		nextButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(cards);
			}
		});
		
		prevButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.previous(cards);
			}
		});
	} // 생성자
	
	private static void createAndShowGUI() {
		JFrame f = new JFrame();
		CardLayoutDemo cardDemo = new CardLayoutDemo();
		
		f.setContentPane(cardDemo);
		f.setBounds(300, 300, 300, 300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		createAndShowGUI();
	}
}
