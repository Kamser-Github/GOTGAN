package day0716;

public class Voice01 {
	
	boolean gender;
	String language;
	int age;
	int speedOfspeech;
	
	Voice01(){
		this(false,"ENG",30,5);
	}
	
	Voice01(boolean gender,String language,int age,int speedOfspeech){
		this.age = age;
		this.gender = gender;
		this.language = language;
		this.speedOfspeech = speedOfspeech;
	}
	
	void changeGenger() {gender = !gender;}
	void changeLanguage() {}
	void chageAge() {}
	void speedOfspeechUp() {}
	void speedOfspeechDown() {}
	void talk(String sentence) {
		System.out.println(sentence);
	}
}
