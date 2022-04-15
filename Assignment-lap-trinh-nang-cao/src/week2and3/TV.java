package week2and3;

public class TV {
	
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
	public TV() {
		
	}
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	public void setChannel(int newChannel) {
		if(this.on == true) {
			if(newChannel >=1 && newChannel <= 120) {
				this.channel = newChannel;
			}
			else {
				System.out.println("Invalid channel. Please set again");
			}
		}
		else {
			//do nothing because TV is off
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if(this.on == true) {
			if(newVolumeLevel >= 1 && newVolumeLevel <=7 ) {
				this.volumeLevel = newVolumeLevel;
			}
			else {
				System.out.println("Invalid Volume. Please set again");
			}
		}
		else {
			//do nothing because TV is off
		}
	}
	
	public void channelUp() {
		if(this.on == true) {
			if(this.channel < 119) {
				this.channel ++;
			}
			else {
				//do nothing
			}
		}
		else {
			///do nothing
		}
		
	}
	
	public void channelDown() {
		if(this.on == true) {
			if(this.channel > 1) {
				this.channel --;
			}
			else {
				//do nothing
			}
		}
		else {
			///do nothing
		}
	}
	
	public void volumeUp() {
		if(this.on == true) {
			if(this.volumeLevel < 7) {
				this.volumeLevel ++;
			}
			else {
				//do nothing
			}
		}
		else {
			///do nothing
		}
	}
	
	public void volumeDown() {
		if(this.on == true) {
			if(this.volumeLevel > 1) {
				this.volumeLevel --;
			}
			else {
				//do nothing
			}
		}
		else {
			///do nothing
		}
	}
	
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOff();
		// when TV off. do nothing. So I will turn on TV
		tv.turnOn();
		tv.setChannel(120);
		tv.setVolume(7);
		tv.channelUp();
		tv.channelDown();
		tv.volumeDown();
		tv.volumeUp();
		System.out.println("The current channel of this TV: " + tv.channel);
		System.out.println("The current volume level of this TV: " + tv.volumeLevel);
		System.out.print("TV is : ");
		System.out.println(tv.on == true?"on":"off");
	}
}
