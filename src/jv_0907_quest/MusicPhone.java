package jv_0907_quest;

public class MusicPhone {
	public void execute(String function) {
		if (function.equals("����")) {
			playMusic();
			return;
		}

		//super.execute(function);
	}

	private void playMusic() {
		System.out.print("MP3 �÷��̾�� �������");
	}
}
