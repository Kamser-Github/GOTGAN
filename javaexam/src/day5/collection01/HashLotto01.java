package day5.collection01;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

public class HashLotto01 {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		for(int i=0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);//static 매서드
		//번호 크기순으로 정렬하기 위해서
		//Collections 클래스의 sort static 매서드 활용
		//List인터페이스가 필요하기 때문에 
		//구현한 LinkedList에 set을 넣어서 정렬한것.
		System.out.println(list);
	}
}
