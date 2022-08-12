package kr.co.lambda;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class LambdaEx05 {
	
	public static void main(String[] args) {
		
		Supplier<String> sup = () -> "사랑해";
		Consumer<String> con = str ->System.out.println(str+"사랑해");
		//Consumer은 값을 넣는게 아니라 타입매개변수 값이와서 처리하는거였다.
		con.accept("람다");
		System.out.println(sup.get());
		Predicate<Integer> isNumber = num-> num%2==0;
		System.out.println(isNumber.test(55)); //false
		Function<String,Integer> fun = str-> str.length();
		System.out.println(fun.apply("이연이란")); //4
		
		TreeMap<String,Integer> map = new TreeMap<>();
		map.put("단팥빵", 1550);
		map.put("슈크림", 2300);
		map.put("식빵", 3600);
		map.put("군고구마", 3200);
		
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		Function<Set<Map.Entry<String,Integer>>,Integer> fun2 = (sets)->{
			Iterator<Map.Entry<String,Integer>> it = sets.iterator();
			int sum = 0;
			while(it.hasNext()) {
				Entry<String,Integer> result = it.next();
				String name = result.getKey();
				Integer price = result.getValue();
				sum +=name.length()+price;
			}
			return sum;
		};
		
		System.out.println(fun2.apply(set));
		
	}
}
