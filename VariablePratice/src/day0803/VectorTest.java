package day0803;
import java.util.Iterator;
import java.util.Vector;
public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		vec.add("1");
		vec.add("2");
		vec.add("3");
		vec.add("4");
		vec.add("5");
		
		System.out.println("삭제전 : "+vec);
		Iterator it = vec.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
		System.out.println("삭제후 : "+vec);
		
		
	}
}	
