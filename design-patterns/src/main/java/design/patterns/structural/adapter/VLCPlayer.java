package design.patterns.structural.adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

	public void playVLC(String fileName) {
		System.out.println("now vlc playing. Name:"+	fileName);
		
	}

	public void playMP4(String fileName) {
		//
	}

}
