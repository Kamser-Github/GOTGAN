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
	< ���� ������Ʈ >
	1.draw,toString �߻�޼ҵ�,print ���߻�޼ҵ带 ������ shape �߻� Ŭ������ �����Ͻÿ�
	2.Shape Ŭ������ ����ϴ� Point Ŭ������ �߰��Ͻÿ�.
	3.Shape Ŭ������ ����ϴ� Rectangle Ŭ������ �߰��Ͻÿ�.
	4.Shape Ŭ������ ����ϰ�,HorizontalLine,VerticalLine Ŭ������ �θ��� �Ǵ�
		AbstractLine Ŭ������ �߰��Ͻÿ�
	5.AbstractLine Ŭ������ ����ϴ� HorizontalLine Ŭ������ �߰��Ͻÿ�
	6.AbstractLine Ŭ������ ����ϴ� VerticalLine Ŭ������ �߰��Ͻÿ�
	7.main �޼ҵ忡�� Point,Rectangle,HorizontalLine,VertivalLine Ŭ������ �ν��Ͻ��� �����
	�������� �����Ͽ� �ϰ� ó���Ͻÿ�.
	---- ---- ----
	<�߰� ����>
	8.������ ������ ����ϴ� getArea�޼ҵ带 ���� interface Plane2D�� �߰��Ͻÿ�
	9.Ractangle Ŭ������  Plane2D�� �����Ͻÿ�
	10.���� �纯�� Parallelogram ����纯�� Ŭ����,Shape�� ����ϰ�,plane2d�� �����ϵ����Ͻÿ�

	11.���θ޼ҵ忡�� Point,Rectangle,HorizontalLine,VerticalLine,Parallelogram 
	Ŭ������ �ν��Ͻ��� ����� �������� �����Ͽ� �ϰ�ó���Ͻÿ�
	12.������ ����Ҽ��մ� Ŭ������ Ractangle,Palalle Ŭ������ �ν��Ͻ��� ����Ҷ��� ������ �Բ� ����� �Ͻÿ�
*/
public class ShapeTest02 {
	
	public static void main(String[] args) {
		
		//�迭�� �߰��ϱ�
		//7.Point , Rectangle , horizontalLine , VerticalLine ������ �ϰ�ó��
		
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
			//�̸��� �������� �ϴ°Ŵ�..
			if(a instanceof Plane2D) {
				((Plane2D)a).getArea();
			}
			//�ﰢ���� �߰��ϰ� �ٸ� ������ �߰��ؼ� �غ���
		}
	}
	
}
