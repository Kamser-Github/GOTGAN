package kr.co.lambda;

@FunctionalInterface
interface AddFunction{
	int add(int a, int b);
}
//매개변수 2개를 받아서 결과로 출력하는
//함수형 인터페이스
public class LambdaEx02 {
	
	public static AddFunction newAddFunction(){
		AddFunction add = (a,b)->a+b;
		return add;
	}
	
	public static int execute2(AddFunction a) {
		return a.add(4, 5);
	}
	
	public static void main(String[] args) {
		
		AddFunction calc = new AddFunction() {
			@Override
			public int add(int a,int b) {
				return a+b;
			}
		};
		AddFunction calc2 = (a,b)-> a+b;
		
		AddFunction adfun = newAddFunction();
		/*newAddFunction은 자기가 구현한걸
		 * 그대로 반환해서 참조값을 대입한다.
		 */
	}
}


//람다식은 함수인데 이름이 없어
//이름이 없으면 object로 받아서 쓰려고해도
//object는 참조변수로 해당 매서드를 호출을 못해
//그렇다고 형변환이 가능한것도 아니야
//그래서 인터페이스에 함수형으로 지정해서 사용함


//함수형 인터페이스는 람다식으로 사용하고
//매개변수로 사용해서 바로 호출할수도 있고
//람다식으로 줄여서 사용이 가능하고
//구현해서 새 이름을 줄수도있고
//결국 선언부만 같고 나머지 내용은 다르다.
