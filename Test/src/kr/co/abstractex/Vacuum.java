package kr.co.abstractex;

public class Vacuum extends Cleaner {
	
	public void fillIn() {
		System.out.println("콘센트를 꽂습니다");
	}
	public void powerLevel() {
		System.out.println("손가락으로 조절합니다.");
	}
	public void moveWay() {
		System.out.println("사람이 움직입니다");
	}
	public void rightOrder() {
		System.out.println("사람이 뒷정리를 하고 정리합니다.");
	}
	
	public void alarmFilter() {
		System.out.println("먼지 필터를 교체해주세요.");
	}
}
