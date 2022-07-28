package day4.jeneric02;

import java.util.HashSet;

public class LottoMachine {
	
	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size()<10) {
			lotto.add((int)(Math.random()*21+10));
		}
		
		System.out.println(lotto);
	}
}
