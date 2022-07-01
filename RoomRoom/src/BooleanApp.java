
public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("one"); //문자열
		System.out.println(1);//숫자
		//숫자는 무한,boolean 단 두개
		System.out.println(true);
		// reserved word
		
		//boolean type
		String foo = "Hello World";
		System.out.println(foo.contains("Hello")); //ture
		System.out.println(foo.contains("hello")); //false
		System.out.println(foo.contains("Hello ")); //ture

		//Comparison Operator
		//boolean type
		
		System.out.println(1>1);//false < 
		System.out.println(1==1); //ture <= , >=
		
		
		//Conditional Statement 정말 중요
		//조건문
		
		System.out.println("a"); 
		if(true) { //if 값은 boolean type 만 가능하다. 결과값이 ture false.
			System.out.println(1);
		};
		if(false) { //Dead code 실행되지 않는 코드
			System.out.println(1);
		} else { // if else 그룹으로 묶으면 끼어들수가 없다.
			if(true) {
			System.out.println(1);
			} else {
				System.out.println(3);
			}
			//if 안에 if 문이 들어갈수 있는데 가시성이 안좋다.
		};
		if(false) {
            System.out.println(1);
        } else if(true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }; //else if 를 쓰면 보기 편하게 정리할수있다.
        
        
		
		System.out.println(1);
		System.out.println("b");
		
		//argment = egoing ;
		System.out.println(args[0]);
		
		String id = "egoing";
		String inputId = args[0];
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println(args[1]);
		
//		inputId == id false
//		inputId.equals(id) ture
//		if(inputId.equals(id)) {
//			if(inputPass.equals(pass)) {
//			System.out.println("Master!");
//			}
//		} else {
//			System.out.println("Who are you");
//		} // who are you - error debug
		
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you");
		}
		String inputExA = "Argument" ;
		String inputFile = "File" ;
		String inputNetwork = "Network";
		String inputAudio = "Audio";
		String Program = "Program" ;
		
		String inputNamer = args[2];
		
		if(inputNamer.equals(inputExA) || inputNamer.equals(inputFile)) {
			System.out.println("OUT PUT");
		}
		
		
	}
	
}
