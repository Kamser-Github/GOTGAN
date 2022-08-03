package day0803;
import java.util.Set;
import java.util.HashSet;
public class HashSet01 {
	
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		
		Set set = new HashSet();
		
//		for(int i=0; i< objArr.length; i++) {
//			set.add(objArr[i]);
//		}
		
		
		System.out.println(set);
		
		
	}
}
