package jv_0905_package;

public class show {

	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("Real");
		song.setComposer("이민수");
		song.setYear(2010);
		song.setTrack(3);
		song.show();
		
		System.out.println(song.getArtist()+" "+song.getTitle()+" ( "+song.getAlbum()+", "+song.getYear()+" "+song.getTrack()+"번 track, "+song.getComposer()+" 작곡 )");

	}

}
