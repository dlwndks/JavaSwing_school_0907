package nuit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloFlowLayout extends JFrame{

	HelloFlowLayout(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.gray);
		add(p);
		
		JButton b1 = new JButton("red");
		b1.setBackground(Color.red);
		p.add(b1);
		
		JButton b2 = new JButton("orange");
		b2.setBackground(Color.orange);
		p.add(b2);
		
		JButton b3 = new JButton("yellow");
		b3.setBackground(Color.yellow);
		p.add(b3);
		
		JButton b4 = new JButton("green");
		b4.setBackground(Color.green);
		p.add(b4);
		
		JButton b5 = new JButton("cyan");
		b5.setBackground(Color.cyan);
		p.add(b5);
		
		JButton b6 = new JButton("blue");
		b6.setBackground(Color.blue);
		p.add(b6);
		
		JButton b7 = new JButton("pink");
		b7.setBackground(Color.pink);
		p.add(b7);
		
		
		
		
		
		
		
		setTitle("많은 버튼들");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new HelloFlowLayout();
	}

}
