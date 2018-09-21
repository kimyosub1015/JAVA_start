package jv_0905_package;

public class Song {
	private String title		= "";
	private String artist				= "";
	private String album	= "";
	private String composer		= "";
	private int year = 0;
	private int track = 0;
/*
	public Song() {System.out.println("111111");}
	public Song(String title){
		`this();
		this("ss","aa");
	}
	public Song(String title,String artist	){
		System.out.println("22222222");
	}
	//this를 두번 부를 수 없다!
	*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track){
		this.track = track;
	}
	public void show(){
		System.out.println(artist+" "+title+" ( "+album+", "+year+" "+track+"번 track, "+composer+" 작곡 )");
	}

}

