package day0717;

public class ObjectTest02 {

	public static void main(String[] args) {

		ObjectTest02 aTest = new ObjectTest02();
		aTest.aniMove(new Human());

	}

	public void aniMove(Animal animal) {
		animal.move();
	}
}

//���

class Animal {

	void move() {
		System.out.println("�̵��ϴ� ���");
	}

}

class Human extends Animal {
	void move() {
		System.out.println("�ɾ�̵�");
	}
}

class Lion extends Animal {

	void move() {
		System.out.println("�׹߷� �̵�");
	}
}

class Eagle extends Animal {

	void move() {
		System.out.println("���Ƽ� �̵�");
	}
}