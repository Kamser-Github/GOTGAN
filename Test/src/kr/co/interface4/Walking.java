package kr.co.interface4;

public class Walking implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("도보로 걷는 길을 안내합니다.");
	}
	@Override
	public void InformTime() {
		System.out.println("걸리는 시간을 안내합니다.");
		notResult();
	}
	public void notResult() {
		System.out.println("30km 이상은 안내를 하지 않습니다.");
	}
}
