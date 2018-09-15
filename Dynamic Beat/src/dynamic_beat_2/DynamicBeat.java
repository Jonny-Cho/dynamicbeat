package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic; 
	// ���� ���۸��� ���ؼ� ��ü�̹����� ��� �ν��Ͻ�
	
	private Image introBackground;
	// ������ �̹����� ��� ��ü
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); // ����ڰ� ����� ������ �� ����
		setLocationRelativeTo(null); // ��ǻ���� ���߾ӿ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����â �� �� ���α׷� ����. (�̰� ���ٸ�? ����â ������ ���α׷� ���� x)
		setVisible(true); // ����ڰ� ���α׷��� �� �� ���� (�⺻���� false�̱� ������ �ݵ�� �ʿ�)
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(title).jpg")).getImage();
		
	}
	
	public void paint(Graphics g) { // ���� ù��°�� �̹����� �׷��ִ� ��ӵ� �Լ�
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,  0, 0,  null); // ����â�� �̹��� �׷���
	}
	
	public void screenDraw(Graphics g) { 
		g.drawImage(introBackground,  0, 0, null);
		this.repaint();
	}
	
	// paint + screenDraw -> ��ü �̹����� ���α׷� �ż������� �׷��ش�
	
}