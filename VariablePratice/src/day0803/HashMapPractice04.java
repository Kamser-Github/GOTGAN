package day0803;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class HashMapPractice04 {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		
	}
	
	static void addGroup(String groupName) {
		//그룹명이 phoneBook에 없으면
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, New HashMap());
		//그룹명이 키 값,value로 다시 새로운 배열을 만든다.
		}
	}
	
	static void addPhoneNo(String groupName,String name,String tel) {
		//그룹명을 추가하고 없는 그룹이면 새로 배열 만들고
		addGroup(groupName);
		//새로만든 배열을 group에 참조한다.
		HashMap group = (HashMap)phoneBook.get(groupName);
		//group에 전화번호와 이름을 저장한다.
		//value가 이미 고유이기 때문에 
		group.put(tel, name);
	}
	
	static void addPhoneNo(String name, String tel) {
		//그룹명을 지정안하면 기타로 만든다.
		addPhoneNo("기타", name, tel);
	}
	//저장 목록 꺼내기;
	static void printList() {
		Set set = phoneBook.entrySet();
		//set에 그룹명과 group이라는 hashmap을 set에 참조하고
		Iterator it = set.iterator();
		//이터레이터에 꺼내서 하나씩읽을준비한다.
		
		//hasNext로 겉에 보이는걸 하나씩 읽는다.
		while(it.hasNext()) {
			//하나씩 읽은 set을 업캐스팅해서 참조한다.
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+" "+telNo);
			}
			System.out.println();
		}
	}
}
