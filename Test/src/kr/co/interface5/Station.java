package kr.co.interface5;

public class Station {
	
	private String name;
	private int x;
	private int y;
	
	public Station(String name,int x,int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	//getter
	public int getX() {return x;}
	public int getY() {return y;}
	public String getName() {return name;}
}
