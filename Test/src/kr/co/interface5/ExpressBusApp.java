package kr.co.interface5;

public class ExpressBusApp extends TransApp{
	
	public ExpressBusApp(int location,String name,int x,int y) {
		super(location,name,x,y);
	}
	@Override
	public void payMoney() {//�Ÿ� ���Ѱſ� ���� ���Ѵ�.
		setPrice(findDistance()*500);
	}
	@Override
	public void showTakeTime() {
		setTimes(findDistance()*20);
	} // �ɸ��� �ð� ���
	// �Ÿ� ���ϳ��ſ� �ð��� ���Ѵ�.
}
