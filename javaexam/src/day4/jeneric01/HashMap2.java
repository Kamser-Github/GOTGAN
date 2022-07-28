package day4.jeneric01;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap2{
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, Integer> state = new HashMap<String, Integer>();
		String stay;
		int people;
		for (int i = 0; state.size() != 5; i++) {
			System.out.println("지역과 인구수를 입력해주세요.");
			stay = sc.next();
			people = sc.nextInt();
			if (state.get(stay) == null) {
				state.put(stay, people);
			} else {
				System.out.printf("나라명 %3s는 이미 입력되었습니다.\n",stay);
			}
		}
		for(int i=0 ; i<state.size() ; i++) {
			String str = (String)state.keySet().toArray()[i];
			int num = state.get(str);
			System.out.print(str+"("+num+")");
			if(i<state.size()-1)
				System.out.print(",");
		}
	}

}
