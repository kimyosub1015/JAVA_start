package jv_0905_package;

public class show {

	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("������");
		song.setArtist("������");
		song.setAlbum("Real");
		song.setComposer("�̹μ�");
		song.setYear(2010);
		song.setTrack(3);
		song.show();
		
		System.out.println(song.getArtist()+" "+song.getTitle()+" ( "+song.getAlbum()+", "+song.getYear()+" "+song.getTrack()+"�� track, "+song.getComposer()+" �۰� )");

	}

}
