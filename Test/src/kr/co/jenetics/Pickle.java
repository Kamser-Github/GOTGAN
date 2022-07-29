package kr.co.jenetics;

public class Pickle extends Product {

	@Override
	public void trimFood() {
		System.out.println("채썰어서 보관합니다.");
	}
	
	@Override
	public String toString() {
		return "채썬 피클";
	}
}
