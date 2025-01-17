package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{
	
	private Player player;
	private boolean isLoop; // 음악 반복여부 확인
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	
	public Music(String name, boolean isLoop){
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI()); // 음악파일 위치
			fis = new FileInputStream(file); // 파일 버퍼에 담아
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() { // 0.001초 단위까지 분석
		if (player == null) {
			return 0;
		}
		return player.getPosition();
	}
	
	public void close() { // 종료 (플레이중에도 가능)
		isLoop = false;
		player.close();
		this.interrupt(); // 해당 스레드(음악 실행 프로그램)를 중지 상태로
	}
	
	@Override
	public void run() { // 게임 곡 실행
		try {
			do {
				player.play();
				fis = new FileInputStream(file); // 파일 버퍼에 담아
				bis = new BufferedInputStream(fis);
				player = new Player(bis); // 사용자에 전달
			} while (isLoop);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
