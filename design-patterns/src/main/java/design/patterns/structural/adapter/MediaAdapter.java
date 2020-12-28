package design.patterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		advancedMediaPlayer = audioType == "vlc" ? new VLCPlayer() : new MP4Player(); 
	}

	public void play(String audioType, String fileName) {
		if(audioType == "vlc") {
			advancedMediaPlayer.playVLC(fileName);
		}else {
		 advancedMediaPlayer.playMP4(fileName);
		}
	}

}
