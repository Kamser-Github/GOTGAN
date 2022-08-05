package kr.co.object1;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Set;
import java.util.Map;


public class InheritanceEx01 {
	
	public static void main(String[] args) {
		
		TreeMap<String,Integer> map = new TreeMap<>();
		
		map.put("로제떡볶이", 4500);
		map.put("간", 2500);
		map.put("짜장면",5500);
		map.put("피자", 12500	);
		map.put("참치찌개", 8500);
		map.put("황금올리브치킨", 18500);
		
		//출력
		System.out.println(map.toString());
		
		//정렬 마음대로 해보기
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		List<Map.Entry<String,Integer>> list = new ArrayList<>(set);
		Collections.sort(list, new ValueComparator());
		
		//가격 오름차순
		System.out.println(list.toString());
		//[황금올리브치킨=18500, 피자=12500, 참치찌개=8500, 짜장면=5500, 로제떡볶이=4500, 간=2500]

		
		//이름 길이순으로 정렬해보기.
		Collections.sort(list, new KeyLengthComparator());
		System.out.println(list.toString());
		//[황금올리브치킨=18500, 로제떡볶이=4500, 참치찌개=8500, 짜장면=5500, 피자=12500, 간=2500]
		
	}
	
	static class ValueComparator implements Comparator<Map.Entry<String,Integer>> {
		public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) {
			
			int v1 = o1.getValue();
			int v2 = o2.getValue();
			
			return v2-v1;
		}
	}
	
	static class KeyLengthComparator implements Comparator<Map.Entry<String,Integer>>{
		public int compare(Map.Entry<String,Integer> o1,Map.Entry<String, Integer> o2) {
			
			int keyLength1 = o1.getKey().length();
			int keyLength2 = o2.getKey().length();
			
			return keyLength2-keyLength1;
		}
	}
}
