package kr.co.collection;
import java.util.Vector;
import java.util.EmptyStackException;
public class MyStack extends Vector{
	
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek();
		//Stack에 저장된 마지막 요소를 읽는다.
		//만일 Stack이 비어잇으면 peek()메서드가 EmptyStackException을 발생
		//마지막 요소를 삭제하고.배열의 index가 0으로 시작하므로 1을 빼준다
		removeElementAt(size()-1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if(len==0) {
			throw new EmptyStackException();
		}
		//마지막 요소를 반환한다. 배열의 index가 0으로 시작하기때문에
		//1을 빼준다
		return elementAt(len-1);
	}
	
	public boolean empty() {
		return size()==0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o);
		
		if(i>0) {
			return size()-i;
		}
		return -1;
	}
}
