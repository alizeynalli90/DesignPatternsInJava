package design.patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer{
	
	private MediaAdapter mediaAdapter;
	
	public void play(String audioType, String fileName) {
		if(audioType ==  "mp3") {
			System.out.println("now mp3 playing. Name:" + fileName);
		}else if(audioType == "vlc" || audioType == "mp4") {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("invalid media.");
		}
	
		
	}

}
