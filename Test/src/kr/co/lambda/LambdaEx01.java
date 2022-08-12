package kr.co.lambda;

@FunctionalInterface
interface MyFunction{
	void run();
}


public class LambdaEx01 {

	static void execute(MyFunction f) {
		f.run();
	}
	static MyFunction getMyFunction() {
		
		MyFunction f = ()->System.out.println("f3.run()");
		/*MyFunction(){
		 * @Override
		 * public void run(){
		 * System.out.println("f3.run()");
		 */
		return f;
		//뜻은 람다식을 구현한 아래와 같이 구현한게 나온다
		//그이름을 getMyfunction();이라한다.
	}
	
	public static void main(String[] args) {
		MyFunction f1 = ()->System.out.println("f1.run()");
		MyFunction f2 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		MyFunction f3 = getMyFunction();
		//f3에 ()->System.out.println("f3.run()"); 이걸 넣겟다.
		
		
		f1.run();
		//run은 결국 함수형 인터페이스에 있는 매소드를 부르는거고
		//그걸 각자 자기가 필요한 상태로 쓰는것이다.
		
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () ->System.out.println("run()") );		
	}
	
	
}

