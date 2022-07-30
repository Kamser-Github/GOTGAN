package organize;

public class InterfaceTest06 {
	
	public static void main(String[] args) {
		
		A06 a06 = new A06();
		a06.method(new B06());
		System.out.println("------");
		a06.method(new C06());
		
		/*
		메소드의 참조변수를 인터페이스로 둘경우
		필요에 따라 메소드에서 바로 바로 변경이 가능하지만
		내가 어떤 메소드를 사용하는지 보여지게 되고
		
		메소드 안에서 사용할겨우에는
		매소드 안에 있는거만 필요에 따라 조절하면 된다.
		
		*/
	}
}

class A06{
	
	public void method(I06 i06) {
		i06.methodI06();
		I006 i006 = InterfaceManger.getInstance(1);
		I006 i007 = InterfaceManger.getInstance(2);
		i006.methodI006();
		i007.methodI006();
		
	}
}

class B06 implements I06{
	
	public void methodI06() {
		System.out.println("B06의 메소드");
	}
}

class C06 implements I06{
	
	public void methodI06() {
		System.out.println("C06의 메소드");
	}
}

interface I06{
	
	public abstract void methodI06();
}

interface I006{
	
	public abstract void methodI006();
}

class InterfaceManger{
	
	public static I006 getInstance(int num) {
		switch(num) {
		case 1:
			return new D006();
		default:
			return new E006();
		}
	}
	
}

class D006 implements I006{
	
	public void methodI006() {
		System.out.println("D006의 메소드");
	}
}

class E006 implements I006{
	
	public void methodI006() {
		System.out.println("E006의 메소드");
	}
}