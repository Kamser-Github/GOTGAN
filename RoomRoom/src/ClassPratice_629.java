import org.w3c.dom.ls.LSOutput;

//
//public class ClassPratice_629 {
//
//	public static void main(String[] args) {
//		
//		//.
//		//.
//		System.out.println("---");
//		System.out.println("A");
//		System.out.println("A");
//		//.
//		//.
//	}
//
//}

//    매소드로 정리하기

//public class ClassPratice_629 {
//
//	public static void main(String[] args) {
//		
//		//.
//		//.
//		printA();
//		//.
//		//.
//		printB();
//		//..
//		//..
//		printC();
//	}
//
//	public static void printC() {
//		System.out.println("---");
//		System.out.println("C");
//		System.out.println("C");
//	}
//
//	public static void printB() {
//		System.out.println("---");
//		System.out.println("B");
//		System.out.println("B");
//	}
//
//	public static void printA() {
//		System.out.println("---");
//		System.out.println("A");
//		System.out.println("A");
//	}
//
//}

//public class ClassPratice_629 {
//
//	public static void main(String[] args) {
//		
//		//.
//		//.
//		printA("---");
//		//.
//		//.
//		printB("***");
//		//..
//		//..
//		printC("===");
//	}
//
//	public static void printC(String delimiter) {
//		System.out.println(delimiter);
//		System.out.println("C");
//		System.out.println("C");
//	}
//
//	public static void printB(String delimiter) {
//		System.out.println(delimiter);
//		System.out.println("B");
//		System.out.println("B");
//	}
//
//	public static void printA(String delimiter) {
//		System.out.println(delimiter);
//		System.out.println("A");
//		System.out.println("A");
//	}
//
//}

//클래스로 묶어서 한번에 정리해보기

//public class ClassPratice_629 {
//
//	public static void main(String[] args) {
//		Print.delimiter = "----";
//		//.
//		//.
//		Print.A();
//		//.
//		//.
//		Print.delimiter = "---3-";
//		Print.B();
//		//..
//		//..
//		Print.C();
//	}
//	
//
//}

//Class Print를 따른 자바 파일로 분할정리 했다;
//인스턴스를 사용해서 정리해보자

//public class ClassPratice_629 {
//
//	public static void main(String[] args) {
//		Print t1 = new Print();
//		Print t2 = new Print();
//		
//		t1.delimiter = "*-*-*-*";
//		t2.delimiter = "3-----3";
//		t1.A();
//		//static으로 변수를 지정하면 링크가 연결되여 마지막에 선언한게 적용됨
//		//각자 적용하고 싶으면 static을 지우고 사용한다;
//		
//	}
//	
//
//}


//static 이해하기
//class Foo{
//    public static String classVar = "I class var";
//    public String instanceVar = "I instance var";
//    public static void classMethod() {
//        System.out.println(classVar); // Ok
////      System.out.println(instanceVar); // Error
//    }
//    public void instanceMethod() {
//        System.out.println(classVar); // Ok
//        System.out.println(instanceVar); // Ok
//    }
//}

//
//public class ClassPratice_629 {
// 
//    public static void main(String[] args) {
//        System.out.println(Foo.classVar); // OK
////      System.out.println(Foo.instanceVar); // Error
//        Foo.classMethod();
////      Foo.instanceMethod();
//         
//        Foo f1 = new Foo();
//        Foo f2 = new Foo();
////      
//        System.out.println(f1.classVar); // I class var
//        System.out.println(f1.instanceVar); // I instance var
////      
//        f1.classVar = "changed by f1";
//        System.out.println(Foo.classVar); // changed by f1
//        System.out.println(f2.classVar);  // changed by f1
////      
//        f1.instanceVar = "changed by f1";
//        System.out.println(f1.instanceVar); // changed by f1
//        System.out.println(f2.instanceVar); // I instance var
//    }
// 
//} //static은 instance를 무한정 만들어도 하나의 데이터를 공유한다;
//	또한 instance를 접근하려면 instance로 접근해야한다.


// 생성자와 this를 사용하기;
//public class ClassPratice_629 {
//
//	public static void main(String[] args) {
//		
//		Print t1 = new Print("");
//		t1.A();
//		t1.A();
//		t1.A();
//		//class delimiter 사용하게 생성자 매서드를 완성시키자;
//		
//	}
//}
//class Accounting {
//    // 공급가액
//    public static double valueOfSupply;
//    // 부가가치세율
//    public static double vatRate = 0.1;
// 
//    public static double getVAT() {
//        return valueOfSupply * vatRate;
//    }
//     
//    public static double getTotal() {
//        return valueOfSupply + getVAT();
//    }
//}
//
//public class ClassPratice_629 {
////    // 공급가액
////    public static double valueOfSupply = 10000.0;
////    // 부가가치세율
////    public static double vatRate = 0.1;
//// 
////    public static double getVAT() {
////        return valueOfSupply * vatRate;
////    }
////     
////    public static double getTotal() {
////        return valueOfSupply + getVAT();
////    }
// 
//    public static void main(String[] args) {
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());
//        //회계업무 클래스를 따로 만들어서 지정하면, total이라는 흔한 명사에 설명을 붙여 보기가 편해진다;
//    }
// 
//}
//상속 연습하기
public class ClassPratice_629 {
    public static void main(String[] args) {
    	
//    	Cal c = new Cal();
//    	Cal3 b = new Cal3();
//    	System.out.println(c.sum(1, 2));
//    	System.out.println(b.sum(1,2,3));
//    	System.out.println(b.sum(1,2));
    }
}
//class Cal {
//	int v1,v2;
//	Cal(int v1,int v2){
//		this.v1 = v1;
//		this.v2 = v2;
//	}
//	public int sum() {
//		return this.v1+this.v2;
//	}
//	
//}
////
//
//class Cal3 extends Cal {
//		Cal3(int v1 ,int v2){
//			super(v1,v2);
//			System.out.println("LL");
//				
//	}
//		public int minus() {
//			return this.v1 - this.v2 ;
//		}
//};
//

//class Cal {
//	public int sum (int v1, int v2) {
//		return v1 + v2 ;
//	}
//	
//}
//
//class Cal3 extends Cal {
//	//overloading
//	public int sum (int v1, int v2 , int v3) {
//		return v1 + v2 + v3;
//	}
//	//overriding
//	public int sum(int v1, int v2){
//        System.out.println("Cal3!!");
//        return v1+v2;
//	}
//}
