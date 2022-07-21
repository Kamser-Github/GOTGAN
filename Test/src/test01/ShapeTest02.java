package test01;

import kr.co.interfacee.HorizontalLine;
import kr.co.interfacee.Parallelogram;
import kr.co.interfacee.Plane2D;
import kr.co.interfacee.Point;
import kr.co.interfacee.Rectangle;
import kr.co.interfacee.Shape;
import kr.co.interfacee.VerticalLine;
import shape.*;
/*
	< 도형 프로젝트 >
	1.draw,toString 추상메소드,print 비추상메소드를 가지는 shape 추상 클래스를 생성하시오
	2.Shape 클래스를 상속하는 Point 클래스를 추가하시오.
	3.Shape 클래스를 상속하는 Rectangle 클래스를 추가하시오.
	4.Shape 클래스를 상속하고,HorizontalLine,VerticalLine 클래스의 부모자 되는
		AbstractLine 클래스를 추가하시오
	5.AbstractLine 클래스를 상속하는 HorizontalLine 클래스를 추가하시오
	6.AbstractLine 클래스를 상속하는 VerticalLine 클래스를 추가하시오
	7.main 메소드에서 Point,Rectangle,HorizontalLine,VertivalLine 클래스의 인스턴스를 만들어
	다형성을 구현하여 일괄 처리하시오.
	---- ---- ----
	<추가 내용>
	8.도형의 면적을 계산하는 getArea메소드를 갖는 interface Plane2D를 추가하시오
	9.Ractangle 클래스는  Plane2D를 구현하시오
	10.평행 사변형 Parallelogram 평행사변형 클래스,Shape를 상속하고,plane2d를 구현하도록하시오

	11.메인메소드에서 Point,Rectangle,HorizontalLine,VerticalLine,Parallelogram 
	클래스의 인스턴스를 만들어 다형성을 구현하여 일괄처리하시오
	12.면적을 계산할수잇는 클래스인 Ractangle,Palalle 클래스의 인스턴스를 출력할때는 면적도 함께 출력을 하시오
*/
public class ShapeTest02 {
	
	public static void main(String[] args) {
		
		//배열에 추가하기
		//7.Point , Rectangle , horizontalLine , VerticalLine 다형성 일괄처리
		
		Shape[] shapes = {
				new Point(),
				new Rectangle(4, 5),
				new HorizontalLine(4),
				new VerticalLine(4)
		};
		
		for(Shape a : shapes) {
			a.play();
		}
		Shape[] shapes2 = {
				new Point(),
				new Rectangle(4,5),
				new HorizontalLine(4),
				new VerticalLine(4),
				new Parallelogram(4,5)
		};
		
		for(Shape a : shapes2) {
			a.play();
//			if(a instanceof Rectangle) {
//				((Rectangle)a).getArea();
//			}else if(a instanceof Parallelogram){
//				((Parallelogram)a).getArea();
//			}
			//이맛에 다형성을 하는거다..
			if(a instanceof Plane2D) {
				((Plane2D)a).getArea();
			}
			//삼각형도 추가하고 다른 도형도 추가해서 해보자
		}
	}
	
}
