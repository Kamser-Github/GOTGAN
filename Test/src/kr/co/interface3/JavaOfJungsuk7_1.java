package kr.co.interface3;

public class JavaOfJungsuk7_1 {

	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		
		int i = 0;
		for(int j=0 ; j<cards.length ; j++) {
			int sutda = j%10;
			boolean flag = j<10&&(sutda==0||sutda==2||sutda==7);
			cards[i++] = new SutdaCard(sutda+1,flag);
			
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}