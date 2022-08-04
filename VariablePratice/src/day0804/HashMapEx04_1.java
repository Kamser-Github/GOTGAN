package day0804;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class HashMapEx04_1 {
	
	public static void main(String[] args) {
		
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };
		
		HashMap map = new HashMap();
		
		//data중복 체크하기
		for(int i=0 ; i<data.length ; i++) {
			//data 값은 키로 , 중복체크는 value로 저장
			if(map.containsKey(data[i])) {
				//만약에 있다면
				Integer value = (Integer)(map.get(data[i]));
				map.put(data[i],new Integer(value.intValue()+1));
			} else {
				map.put(data[i], new Integer(1));
			}
		}
		//문자 읽기
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey()+" : "
						+printBar('#',value)+" "+value);
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
