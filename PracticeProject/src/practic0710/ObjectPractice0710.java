package practic0710;

import java.util.ArrayList;

public class ObjectPractice0710 {
	
	ArrayList<Animal> aniList= new ArrayList<Animal>();
	
	public static void main (String[] args) {
		
		ObjectPractice0710 aTest = new ObjectPractice0710();
		aTest.addAnimal();
		System.out.println("원래형으로 다운 캐스킹");
		aTest.testCasting();
		}
		

	public void addAnimal() {
		aniList.add(new Eagle());
		aniList.add(new Human());
		aniList.add(new Tiger());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("사람은 두발로 걷습니다");
	}
	public void eat() {
		System.out.println("사람은 젓가락으로 먹습니다.");
	}
}

class Tiger extends Animal{
	
	public void hunting() {
		System.out.println("호랑이는 두발로 걷습니다.");
	}
	public void move() {
		System.out.println("호랑이는 두발로 걷습니다.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리는 걷습니다");
	}
	public void fly() {
		System.out.println("독수리는 하늘을 날아다닙니다");
	}
}


	public void testCasting() {
		for(int i=0; i<aniList.size();i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.eat();
			}
			else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.fly();
			}
			else {
				System.out.println("지원되지 않는 형입니다");
			}
		}
	}
}


