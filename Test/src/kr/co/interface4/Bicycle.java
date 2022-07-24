package kr.co.interface4;

public class Bicycle implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("자전거 도로로 길을 안내합니다.");
	}
	@Override
	public void InformTime() {
		System.out.println("걸리는 시간은 약 ##입니다.");
		ride();
	}
	public void ride() {
		System.out.println("이어폰이나 핸드폰 사용을 금지합니다.");
	}
}
