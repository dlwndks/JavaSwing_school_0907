package nuit03.LayoutExam;

import javax.swing.JFrame;

//2. JFrame 상속 받기
public class HelloSwing extends JFrame{
	
	//생성자 안에서 화면을 구현
	HelloSwing(){
		
		//3. 화면 초기화 하기
		setTitle("안녕 스윙");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		//1.new 생성자()로 윈도우	프로그램 실행시키기	
		new HelloSwing();
		
	}

}
