package nuit03.component;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloButtonEvent extends JFrame implements ActionListener{
	
	//�̺�Ʈ �ҽ��� �� �� �ִ� �����ʵ��  �ٸ� �������� ���� �� �����Ƿ� ��� ������ ����
	JPanel p;
	JButton b1, b2;
	
	HelloButtonEvent(){
		
		p = new JPanel();
		
		add(p);
		
		b1 = new JButton("�����");
		b2 = new JButton("��ũ��");
		
		p.add(b1);
		p.add(b2);
		
		//��ư�� ������ �ޱ�
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setTitle("��ưȿ��");
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
			JOptionPane.showMessageDialog(null,  e.getActionCommand()+"��ư�� Ŭ���� �Ǿ����ϴ�.");
		}
		else if(e.getSource() == b2) {
			p.setBackground(Color.PINK);
			JOptionPane.showMessageDialog(null,  e.getActionCommand()+"��ư�� Ŭ���� �Ǿ����ϴ�.");
		}
	}
	
	
	
}
