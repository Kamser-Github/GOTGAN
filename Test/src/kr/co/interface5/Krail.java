package kr.co.interface5;

public class Krail extends TransApp{
	
	public Krail(int location,String name,int x,int y) {
		super(location,name,x,y);
	}
	@Override
	public void payMoney() {//�Ÿ� ���Ѱſ� ���� ���Ѵ�.
		setPrice(findDistance()*1500);
	}
	@Override
	public void showTakeTime() {
		setTimes(findDistance()*10);
	} // �ɸ��� �ð� ���
	// �Ÿ� ���ϳ��ſ� �ð��� ���Ѵ�.
	
}
