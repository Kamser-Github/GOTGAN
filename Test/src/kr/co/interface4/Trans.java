package kr.co.interface4;

public class Trans implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("대중교통으로 길을 안내합니다.");
	}
	@Override
	public void InformTime() {
		System.out.println("걸리는 시간은 약 ##입니다.");
		takeMoney();
	}
	public void takeMoney() {
		System.out.println("총 이동비용은 ##입니다.");
	}
}
