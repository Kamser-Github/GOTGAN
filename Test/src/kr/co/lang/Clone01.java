package kr.co.lang;

public class Clone01 implements Cloneable {
	
	//자신을 복제하여 새로운 인스턴스를 생성
	int x,y;
	
	Clone01(int x,int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x = "+x+",y = "+y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
	
	public static void main(String[] args) {
		Clone01 org = new Clone01(5,5);
		Clone01 copy = (Clone01)org.clone();
		
		System.out.println(org);
		System.out.println(copy);
		copy.x = 6;
		System.out.println(org);
	}
}
