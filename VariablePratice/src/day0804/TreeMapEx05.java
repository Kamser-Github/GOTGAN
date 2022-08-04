package day0804;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class TreeMapEx05 {
	
	//TreeMap 기본 정렬 ,형변환후 다시 재정렬 해보기.
	public static void main(String[] args) {
		
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };
		
		TreeMap map = new TreeMap();
		
		//data에 중복횟수를 value값
		//data 자체를 key값으로 설정
		
		for(int i=0 ; i<data.length ; i++) {
			if(map.containsKey(data[i])) {
				//key값이 중복이면
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i],new Integer(value.intValue()+1));
			} else {
				//중복이 아니라면
				map.put(data[i], new Integer(1));
			}
		}//TreeMap에 저장 완료
		
		System.out.println("정렬 전 출력해보기");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		//set에 들어있지만 형태는 Map.Entry이기 때문에 형변환을 해야한다.
		//Map.Entry의 getKey,Value를 써야하기 때문에.
		while(it.hasNext()) {
			//다 읽을때까지 무한 반복
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getValue()+" : "+printBar('#',value)+" "+value);
		}
		
		System.out.println();
		System.out.println("정렬 후 출력해보기");
		//TreeMap은 Comparator를 상속하지 않았기 때문에
		//상속한 애들꺼로 형변환후 정렬 후 출력해보자
		
		List list = new ArrayList(set);
		
		Collections.sort(list, new ValueComparator());
		while(it.hasNext()) {
			//다 읽을때까지 무한 반복
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getValue()+" : "+printBar('#',value)+" "+value);
		}
	}
	
	static class ValueComparator implements Comparator{
		public int compare(Object o1,Object o2) {
			if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
				Map.Entry e1 = (Map.Entry)o1;
				Map.Entry e2 = (Map.Entry)o2;
				
				int v1 = ((Integer)e1.getValue()).intValue();
				int v2 = ((Integer)e2.getValue()).intValue();
				
				return v2-v1;
			}
			
			return -1;
		}
	}
	
	public static String printBar(char ch,int value) {
		
		char[] bar = new char[value];
		for(int i=0 ; i<bar.length ; i++) {
			bar[i] = ch;
		}
		
		return new String(bar);
	}
}
