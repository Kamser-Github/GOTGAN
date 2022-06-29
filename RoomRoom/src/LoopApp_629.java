import java.util.Arrays;

public class LoopApp_629 {

	public static void main(String[] args) {
		
//		System.out.println(1);
//		while(true) {
//		System.out.println(2);
//		System.out.println(3);
//		} 무한반복
//		int i = 0;
//		while(i < 3) {
//		System.out.println(2);
//		System.out.println(3);
//		i = i + 1;
//		// i++;
//		} ;// 궁금증 : do while 에 do는 무슨일이 생겨도 한번만 반복하는건가
		
//			int j = 1; // 곱하기 초기값 설정
//			do {
//				System.out.print("*"+j+"="+j+"\t");
//				j++; // j 증감식
//			} while (j<=9); // j 조건식
//				System.out.println();
//			오류 없이 실행 완료;
		
		
//		do {
//			int j = 1;
//			System.out.print("*"+j+"="+j+"\t");
//			j++; // j 증감식
//		} while (j<=9); // j 조건식
//			System.out.println();
//	    선언은 do while 문 밖에서 해야 된다; 값이 초기화가 안되기 때문이다;
		
//		for(int j = 5 ; j < 5 ; j ++ ) {
//			
//			System.out.println("*");
//			
//		}
		
		// 실행이 되지 않는다;
		
		//while 장점  : 원시적이다
		//		단점  : 반복문의 중요성인 조건 비교 증감을 한눈에 파악하기 어렵다;
		//				간섭이나 그룹이 되어있는지 확인하기 어렵다;
		// 몇번 반복할땐 for문이 보기 편하다;
		
		//Array 배열 - 반복문과 땔수없는 *관계 데이터가 무수히 많을때* 정리정돈
		
		// String DeskTalbe = " mouse , pen , tv";
//		String[] MyDesk = new String[3];
//		MyDesk[0] = "pen";
//		MyDesk[2] = "tv";
//		
//		System.out.println(MyDesk[0]);
//		System.out.println(MyDesk[1]); //null
//		 
//		System.out.println(MyDesk.length); //3
//		
//		int[] scores = new int[3];
//		int[] scores2 = {10,50,100};
//		
//		for(int i=0 ; i < MyDesk.length ; i++) {
//			System.out.println("My"+MyDesk[i]);
//		}
		// .length 변수 대처에 좋다;
		
		// 머리에서 꺼내보기
		
//		String[] Myfamily = {"Park" , "Kang" ,"Kang2"};
//		String inputIid = args[0];
//		
//		boolean isCome = false;
//		for(int i = 0 ; i < Myfamily.length ; i++) {
//			String currentId = Myfamily[i];
//			if(currentId.equals(inputIid)) {
//				isCome = true;
//				break;
//			}
//		}
//		System.out.println("Hi, ");
//		if(isCome && Myfamily[0].equals(inputIid)) {
//			System.out.println("My Mom!!");
//		} else if(isCome && Myfamily[1].equals(inputIid)) {
//			System.out.println("My father");
//		} else if(isCome && Myfamily[2].equals(inputIid)) {
//			System.out.println("My Son");
//		} else {
//			System.out.println("who are you?");
//		}
//		
//		동작 완료 . 다른 코드로 써보기;
		
//		System.out.println("Hi, ");
//		switch(args[0]) {
//		case ("Park") : System.out.println("My mom");
//		break;
//		case ("Kang") : System.out.println("My father");
//		break;
//		case ("Kang2") : System.out.println("My Son");
//		break ;
//		default : System.out.println("who are you?");
//		break;
//		}
		
		//단점 사람이 많아질 경우 하나하나 다 추가를 해야한다;
		//for 반복문으로 작성해보기

//		String[] MyName = {"Park" , "Kang" ,"Kang2"};
//		String[] MyFamily = {"Mom" , "Father" ,"Son"};
//		String inComePerson = args[0];
//		for(int i = 0 ; i < MyName.length ; i++) {
//			
//			System.out.println("Hi, ");
//			if(Arrays.asList(MyName).contains(inComePerson)) {
//				System.out.println("My " + MyFamily[i]);
//				break;
//			} else {
//				System.out.println("who are you?");
//			}
//				
//		} 작동 완료;
		
		//배열 원소에 배열을 넣어보기;
		
//		String[] MyCard = {"Sinhan" , "Samsung" ,"Korea"};
//		String[][] FamilyHigh = {
//				{"Sinhan","1234"},
//				{"Samsung","2345"},
//				{"Korea","3456"}
//		};
//		System.out.println(Arrays.toString(MyCard));
//		System.out.println(Arrays.deepToString(MyCard));
//		System.out.println(Arrays.deepToString(FamilyHigh));
		
		// 오늘 먹은 아침 음식 칼로리 계산해보기 
		
		String[] EatFood = {"noodle","banana","hambergerSet","egg"};
		String[][] EatCalorie = {
				{"noodel","500"},
				{"banana","93"},
				{"hambergerSet","1750"},
				{"egg","79"}			
		};
		
		int TodayTotalCalorie = 0;
		String[] TodayTotalEatFood = args;
		
		//argument "noodle" "banana" "hambergerSet" "egg" 
		
		System.out.println(Arrays.toString(TodayTotalEatFood));
		//[noodle,banana,hambergerSet,egg]
		
		//음식의 칼로리를 꺼내보기;
		
		//먼저 argument가 EatCalorie에 있는가 검색하기
//		for(int i = 0 ; i < TodayTotalEatFood.length ; i++) {
//		if(Arrays.asList(EatFood).contains(TodayTotalEatFood[i])) {
//			System.out.println("삐이");
//		}
//		}
		
		//EatCalorie에 있는 칼로리를 꺼내보기;
//		for(int i = 0 ; i < TodayTotalEatFood.length ; i++) {
//		if(Arrays.asList(EatFood).contains(TodayTotalEatFood[i])) {
//			System.out.println(EatCalorie[i][1]);
//		}
//		}
		
		//꺼낸 칼로리를 더해보기;
//		for(int i = 0 ; i < TodayTotalEatFood.length ; i++) {
//		if(Arrays.asList(EatFood).contains(TodayTotalEatFood[i])) {
//			TodayTotalCalorie += Integer.parseInt(EatCalorie[i][1]);
//		}
//		}
//		System.out.println(TodayTotalCalorie);
		
		
		
//		TwoTimesA();
		
		
		
	}
//	 	메소드 만들어보기
//	public static void TwoTimesA() {
//		System.out.println("a");
//		System.out.println("a");
//		System.out.println("a");
//		System.out.println("a");
//	}
	
	
}

