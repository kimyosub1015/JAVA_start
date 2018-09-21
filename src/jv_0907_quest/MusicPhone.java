package jv_0907_quest;

public class MusicPhone {
	public void execute(String function) {
		if (function.equals("음악")) {
			playMusic();
			return;
		}

		//super.execute(function);
	}

	private void playMusic() {
		System.out.print("MP3 플레이어에서 음악재생");
	}
}
