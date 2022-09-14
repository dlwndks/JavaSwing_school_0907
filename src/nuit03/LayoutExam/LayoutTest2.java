package nuit03.LayoutExam;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class LayoutTest2 extends JFrame{

	LayoutTest2(){
		
		setLayout(new BorderLayout());
		
		//패널 나누기
		JPanel p1 = new JPanel();
		add(p1, BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		add(p2, BorderLayout.CENTER);

		JPanel p3 = new JPanel();
		add(p3, BorderLayout.SOUTH);
		
		//패널1
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		
		p1.add(b1);
		p1.add(b2);
		
		//패널2
		JButton b3 = new JButton("버튼3");
		JButton b4 = new JButton("버튼4");
		
		b3.setSize(200,150);
		b4.setSize(200,150);
		
		p2.setLayout(new GridLayout(0,2));
		
		p2.add(b3);
		p2.add(b4);
		
		//패널3
		JButton b5 = new JButton("버튼5");
		JButton b6  = new JButton("버튼6");
		
		p3.add(b5);
		p3.add(b6);		
		
		
		setTitle("레이아웃 섞기");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new LayoutTest2();
		
	}

}
