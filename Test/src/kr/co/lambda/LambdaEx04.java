package kr.co.lambda;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx04 {
	
	public static void main(String[] args) {
		
		//1.입력 출력도 없는 함수형 인터페이스
		Runnable run = ()->System.out.println("출력");
		
		//2.입력만 있는 함수형 인터페이스
		Supplier<Integer> sl = () -> 5;
		//근데 넌 왜 유틸에 들어가잇는거니?
		
		//3.매개변수값만 있고 출력은 없다.
		Consumer<String> cs = str-> System.out.println(str);
		
		//4.매개변수를 받아 결과를 반환
		Function<String,Integer> fun = str -> 5;
		//이 함수는 결국 결과타입을 알수가 잇다.
		
		//5.매개변수는 하나 결과값은 boolean;
		Predicate<String> result = str -> false;
		
		Predicate<Integer> isOddNumber = num -> num%2==0 ;
		Predicate<String> isEmpty = str -> str.length()==0 ;
		
		//이제 람다식으로 정리했으니 FM으로 정리해봐야겟다.
		
		Runnable run1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("사랑한다 람다야");
			}
		};
		
		Supplier<String> sup = new Supplier<String>() {
			@Override
			public String get() {
				return "사랑해요 람다";
			}
		};
		
		Consumer<String> con = new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println("사랑한다 람다야");
			}
		};
		
		Function<String,Integer> fun3 = new Function<String,Integer>(){
			@Override
			public Integer apply(String str) {
				return str.length();
			}
		};
		
		Predicate<Integer> pre = new Predicate<Integer>() {
			@Override
			public boolean test(Integer num) {
				//비교식이 온다?
				return num%2==0;
			}
		};
		
		
	}
	
	public static Runnable run3() {
		Runnable run = ()-> System.out.println("사랑해 람다야");
		return run;
	}
	
	public static void run4(Runnable run) {
		run.run();
	}
	
	public static Supplier<String> sup(){
		Supplier<String> supr2 = ()-> "사랑해 람다";
		return supr2;
	}
	
	public static <T> void sup2(Supplier<T> sup) {
		sup.get();
	}
	
	public static <T extends Consumer<? super T>> Consumer<T> con(){
		Consumer<T> newcon = (AA)->System.out.println("사랑해");
		return newcon;
	}
	
//	public static <T extends Supplier<? super T>> Supplier<T> sup2(){
//		//위에 있는뜻이
//		//타입변수 T는 Supplier를 구현했고.
//		//Supplier를 구현한 T의 조상들은 올수잇다.
//		Supplier<T> sup = ()-> return ;
//		이건 고민을 해봐야겟다.
//	}
}
