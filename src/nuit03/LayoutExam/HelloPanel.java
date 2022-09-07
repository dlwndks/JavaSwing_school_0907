package nuit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	
	HelloPanel(){
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.black);
		add(jp1);
		
		JButton jb1 = new JButton("버튼1");
		jb1.setBackground(Color.yellow);
		jp1.add(jb1);
		
		JButton jb2 = new JButton("버튼2");
		jb2.setBackground(Color.pink);
		jp1.add(jb2);

		
		setTitle("버튼이 2개!");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloPanel();
	}

}
