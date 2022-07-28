package day4.jeneric02;

import java.util.HashMap;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ContryPop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> strName = new HashMap<String,Integer>();
		
		//변수 2개로 while문이랑 for문에서 쓰려고 선언함.
		String state;
		int peopleOfNumber;
		
		try {
			while(strName.size()!=5) {
				System.out.print("나라명을 입력해주세요");
				if(!strName.containsKey(state=sc.next())) {
					System.out.print("인구수를 입력해주세요");
					strName.put(state, sc.nextInt());
				}
				sc.nextLine();
			}
		}catch(InputMismatchException e){
			System.out.println("잘못입력하셨습니다.다시 실행해주세요.");
			return;
		}finally {
			sc.close();
		}
		
		System.out.print(strName.size()+"가 모두 입력되었습니다.");
		
		for(int i=0; i<strName.size() ; i++) {
			//keySet를 배열로 만들어서 하나씩꺼내서 출력한다.
			state = (String)strName.keySet().toArray()[i];
			peopleOfNumber = (int)strName.keySet().toArray()[i];
			
			System.out.printf("%s(%d)",state,peopleOfNumber);
			
			if(i<strName.size()-1) break;
			System.out.println(",");
		}
		
		sc.close();
	}
}
