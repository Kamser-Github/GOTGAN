package kr.co.interface7;

public class Station {
	//Áö¿ª
	private int name;
	private int x;
	private int y;
	
	Station(int name,int x,int y){
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	//getter
	public int getName() { return name; }
	public int getX() { return x; }
	public int getY() { return y; }
	//setter
	public void setX(int x) {
		this.x = x;
	}
	public void setName(int name) { 
		this.name = name;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
