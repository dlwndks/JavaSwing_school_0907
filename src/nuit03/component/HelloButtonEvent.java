package nuit03.component;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloButtonEvent extends JFrame implements ActionListener{
	
	//이벤트 소스다 될 수 있는 컨포너드는  다른 곳에서도 사용될 수 있으므로 멤버 변수로 선언
	JPanel p;
	JButton b1, b2;
	
	HelloButtonEvent(){
		
		p = new JPanel();
		
		add(p);
		
		b1 = new JButton("노란색");
		b2 = new JButton("핑크색");
		
		p.add(b1);
		p.add(b2);
		
		//버튼에 리스너 달기
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setTitle("버튼효과");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new HelloButtonEvent();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			p.setBackground(Color.YELLOW);
			JOptionPane.showMessageDialog(null,  e.getActionCommand()+"버튼이 클릭이 되었습니다.");
		}
		else if(e.getSource() == b2) {
			p.setBackground(Color.PINK);
			JOptionPane.showMessageDialog(null,  e.getActionCommand()+"버튼이 클릭이 되었습니다.");
		}
	}
	
	
	
}
