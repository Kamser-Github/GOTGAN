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
		System.out.println("��⸦ 40���� �մϴ�");
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
				"���� : %3d\n ��  : %3d\n���� : %s"
				+ "\n�г� : %s\n��Ʈ : %3d"
				+ "\nä�� : %3d\n���� : %3d\n��� : %3d"
				,height,width,color
				,pener,volt
				,channel,volume,brightness);
	}
	
}//TV end

class Audio{
	
	Audio(){}
	
	void audioOn() {
		System.out.println("�Ҹ��� ���´�");
	}
	
	void audioOff() {
		System.out.println("�Ҹ��� �ȳ��´�");
	}
	
	void musicVer() {
		System.out.println("���� �����");
	}
	
	void movieVer() {
		System.out.println("���� ������");
	}
	
	void gameVer() {
		System.out.println("���� ������");
	}
	
}

class Internet{
	
	Internet(){}
	void chrome(){
		System.out.println("���ͳ��� �մϴ�");
	}
	void search() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	void remote() {
		System.out.println("�˻� ����� �����մϴ�");
	}
	
	void logOut() {
		System.out.println("�α׾ƿ��Ͽ����ϴ�.");
	}
}

class Youtube{
	
	Youtube(){}
	void youtubeOn(){
		System.out.println("�����긦 ŵ�ϴ�.");
	}
	void youtubeOff() {
		System.out.println("�����긦 ���ϴ�.");
	}
}