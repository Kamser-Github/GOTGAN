package kr.co.interface4;

public class Car implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("자동차 주행으로 길을 안내합니다.");
	}
	@Override
	public void InformTime() {
		System.out.println("걸리는 시간은 약 ##입니다.");
		consumedOil();
	}
	public void consumedOil() {
		System.out.println("총 소모 기름양은 ##입니다.");
	}
	
}
