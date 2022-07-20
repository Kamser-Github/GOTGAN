package k220719;

public class SuperTest02 {
	
	public static void main(String[] args) {
		Parent1 p1 = new Child1();
		Child1  c1 = new Child1();
	
		System.out.println("p.x = " + p1.x);
		p1.method();
		System.out.println();
		System.out.println("c.x = " + c1.x);
		c1.method();
		
		//예상해보기.
		//p1.x = 100
		//c1.x = 200
		//p1.메소드는 c1꺼가 나오고
		//c1의 메소드는 1.x = 100이라고 생각했는데 200이다
		//여기 인스턴스 변수 x는 this.x이기 때문에
		//this는 생략이 가능하므로 200과 같다
	}
}


class Parent1{
	int x = 100;
	
	void method() {
		System.out.println("아빠꺼");
	}
}

class Child1 extends Parent1{
	int x = 200;
	
	void method() {
		System.out.println("x=" + x);  // this.x와 같다.
		System.out.println("super.x=" + super.x);
		System.out.println("this.x="  + this.x);
	}
}