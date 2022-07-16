package day0716;

public class Kiosk01 {
	
	int size;
	
	Button01 button = new Button01();
	Voice01	voice = new Voice01();
	
	void menuButton() {
		button.pressBrieflyButton();
		button.letter = "메뉴";
		voice.talk("메뉴를 골라주세요.");
	}
	
	void clickMenu() {
		button.pressBrieflyButton();
		button.letter = "메뉴 추가";
		voice.talk("메뉴를 담으겠습니까?");
	}
	
	void cancelMenu() {
		button.pressTwice();
		button.letter = "취소";
		voice.talk("취소되었습니다.");
	}
	
	void choiceMenu() {
		button.pressBrieflyButton();
		button.letter = "주문 완료";
		voice.talk("주문해주셔서 감사합니다.");
	}
	
	public static void main(String[] args) {
		
		Kiosk01 bergerKing = new Kiosk01();
		bergerKing.menuButton();
		bergerKing.clickMenu();
		bergerKing.cancelMenu();
		
		
	}
}
