package day0717;

public class ObjectPraice06 {
	public static void main(String[] args) {
		Point2[] p = {
				new Point2(100,100),
				new Point2(140,50),
				new Point2(200,100),
		};
		Triangle2 t = new Triangle2(p);
		Circle2 c = new Circle2(p[0],50);
		
		t.draw();
		c.draw();
	}
}

//조상 클래스
class Shape2{
	String color = "black";
	//기본값 변수는 캐스팅을 할경우
	//참조타입 값을 따라간다 주의할것.
	//매서드는 오버라이딩된걸 쓴다.
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}

class Point2{
	int x;
	int y;
	
	//생성자 
	Point2(int x,int y){
		this.x = x;
		this.y = y;
		//좌표 찍기
		//this는 자기 자신 참조변수를 가리킨다.
	}
	Point2(){
		this(0,0);
		//this()
		//클래스 내에 또 다른 생성자를 호출을 한다.
	}
	//좌표를 얻는 매서드,포함이나 상속을 해도 사용할수잇다.
	String getXY() {
		return "("+x+","+y+")"; 
	}
}
//상속
//상속일 경우에 조상 클래스 
//생성자와 초기화 블럭은 상속이 되지 않는다

class Circle2 extends Shape2{
	Point2 center;
	//포인트 객체를 선언했다.생성자만 불러오면된다.
	int r;
	
	Circle2(){
		this(new Point2(0,0),100);
	}
	Circle2(Point2 center,int r){
		this.center = center;
		this.r = r;
		//매개변수에서 new를 붙이고 있는 쪽에서만 사용 가능하다.
		//정보만 받아먹는것.
	}
	//오버라이딩
	//반환타입 이름 매개변수 모두 같고
	//내용물만 다르다
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
	
}

class Triangle2 extends Shape2{
	Point2[] p = new Point2[3];
	
	Triangle2(Point2[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}