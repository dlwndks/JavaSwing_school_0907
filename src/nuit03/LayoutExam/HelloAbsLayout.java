package nuit03.LayoutExam;

import javax.swing.*;

public class HelloAbsLayout extends JFrame{

	HelloAbsLayout(){
		
		setLayout(null);
		
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");
		
		b1.setSize(70, 40);
		b1.setLocation(10, 30);
		
		b2.setSize(90, 20);
		b2.setLocation(150, 30);
		
		add(b1);
		add(b2);
		
		
		
		
		setTitle("배치관리자가 없는 절대값 레이아웃");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new HelloAbsLayout();
		
	}

}
