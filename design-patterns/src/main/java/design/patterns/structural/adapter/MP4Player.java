package design.patterns.structural.adapter;

public class MP4Player implements AdvancedMediaPlayer {

	public void playVLC(String fileName) {
		// 
	}

	public void playMP4(String fileName) {
		System.out.println("now mp4 playing. Name:"+	fileName);

	}

}
