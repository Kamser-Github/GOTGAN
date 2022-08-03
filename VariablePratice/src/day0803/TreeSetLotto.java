package day0803;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetLotto {
	
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i=0 ; set.size() <6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		
		TreeSet treeSet = (TreeSet)set;
		Set largeSet = treeSet.tailSet(25);
		
		System.out.println(largeSet);
		System.out.println(treeSet);
	}
}
