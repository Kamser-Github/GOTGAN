package day0716;

public class InheritancePractice01 {
	
	public static void main(String[] args) {
		
		SmartTV sumsung = new SmartTV();
//		sumsung.TVInfo();
		sumsung.playGame();
	}
}

class SmartTV extends TVda{
	Audio audio = new Audio();
	Internet internet = new Internet();
	Youtube youtube = new Youtube();
	
	SmartTV(){
		super();
	}
	SmartTV(int height,int width,String color,String pener,int volt){
		super(height, width, color, pener, volt);
	}

	void watchMoive() {
		audio.movieVer();
		youtube.youtubeOn();
		brightness = 60;
	}
	
	void playGame() {
		audio.gameVer();
		brightness = 40;
		System.out.println("밝기를 40으로 합니다");
	}
	
	void wifiInternet() {
		audio.musicVer();
		internet.chrome();
		internet.search();
		brightness = 30;
	}
}

class TVda{
	int height;
	int width;
	String color;
	String pener;
	int volt;
	boolean power;
	int channel;
	int volume;
	int brightness;
	
	TVda(){
		this(30, 40, "black", "LCD", 220);
	}
	
	TVda(int height,int width,String color,String pener,int volt){
		this.height = height;
		this.width = width;
		this.color = color;
		this.pener = pener;
		this.volt = volt;
		power = false;
		channel = 20;
		volume = 15;
		brightness = 80;
	}
	
	void Power() { power = !power;}
	
	void ChannelUp() { ++channel; }
	void ChannelDown() { --channel; }
	
	void volumeUp() { ++volume; }
	void volumeDown() { --volume; }
	
	void brightnesseUp() { 
		brightness+=10;
		if(brightness>100) {
			brightness-=100;
		}
	}
	void brightnessDown() { 
		brightness-=10;
		if(brightness<0) {
			brightness+=100;
		}
	}
	
	void TVInfo() {
		System.out.printf(
				"높이 : %3d\n 폭  : %3d\n색상 : %s"
				+ "\n패널 : %s\n볼트 : %3d"
				+ "\n채널 : %3d\n볼륨 : %3d\n밝기 : %3d"
				,height,width,color
				,pener,volt
				,channel,volume,brightness);
	}
	
}//TV end

class Audio{
	
	Audio(){}
	
	void audioOn() {
		System.out.println("소리가 나온다");
	}
	
	void audioOff() {
		System.out.println("소리가 안나온다");
	}
	
	void musicVer() {
		System.out.println("음악 듣기모드");
	}
	
	void movieVer() {
		System.out.println("영상 감상모드");
	}
	
	void gameVer() {
		System.out.println("게임 사운드모드");
	}
	
}

class Internet{
	
	Internet(){}
	void chrome(){
		System.out.println("인터넷을 켭니다");
	}
	void search() {
		System.out.println("인터넷 검색을 합니다.");
	}
	void remote() {
		System.out.println("검색 기록을 제거합니다");
	}
	
	void logOut() {
		System.out.println("로그아웃하였습니다.");
	}
}

class Youtube{
	
	Youtube(){}
	void youtubeOn(){
		System.out.println("유투브를 킵니다.");
	}
	void youtubeOff() {
		System.out.println("유투브를 끕니다.");
	}
}