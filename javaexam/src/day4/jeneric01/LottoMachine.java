package day4.jeneric01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class LottoMachine {

//	HashSet<Integer> lotto;
//	
//	public LottoMachine() {
//		lotto = new HashSet<Integer>();
//	}

	public static void main(String[] args) {

		HashSet<Integer> lotto = new HashSet<Integer>();
		int e;
		for (int i = 0; lotto.size() != 10; i++) {
			e = new Random().nextInt(21) + 10;
			lotto.add(e);
		}
		printLottoList(lotto);

	}

	public static void printLottoList(HashSet<Integer> list) {
		Iterator<Integer> lottoPrint = list.iterator();
		System.out.print("오늘의 로또번호 :[");
		while (lottoPrint.hasNext()) {
			Integer num = lottoPrint.next();
			System.out.print(num);
			if (lottoPrint.hasNext())
				System.out.print(",");
			else
				System.out.print("]\n");
		}
		
		
	}
}