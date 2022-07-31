package kr.co.collection;

import java.util.Vector;

public class VectorTest01 {
	
	public static void main(String[] args) {
		//List Collection의 저장 방식의 고찰
		
		//용량 (capacity)을 5인 Vertor를 생성
		Vector v = new Vector(5);
		
		/*
		capacity는 용량을 2배씩 늘린다 초기 용량보다
		size 6이면 초기용량이 5였으니까 10
		size 11이면 두번째 초기용량의 2배인 20이 된다.
		
		배열의 사이즈나 용량이 바뀔때마다
		배열 하나를 새로 생성해서 붙여넣는 과정이 있기때문에
		초기에 배열크기를 2배로 지어주는게 좋을듯하다.
		
		
		
		
		*/
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("3");
		v.add("3");
		print(v);
		/*
		[1, 2, 3]
		size : 3
		capacity : 5
		*/
		
		v.trimToSize(); //빈 공간을 없앤다.
		System.out.println("----After trimToSize-----");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("----After ensureCapacity(6)-----");
		print(v);
		
		v.setSize(7);
		System.out.println("----After setSize(7)-----");
		print(v);
		
		v.clear();
		System.out.println("-----After clear()-----");
		print(v);
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : "+v.size());
		System.out.println("capacity : "+v.capacity());
	}
}
