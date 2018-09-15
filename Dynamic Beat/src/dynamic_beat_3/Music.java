package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{
	
	private Player player;
	private boolean isLoop; // ���� �ݺ����� Ȯ��
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	
	public Music(String name, boolean isLoop){
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI()); // �������� ��ġ
			fis = new FileInputStream(file); // ���� ���ۿ� ���
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() { // 0.001�� �������� �м�
		if (player == null) {
			return 0;
		}
		return player.getPosition();
	}
	
	public void close() { // ���� (�÷����߿��� ����)
		isLoop = false;
		player.close();
		this.interrupt(); // �ش� ������(���� ���� ���α׷�)�� ���� ���·�
	}
	
	@Override
	public void run() { // ���� �� ����
		try {
			do {
				player.play();
				fis = new FileInputStream(file); // ���� ���ۿ� ���
				bis = new BufferedInputStream(fis);
				player = new Player(bis); // ����ڿ� ����
			} while (isLoop);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}