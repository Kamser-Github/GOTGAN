package kr.co.interface5;

public class BusStation {
	
	private String name;
	private int x;
	private int y;
	
	public BusStation(String name,int x,int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	//getter
	public int getX() {return x;}
	public int getY() {return y;}
	public String getName() {return name;}
}
