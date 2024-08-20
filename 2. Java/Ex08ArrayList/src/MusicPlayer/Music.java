package MusicPlayer;

public class Music {
	
	
	
	
	
	// 필드
	// 가수 : singer
	// 제목 : title
	// 재생시간 : playTime
	// 경로 : path
	
	// 셍성자 : 4개의 매개변수를 가지는 생성자
	
	// 4개의 필드에 대한 게터세터 만들기
	
	private String singer;
	private String title;
	private int playTime;
	private String path;

	public Music(String path1, String title1,String singer1, int playTime1) {
		singer = singer1;
		path = path1;
		playTime = playTime1;
		title = title1;
		
		
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public void showMusic() {
		System.out.println(title+":"+singer+":"+playTime/60+"분 "+playTime%60+"초");
	}
	
}
