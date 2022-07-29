package kr.co.jenetics;

public class Bread extends Product {
	
	@Override
	public void trimFood() {
		System.out.println("빵을 반으로 자릅니다.");
	}
	
	@Override
	public String toString() {
		return "참깨빵";
	}
}
