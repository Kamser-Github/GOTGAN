package k2207b;

import k220719.Animal01;
import k220719.Cat01;
import k220719.Dog01;

public class AnimalTest01 {
	
	public static void main(String[] args) {
		//Animal01 ani01 = new Animal01(); 추상 클래스라서 못만든다.
		
		//
		
//		Cat01 cat01 = new Cat01(3, "야통", 0, "생선");
//		Dog01 dog01 = new Dog01(2,"백두",1500,1);
//		Cat01 cat02 = new Cat01(1, "길막이", 900, "사료");
//		Dog01 dog03 = new Dog01(4,"두산",1200,5);
		//객체 다향성으로 한꺼번에 처리가 가능해진다.
		//방법 1
		Animal01[] anilist = new Animal01[4];
		anilist[0] = new Cat01(3, "야통", 0, "생선");
		anilist[1] = new Dog01(2,"백두",1500,1);
		anilist[2] = new Cat01(1, "길막이", 900, "사료");
		anilist[3] = new Dog01(4,"두산",1200,5);
		
		//방법2 바로 초기화를 하면 new연산자는 생략이 가능해진다.
		Animal01[] anilist2 = { 
				new Cat01(3, "야통", 0, "생선"),
				new Dog01(2,"백두",1500,1),
				new Cat01(1, "길막이", 900, "사료"),
				new Dog01(4,"두산",1200,5)
		};
		
		//1.출력 방법
		/*anilist 참조변수에 참조 값이 들어가있는데
		 * 거기를 따라가면 참조변수가 순서대로 나열되어있는
		 * 배열이 나온다. 배열 개개인마다 또 참조변수 이기때문에
		 * 참조값이 들어있고 거기에 인스턴스가 참조되어있다
		 */
		for(int i=0 ; i<anilist.length ; i++) {
			anilist[i].bark();
			anilist[i].character();
			//여기서 자손이 가진 고유 매서드는 호출이 안된다
			//참조타입이 animal이기 대문에 호출시킬 참조가 없다.
			//따라서 instanceof라는 연산자로 똑같을경우
			//조건문들 만들어서 사용한다.
			if(anilist[i] instanceof Cat01) {
				((Cat01)anilist[i]).hateMotion();
			}else if(anilist[i] instanceof Dog01){
				((Dog01)anilist[i]).happyMotion();
			}
		}//for end
		
		//2. 항상된 for문
		
		for(Animal01 a : anilist) {
			a.bark();
			a.character();
			if(a instanceof Cat01) {
				((Cat01)a).hateMotion();
			}else if(a instanceof Dog01) {
				((Dog01)a).happyMotion();
			}
		}
		
		//다 가능하다. 이때 형변환이 필요하다
	}//main end
}
