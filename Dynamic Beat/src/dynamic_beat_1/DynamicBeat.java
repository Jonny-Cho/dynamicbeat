package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); // 사용자가 사이즈를 조정할 수 없음
		setLocationRelativeTo(null); // 컴퓨터의 정중앙에서 시작
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임창 끌 때 프로그램 종료. (이게 없다면? 게임창 끄더라도 프로그램 종료 x)
		setVisible(true); // 사용자가 프로그램을 볼 수 있음 (기본값은 false이기 때문에 반드시 필요)
	}
	
}
