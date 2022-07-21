package kr.co.abstractex;

public class RoBotCleaner extends Cleaner{
	
	public void fillIn() {
		System.out.println("전원을 킵니다");
	}
	public void powerLevel() {
		System.out.println("로봇청소기가 조절합니다");
	}
	public void moveWay() {
		System.out.println("자동으로 움직입니다.");
	}
	public void rightOrder() {
		System.out.println("자동으로 제자리에 돌아갑니다.");
	}
	
	public void autoPlay(int num) {
		switch(num) {
		case 1 :
			System.out.println("애완동물 모드로 작동합니다");
			System.out.println("파워를 최대한으로 합니다.");
			break;
		case 2 : 
			System.out.println("취침모드로 작동합니다");
			System.out.println("파워를 최소로 합니다.");
			break;
		default :
			System.out.println("평상시 모드로 작동합니다");
			System.out.println("파워를 보통으로 작동합니다.");
		}
	}
}
