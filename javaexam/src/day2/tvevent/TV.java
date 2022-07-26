package day2.tvevent;

public class TV {
	
	private String model;
	private int size;
	private int channel;
	
	public TV() {}
	public TV(String model,int size,int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUp() {
		final int MAX_CHANNEL = 10;
		channel = (channel==MAX_CHANNEL)? 1: ++channel;
	}
	public void channelDown() {
		final int MIN_CHANNEL = 1;
		channel = (channel==MIN_CHANNEL)? 10: ++channel;
	}
	//getter
	public String getModel() {
		return model;
	}
	public int getChannel() {
		return channel;
	}
	public int getSize() {
		return size;
	}
	//setter
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
