package day0803;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
public class HashMapPractice02 {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("미나리","1500");
		map.put("정어리", "2200");
		map.put("고드름", "1435");
		map.put("만년필", "3500");
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		for(int i=0 ; it.hasNext() ; i++) {
			Map.Entry obj = (Map.Entry)it.next();
			String key = (String)(obj.getKey());
			String val = (String)(obj.getValue());
			System.out.println(key+val);
		}
	}
}
