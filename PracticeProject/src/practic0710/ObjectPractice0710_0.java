package practic0710;

public class ObjectPractice0710_0 {

		public static void main(String[] args) {
			
			int num = 10;
			int num2 = 20;
			
			int sum = add(num, num2);//이게 인자.
			System.out.println(num+"+"+num2+" = "+ sum + "입니다.");
			
		}
		
		public static int add(int a , int b) {
			return a+b;
		}
		/*
		 * 여기서 주의 할점
		 * 1. add 매서드를 인스턴스 생성없이 호출을 했다
		 * 2. 인스턴스 없이 호출을 할려면 static인 클래스 매서드를 써야하고
		 * 3. num , num2의 멤버 변수를 쓸수 없는게 static 매서드 특징이고
		 * 4. num,num2는 실제 있는 변수 : 인수 : 라고한다.
		 */
}
