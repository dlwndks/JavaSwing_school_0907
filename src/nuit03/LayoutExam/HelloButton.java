package nuit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton extends JFrame{
	
	HelloButton(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.CYAN);
		add(p);
		
		JButton jb = new JButton("버튼1");
		p.add(jb);
		
		//프레임의 기본 세팅
		setTitle("안녕 버튼");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new HelloButton();
		
	}

}
