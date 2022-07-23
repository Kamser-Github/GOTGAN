package kr.co.interface3;

public class InterProduct {
	
	public static void main(String[] args) {
		
		Drawable[] draws = {
				new Rectangle(),
				new Parallelogram(),
				new Triangle()
		};
		Draw draw = new Draw();
		//배열에는 안어울리는거같다.
		
		for(Drawable a : draws) {
			a.draw();
		}
		//굳이 써보자면
		for(int i=0 ; i<draws.length ; i++) {
			draw.method(draws[i]);
		}
	}
}

interface Drawable{
	
	void draw();
	
}

class Draw{
	
	public void method(Drawable draw) {
		draw.draw();
	}
}

class Rectangle implements Drawable{
	
	@Override
	public void draw() {
		for(int i=0; i<5 ; i++) {
			for(int j=0; j<5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Parallelogram implements Drawable{
	
	@Override
	public void draw() {
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5-1-i ; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Triangle implements Drawable{
	
	@Override
	public void draw() {
		for(int i=0 ; i<5 ; i++) {
			for(int j=0; j<5-1-i ; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(i+1)*2-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}