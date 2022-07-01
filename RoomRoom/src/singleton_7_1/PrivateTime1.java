package singleton_7_1;

public class PrivateTime1 {
	
	//펴늬
	int milk = 5000;
	int water = 2000;
	int candy = 500;
	
	private static PrivateTime1 gs25 = new PrivateTime1();
	
	public static PrivateTime1 gs25() {
		return gs25;
	}
	
	public int getMike() {
		return milk;
	}
	
	public void setMike(int price) {
		this.milk = price;
	}
	// 매소드 앞에 변수를 지정하려면 return으로 같은 자료형이 와야한다;
	
}
