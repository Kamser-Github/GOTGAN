package today220709;

public class JavaOfJungSuk6_1_2 {

	public static void main(String[] args) {
		// 6-1 다음과 같은 멤버변수를 갖는 SutdaCard .클래스를 정의하시오 .
		// 6-2 두개의 생성자와 info를 추가하세요.

		class SutdaCard {
			// 코드를 쓰시오
			int num;
			boolean isKwang;
			public SutdaCard() {
				this(1,true);
			}
			public SutdaCard(int num,boolean isKwang) {
				this.num = num;
				this.isKwang = isKwang;
			}
			public String info() {
				return num + (isKwang ? "K" : " ");
				
			}
		
		}
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		//실행결과 3 1k나오게 하기
	}

}
