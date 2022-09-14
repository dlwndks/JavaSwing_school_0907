package nuit03.LayoutExam;

import java.awt.GridLayout;

import javax.swing.*;

public class LayoutTest extends JFrame{

	LayoutTest(){
		
		//패널 나누기
		setLayout(new GridLayout(0,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		add(p1);
		add(p2);
		
		//첫번째 패널(그리드)
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		
		p1.setLayout(new GridLayout(0,2,0,0));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		//두번째 패널
		JButton b5 = new JButton("버튼5");
		JButton b6 = new JButton("버튼6");
		JButton b7 = new JButton("버튼7");
		
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		
		setTitle("레이아웃 섞기");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
		new LayoutTest();
		
	}

}
