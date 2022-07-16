package day0716;

public class Kiosk01 {
	
	int size;
	
	Button01 button = new Button01();
	Voice01	voice = new Voice01();
	
	void menuButton() {
		button.pressBrieflyButton();
		button.letter = "�޴�";
		voice.talk("�޴��� ����ּ���.");
	}
	
	void clickMenu() {
		button.pressBrieflyButton();
		button.letter = "�޴� �߰�";
		voice.talk("�޴��� �����ڽ��ϱ�?");
	}
	
	void cancelMenu() {
		button.pressTwice();
		button.letter = "���";
		voice.talk("��ҵǾ����ϴ�.");
	}
	
	void choiceMenu() {
		button.pressBrieflyButton();
		button.letter = "�ֹ� �Ϸ�";
		voice.talk("�ֹ����ּż� �����մϴ�.");
	}
	
	public static void main(String[] args) {
		
		Kiosk01 bergerKing = new Kiosk01();
		bergerKing.menuButton();
		bergerKing.clickMenu();
		bergerKing.cancelMenu();
		
		
	}
}
