package kr.co.interface6;
	
//지역 입력
public class Station {
		
	private String region;
	private int x ;
	private int y ;
	
	public Station(String region,int x,int y) {
		this.region = region;
		this.x = x;
		this.y = y;
	}
	//getter
	public String getRegion() { return region; }
	public int getX() { return x; }
	public int getY() { return y; }
	//setter
	public void setRegion(String region) {
		this.region = region;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}
