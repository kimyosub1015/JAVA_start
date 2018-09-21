package jv_0906;

public class TV {
	private int channel = 0;
	private int volume = 0;
	private boolean power = false;

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void isPower(){
		power = true;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void power(boolean c){
		
	}
	public void channel(boolean a){
		
	}
	public void channel(int j) {
		
	}
	public void volume(int i){
		
	}
	public void volume(boolean up) {
		if(up)
			this.volume++;
		else
			this.volume--;
		
	}

	public void status() {
		String tvPower = "";
		if((this.power) == false){
			tvPower = "On";
		}
		else {
			tvPower = "Off";
		}
		
				
		
	}


}
