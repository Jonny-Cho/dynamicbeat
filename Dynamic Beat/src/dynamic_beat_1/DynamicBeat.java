package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); // ����ڰ� ����� ������ �� ����
		setLocationRelativeTo(null); // ��ǻ���� ���߾ӿ��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����â �� �� ���α׷� ����. (�̰� ���ٸ�? ����â ������ ���α׷� ���� x)
		setVisible(true); // ����ڰ� ���α׷��� �� �� ���� (�⺻���� false�̱� ������ �ݵ�� �ʿ�)
	}
	
}