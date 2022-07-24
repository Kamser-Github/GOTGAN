package kr.co.interface3;

public class JavaOfJungsuk7_2 {

	public static void main(String args[]) {
		SutdaDeck2 deck = new SutdaDeck2();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}
}

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

	SutdaDeck2() {
		int i = 0;
		for (int j = 0; j < cards.length; j++) {
			int sutda = j % 10;
			boolean flag = j < 10 && (sutda == 0 || sutda == 2 || sutda == 7);
			cards[i++] = new SutdaCard2(sutda + 1, flag);

		}
	}

	// shuffle
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int r = (int) (Math.random() * cards.length);
			SutdaCard2 tmp = cards[i];
			cards[i] = cards[r];
			cards[r] = tmp;
		}
	}

	// pick
	public SutdaCard2 pick(int num) {
		return cards[num];
	}

	// randomPick
	public SutdaCard2 pick() {
		int r = (int) (Math.random() * cards.length);
		return cards[r];
	}
}

class SutdaCard2 {
	int num;
	boolean isKwang;

	public SutdaCard2() {
		this(1, true);
	}

	public SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}