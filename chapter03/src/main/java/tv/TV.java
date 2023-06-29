package tv; //중복된 코드가 다수있음.

public class TV {
	private int channel; 
	private int volume;	
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public TV(){
	}
	
	public void power(boolean on) {// 파워를 키고 끄고하느 메소드
		power = on;
	}
	
	public void volume(int vol) {
		if(!power) {
			return;		//함수 종료
		}
		volume = vol;
		if(volume > 100) { //볼륨이 100보다 높으면 로테이션할 이유가 없으므로 100, 0으로 고정시켰다.
			volume = 100;
		} else if(volume < 0) {
			volume = 0;
		}
	}
	
	public void volume(boolean up){
		if(!power) {
			return;		//함수 종료
		}
		volume += (up ? 1 : -1);	//파라미터가 true일 경우: 볼륨값 +1 , false일 경우: 볼륨값-1
		if(volume > 100) {
			volume = 100;
		} else if(volume < 0) {
			volume = 0;
		}
	}
	
	public void channel(int ch) {
		if(!power) {
			return;		//함수 종료
		}
		channel = ch;
		if(channel > 255) {
			channel = channel-255;
		} else if(channel < 1) {
			channel = channel +255;
		}
	}
	
	public void channel (boolean up) {
		if(!power) {
			return;		//함수 종료
		}
		channel += (up ? 1 : -1);
		if(channel > 255) {
			channel = channel-255;
		} else if(channel < 1) {
			channel = channel +255;
		}
	}
		//this.~ 할 필요가 없죠. class안에있기때문.
	public void status() {
		System.out.println(
				"TV[채널=" + channel + 
				", 볼륨=" + volume + 
				", 전원=" + (power ? "on" : "off") + "]");
	}
}
