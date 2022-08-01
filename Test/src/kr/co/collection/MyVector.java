package kr.co.collection;

import java.util.*;
public class MyVector implements List{
	
	Object[] data = null; //객체를 담기위한 객체 배열을 선언한다.
	int capacity = 0 ; //용량
	int size = 0 ; //크기
	
	public MyVector(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("유효하지 않은 값입니다. :"+capacity);
		
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10); // 아무것도 입력을 안했을경우에는 10을 기본 용량으로 한다.
	}
	
	//최소한의 저장 공간(capacity)를 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}
	
	public boolean add(Object obj) {
		//새로운 객체를 저장하기전에 공간을 확보한다.
		ensureCapacity(size+1);
		data[size++]=obj;
		return true;
	}
	
	public Object get(int index) {
		if(index<0 || index >=size) 
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	
	public Object remove(int index) {
		Object oldObj = null;
		
		//삭제할 객체 선정이 딸이에요
		if(index<0 || index>=size) 
			throw new IndexOutOfBoundsException("범위를 벗어났습니다");
		oldObj = data[index];
		
		//삭제하고자 하는 객체가 마지막이 아니라면, 배열복사를 통해 빈자리를 채워줘야한다.
		if(index!=data.length-1) {
			System.arraycopy(data, index+1 , data , index , size-index-1);
		}
		
		//마지막 데이터를 null로 한다. 배열은 0부터 시작해서 마지막 요소는
		//index가  size-1이다
		data[size-1] = null;
		size--;
		return oldObj;
	}
	
	public boolean remove(Object obj) {
		for(int i=0; i<size ; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity==capacity) return;//크기가 같으면 그대로 유지
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i=0 ; i<size ; i++) {
			data[i] = null;
		}
		size = 0;
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	public boolean isEmpty() {return size==0;}
	public int capacity() {return capacity;}
	public int size() {return size;}
	
	//****************************************
	//List 인터페이스로부터 상속받은 매서드들 구현해보자*
	//****************************************
	//직접 코드 작성해보기.
	public boolean contains(Object obj) { 
		/*
		슈드코드 작성
		for(size만큼 반복){
		if(obj가 data[i]랑 똑같은지 비교){
			똑같다면 true를 리턴
		}
		*/
		for(int i=0; i<size ; i++) {
			if(obj.equals(data[i])) {
				return true;
			}
		}
		return false;}
	public Iterator iterator() { return null;}
	public Object[] toArray(Object[] a) { return null;}
	public boolean containsAll(Collection c) {return false;}
	public boolean addAll(Collection c) {return false;}
	public boolean addAll(int index,Collection c) {return false;}
	public boolean removeAll(Collection c) {return false;}
	public boolean retainAll(Collection c) {return false;}
	public boolean equals(Object obj) {
		//this는 자기 자신을 가리키는 참조변수이다.
		return (this==obj);
		}
	
	public Object set(int index,Object element) {
		//지정한 위치에 element를 저장한다.
		/*
		슈드코드작성
		index가 0보다 작으면 throw 오류발생
		index가 size보다 크면 사이에 null로 채우고 그 다음 더한다.
		초기 capacity값을 주고
		size에 +1을 했을때 length랑 같거나 크다면
		while(capacity<index){ capacity를 2배씩 곱한다 }
		그후 setCapacity()함수 호출
		index에 elemnet를 초기화
		else{
		index 기준으로 한칸씩 Object[] tmp 에 복사를 하고
		data[index]에 초기화를 한다.
		}
		*/
		if(index<0)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		else if(index>=data.length) {
			while(capacity<index) {
				capacity*=2;
			}
			setCapacity(capacity);//배열을 그만큼 늘리고
			data[index]= element; //그 자리에 넣는다.
			return data;
		}
		else {//그게 아니라면
			Object[] tmp = new Object[capacity];
			System.arraycopy(data, index, tmp, index+1 ,size-index );
			tmp[index]=element;
			data = tmp;
			return data;
		}
	}
	public void add(int index,Object element) {}
	public int indexOf(Object obj) {return -1;}
	public int lastIndexOf(Object obj) {return -1;}
	public ListIterator listIterator(int index) {return null;}
	public ListIterator listIterator() {return null;}
	public List subList(int fromIndex,int toIndex) {return null;}
	@Override
	public String toString() {
		
		return this.getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
}
