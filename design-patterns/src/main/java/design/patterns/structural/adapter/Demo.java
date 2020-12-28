package design.patterns.structural.adapter;

public class Demo {
	
	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "test.mp3");
		player.play("mp4", "test.mp4");
		player.play("vlc", "test.vlc");
		player.play("avi", "test.avi");
	}

}
