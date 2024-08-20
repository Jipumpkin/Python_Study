package MusicPlayer;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {
	
	MP3Player mp3 = new MP3Player();
	
	ArrayList<Music> musicList = new ArrayList<>();
	
	// 노래가 재생중인지 아닌지 확인 후 노래를 멈추는 기능
	// - musicstop() : 
	public void musicStop() {
		if(mp3.isPlaying()) {
			mp3.stop();
		}
	}
	
	//이전곡을 재생시키는 기능
	
	public int preMusic(int index, ArrayList<Music> musicList) {
		if(index == 0) {
			index = 9;
		}else {
			index--;
		}
		mp3.play(musicList.get(index).getPath());
		musicList.get(index).showMusic();
		
		return index;
	}
		
	
	public int nexMusic(int index, ArrayList<Music> musicList) {
		if(index == 9) {
			index = 0;
		}else {
			index++;
		}
		mp3.play(musicList.get(index).getPath());
		
		return index;
	}
	
	
	
}
