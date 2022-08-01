package kr.co.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {
	
	//LinkedList
	//배열과는 다르게 link로 연결되어있다
	class Node{
		Node next;
		//다음 요소를 저장
		Object obj;
		//데이터를 저장
	}
	
	//참조값만 바꿔주면 되기때문에
	//AarryList보다 중간지점 추가 / 삭제가 빠르다.
	//단 방향이기 때문에 이전 요소를 찾기가 어려워
	
	class DoublyLinkedList{
		Node next;
		Node previous;
		Object obj;
	}
	
	//이전 참조값도 넣을수있는 변수가 있다.
	
	//반대방향 끝을 바로 연결한것이
	
	class DoublyCircularLiskedLikst{
		
	}
	//Overflow처럼 처음에서 뒤로가면 맨끝으로 간다.
	
	public static void main(String[] args) {
		
		//추가할 데이터의 개수를 고려하여 충분히 잡아야한다.
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("=====순차적으로 추가하기======");
		System.out.println("ArrayList : "+add1(al));
		System.out.println("LinkedList : "+add1(ll));
		System.out.println("----------------------");
	    System.out.println("=====중간지검으로 추가 =======");
	    System.out.println("ArrayList : "+add2(al));
		System.out.println("LinkedList : "+add2(ll));
		
	    System.out.println("=====중간삭제으로 추가 =======");
		System.out.println("ArrayList : "+remove2(al));
		System.out.println("LinkedList : "+remove2(ll));
		
		System.out.println("=====순차적삭제하기 추가 =======");
		System.out.println("ArrayList : "+remove1(al));
		System.out.println("LinkedList : "+remove1(ll));
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i<1000000 ; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0 ; i<10000 ; i++)
			list.add(500,"x");
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0 ; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for(int i =0 ; i<10000 ; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}
