package day5.collection01;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice01 {
	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0 ; i<objArr.length ; i++) {
			set.add(objArr[i]);
		}
		//저장 순서는 알수가 없다.
		System.out.println(set);//[1, 1, 2, 3, 4]
	}
}
