package day0716;

class Point{
	int x;
	int y;
}
class Circle extends Point{
	int r;
}

class Alp{
	int a;
	int b;
}

class Leng{
	Alp l = new Alp();
	int c;
}

public class InheritanceTest1 {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.x = 1;
		c.y = 3;
		c.r = 15;
		System.out.println("c.x="+c.x); //c.x = 1;
		System.out.println("c.y="+c.y); //c.y = 3;
		System.out.println("c.r="+c.r); //c.r =15;
		
		Leng s = new Leng();
		s.c = 15;
		s.l.a = 1;
		s.l.b = 5;
		System.out.println("s.c="+s.c); //s.c = 15  
		System.out.println("s.l.a="+s.l.a); 
		System.out.println("s.l.b="+s.l.b);
		
		
	}
}
