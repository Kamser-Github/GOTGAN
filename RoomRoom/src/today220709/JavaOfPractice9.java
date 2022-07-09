package today220709;
//클래스 변수 초기화와 인스턴스 변수 초기화 연습 4;

class Commission{
	static int countMoney = 0;
	int commission;
	public void click() {
		countMoney +=200;
	}
	
	public void showCommission() {
		this.commission = countMoney;
		System.out.println(this.commission);
	}
}

public class JavaOfPractice9 {

	public static void main(String[] args) {
		
		Commission lee = new Commission();
		lee.click();
		lee.click();
		lee.click();
		lee.click();
		lee.showCommission();

	}
}
