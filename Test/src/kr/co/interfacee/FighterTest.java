package kr.co.interfacee;

abstract class Unit{
	
	int x,y;
	void stop() {System.out.println("����ϴ�");
	}
	
}

interface Fightable{
	void move(int x,int y);
	void attack(Fightable f);
}

class Fighter extends Unit implements Fightable{
	
	public void move(int x,int y) {
		System.out.println("["+x+","+y+"]");
		}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();//���� ��ȯ
		return (Fightable)f;
	}
}

public class FighterTest {
	
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		
		f.attack(new Fighter());
	}
}
