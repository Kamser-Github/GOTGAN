package day5.collection01;
import java.util.Vector;
import java.util.Iterator;
import java.lang.IllegalStateException;
public class MyVector2 extends Vector implements Iterator {
	
	int cursor = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity) {
		super(capacity);
	}
	
	public MyVector2() {
		this(10);
	}
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		
		for(int i=0 ; it.hasNext() ; i++) {
			if(i!=0) tmp+=",";
			tmp += it.next();//tmp += next().toString();
		}
		return "["+tmp+"]";
	}
	public Iterator iterator() {
		cursor = 0; //초기화
		lastRet = -1;
		return this;
	}
	public boolean hasnext() {
		return cursor!=size();
	}
	
	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}
	
	public void remove() {
		//더 이상 삭제할게 없으면 예외 발생
		if(lastRet==-1) {
			throw new IllegalStateException();
		}
		else {
			remove(lastRet);
			cursor--;
			lastRet = -1; //삭제하면 전체를 다 줄인다.
		}
	}
	
	public static void main(String[] args) {
		MyVector2 mv2 = new MyVector2() ;
		mv2.add("1");
		mv2.add("9");
		mv2.add("3");
		mv2.add("4");
		mv2.add("4");
		mv2.add("4");
		
		Iterator ir = mv2.iterator();
		ir.next();
		ir.remove();
		ir.next();
		ir.remove();
		
		System.out.println(mv2);
	}
}
