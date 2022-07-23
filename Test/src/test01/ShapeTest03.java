package test01;
import kr.co.interface2.*;

public class ShapeTest03 {
	
	public static void main(String[] args) {
		
		Shape[] shapes = {
				new HorizontalLine(5),
				new VerticalLine(5),
				new Rectangle(5, 5),
				new Parallelogram(5, 5),
				new Triangle(4,5)
		};
		
		for(Shape a : shapes) {
			a.play();
			if(a instanceof AbstractLine) {
				((AbstractLine)a).findLine();
			}else if(a instanceof Face) {
				System.out.println(((Face) a).getArea());
			}
		}
		
	
		
	}//main end
}//class end
