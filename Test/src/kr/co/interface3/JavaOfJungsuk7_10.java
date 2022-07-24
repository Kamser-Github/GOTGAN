package kr.co.interface3;

public class JavaOfJungsuk7_10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());

		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
	}
}

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	// getter
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	// setter
	public void setChannel(int num) {
		if (num > MAX_VOLUME)
			num %= 100;
		else if (num < MIN_CHANNEL)
			num %= 100 + 100;
		prevChannel = channel;
		channel = num;
	}

	public void setVolume(int num) {
		if (num > MAX_VOLUME)
			num %= 100;
		volume = num;
	}

	// 이전채널로 가기
	public void gotoPrevChannel() {
		int tmp = channel;
		channel = prevChannel;
		prevChannel = tmp;
	}
}
