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

//상속

class Animal {

	void move() {
		System.out.println("이동하는 방법");
	}

}

class Human extends Animal {
	void move() {
		System.out.println("걸어서이동");
	}
}

class Lion extends Animal {

	void move() {
		System.out.println("네발로 이동");
	}
}

class Eagle extends Animal {

	void move() {
		System.out.println("날아서 이동");
	}
}