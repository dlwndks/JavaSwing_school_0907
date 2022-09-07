package nuit03.LayoutExam;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloGridLayout extends JFrame{
	
	HelloGridLayout(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.gray);
		add(p);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		
//		p.setLayout(new GridLayout(0,2));
//		p.add(b1); p.add(b2); 
//		p.add(b3); p.add(b4);
//		p.add(b5); p.add(b6);
//		p.add(b7); 
			
		p.setLayout(new GridLayout(0,3,10,10));
		p.add(b1); p.add(b2); p.add(b3); 
		p.add(b4); p.add(b5); p.add(b6);
		p.add(b7); 
		
		
		setTitle("¹öÆ°Ç¥");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new HelloGridLayout();

	}

}
