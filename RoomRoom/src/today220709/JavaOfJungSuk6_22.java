package today220709;

public class JavaOfJungSuk6_22 {
	
	//매서드를 작성하시오.
	public static boolean isNumber(String str) {
		boolean result = false;
		for(int i = 0 ; i < str.length() ; i++) {
			if(48>str.charAt(i) || str.charAt(i) > 57) {
				result = false;
				break;
			} else result = true;	
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+" 는 숫자입니까? "+isNumber(str)); 
		str = "1234o";
		System.out.println(str+" 는 숫자입니까? "+isNumber(str));
	}
}
