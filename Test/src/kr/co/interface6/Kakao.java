package kr.co.interface6;

public class Kakao {
//	
//	public void choiceLocation(Available i,int num1,int num2) {
//		i.choiceLocation(num1,num2);
//	}
//	public void calcPrice(Available i) {
//		int result = i.calcPrice();
//		System.out.println(result);
//	}
//	public void calcDistance(Available i) {
//		i.calcDistance();
//	}
	
	public void show(Available i ,int num1,int num2) {
		i.choiceLocation(num1,num2);
		i.calcDistance();
		int result = i.calcPrice();
		System.out.println(result);
	}
}
