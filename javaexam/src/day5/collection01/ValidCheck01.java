package day5.collection01;

import java.util.Stack;
import java.util.EmptyStackException;
public class ValidCheck01 {
	/*
	 * 괄호가 갯수가 맞는지 체크하기. 슈도코드 ) ( 저장할 Stack valid 생성 검색내용 String check 저장
	 * for(check.length까지) check.charAt(i)로 (나올때 push )나올때 pop
	 * 
	 * valid.isEmpty true 합격 false면 불합격 예외 발생해도 불합격
	 */
	public static Stack<Object> valid = new Stack<>();

	public static void main(String[] args) {

		String str = "((8+4)*2)+(a+b)*(3+1)";

		try {
			for (int i = 0; i < str.length(); i++) {
				switch (str.charAt(i)) {
				case '(':
					valid.push("check");
					break;
				case ')':
					valid.pop();
					break;
				default:
				}
			}

			if (valid.isEmpty()) {
				System.out.println("검색 결과 이상이 없습니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
		
	}//main end
}
