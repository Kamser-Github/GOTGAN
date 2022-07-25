package kr.co.interface7;

import java.util.Scanner;

public abstract class App implements Chooseable {
	
	Scanner sc = new Scanner(System.in);
	Station[] station;
	Station start = null;
	Station end = null;
	private int distance;
	
	App(){
		station = new Station[3];
		System.out.println("���� : 1\n�뱸 : 2\n�λ� : 3");
		choiceRegion();
	}
	//getter
	public int getDistance() { return distance; }
	
	public void choiceRegion() {
		System.out.println("����� : ");
		int num1 = sc.nextInt();
		Station start = station[num1];
		System.out.println("������ : ");
		int num2 = sc.nextInt();
		Station end = station[num2];
	}
	public int calcDistance() {
		int x= start.getX()-end.getX();
		int y= start.getY()-end.getY();
		return distance = (int)(Math.sqrt(x*x+y*y));
	}
	public abstract int calcPrice();
	public abstract int calcTime();
	public String toString() {
		return "�Ÿ��� "+distance;
	}
	public void resultInfo() {
		calcDistance();
		calcPrice();
		calcTime();
		
	}
}
