package kr.co.interface5;

public class Krail extends TransApp{
	
	public Krail(int location,String name,int x,int y) {
		super(location,name,x,y);
	}
	@Override
	public void payMoney() {//거리 구한거에 돈을 곱한다.
		setPrice(findDistance()*1500);
	}
	@Override
	public void showTakeTime() {
		setTimes(findDistance()*10);
	} // 걸리는 시간 계산
	// 거리 구하나거에 시간을 곱한다.
	
}
