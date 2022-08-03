package day0803;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapPractice01 {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("사랑아", "더 원");
		map.put("심장이 하는 일", "정동하");
		map.put("사랑비","김태우");
		map.put("하주석", "안돼");
		
		Scanner sc = new Scanner(System.in);
		/*
		map.contains(key)가 있는지 확인
		if(false)
		아이디가 없습니다.
		continue
		
		if(false)
		value == map.get(key)
		통과 break;
		아니면 비밀번호가 틀렷습니다. 
		continue
		//다시 재정리
		String key = sc로 입력
		String value = sc로 입력
		
		if(map.contains(key))
			있으면 다음단계
			없으면 continue;
		if(map.get(key)==value)
			있으면 break
			없으면 continue;
		
		
		*/
		while(true) {
			System.out.println("노래명을 입력해주세요");
			String key = sc.nextLine();
			System.out.println("가수를 입력해주세요");
			String value = sc.nextLine();
			
			if(!map.containsKey(key)) {
				System.out.println("해당하는 노래가 없습니다.");
				continue;
			}
			if(!value.equals(map.get(key))) {
				System.out.println("가수명이 맞지 않습니다.");
				continue;
			}
			else {
				System.out.println("예약이 완료 되었습니다.");
				break;
			}
		}
		
		
	}
}
