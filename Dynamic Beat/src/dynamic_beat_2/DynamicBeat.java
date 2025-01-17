package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic; 
	// 더블 버퍼링을 위해서 전체이미지를 담는 인스턴스
	
	private Image introBackground;
	// 저장한 이미지를 담는 객체
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); // 사용자가 사이즈를 조정할 수 없음
		setLocationRelativeTo(null); // 컴퓨터의 정중앙에서 시작
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임창 끌 때 프로그램 종료. (이게 없다면? 게임창 끄더라도 프로그램 종료 x)
		setVisible(true); // 사용자가 프로그램을 볼 수 있음 (기본값은 false이기 때문에 반드시 필요)
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(title).jpg")).getImage();
		
	}
	
	public void paint(Graphics g) { // 가장 첫번째로 이미지를 그려주는 약속된 함수
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,  0, 0,  null); // 게임창에 이미지 그려짐
	}
	
	public void screenDraw(Graphics g) { 
		g.drawImage(introBackground,  0, 0, null);
		this.repaint();
	}
	
	// paint + screenDraw -> 전체 이미지를 프로그램 매순간마다 그려준다
	
}
