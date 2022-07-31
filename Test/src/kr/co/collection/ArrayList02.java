package kr.co.collection;
import java.util.ArrayList;
import java.util.List;
public class ArrayList02 {
	
	public static void main(String[] args) {
		
		final int LIMIT = 10;
		String source = "021654789981!@%!%$#@^@##@$@#%!#!@%&&(^&(";
		int length = source.length();
		
		List arr = new ArrayList(length/LIMIT + 10);
		
		for(int i=0 ;i <length ; i+=LIMIT) {
			if(i+LIMIT < length) {
				arr.add(source.substring(i, i+LIMIT));
			}
			else
				arr.add(source.substring(i));
		}
		
		for(int i=0 ; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}	
