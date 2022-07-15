package day0715;

public class MethodPratice06 {
	//반지름 매개변수로 원 넓이 구하기
	static double area(double half) {
		return Math.round(half*half*3.14*100)/100.0;
	}

	public static void main(String[] args) {
		
		System.out.println(area(3.14));
	}
}
