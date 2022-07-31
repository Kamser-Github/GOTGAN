package kr.co.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArratList01 {
	
	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList(10);
		arr.add(new Integer(4));
		arr.add(new Integer(13));
		arr.add(new Integer(12));
		arr.add(new Integer(5));
		arr.add(new Integer(2));
		
		ArrayList arr2 = new ArrayList(arr.subList(0, 3));
		
		print(arr,arr2);
		
		Collections.sort(arr);
		Collections.sort(arr2);
		
		print(arr,arr2);
		
		System.out.println("arr.containAll(arr2) = "+
								arr.containsAll(arr2));
		
		arr2.add("B");
		arr2.add("C");
		arr2.add(3,"A");
		print(arr,arr2);
		
		arr2.add(3,"AA");
		print(arr,arr2);
		
		//교집합
		System.out.println("List.retainAll(list2) :"
							+arr.retainAll(arr2));
		print(arr,arr2);
		
		//차집합
//		arr2.removeAll(arr);
		
		//이걸 for문으로 표현
		for(int i=arr2.size()-1; i>=0 ; i--) {
			if(arr.contains(arr2.get(i))){
				arr2.remove(i);
			}
		}
		//ArrayList는 앞에 부터 지워지면
		//한칸씩 땡겨 앉기 때문에 뒤에서부터 차근차근 지워줘야한다.
		
		print(arr,arr2);
		
		
		
		
		
		
		
	}
	
	public static void print(List a,List b) {
		
		System.out.println("arr 의 배열 "+a);
		System.out.println("arr2 의 배열 "+b);
	}
}
