package kr.co.interface7;

public class ExpressBus extends App{
	//고속버스
	@Override
	public int calcPrice() {
		return getDistance()*30;
	}
	public int calcTime() {
		return getDistance()*15;
	}	
	@Override
	public String toString() {
		return super.toString()+"비용 : "+calcPrice()+"시간 : "+calcTime();
	}
	@Override
	public void resultInfo() {
		calcDistance();
		calcPrice();
		calcTime();
		System.out.println(toString());
	}
}
