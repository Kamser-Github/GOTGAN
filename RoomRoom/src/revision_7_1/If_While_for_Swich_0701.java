package revision_7_1;

import java.util.Scanner;

public class If_While_for_Swich_0701 {


	// if문 머리에서 생각난거 써보기;

	public static void main(String[] args) {
		
		//부족한 swich case 해보기
		
		String grade ;
		grade = "학생";
		
		switch(grade){
			case "학생" :
				System.out.println("청소년 입니다");
				break;
			case "어른" :
				System.out.println("성인 입니다");
				break;
			case "노약자" :
				System.out.println("노약자 입니다");
				break;	
		}
			
		int month;
		int day;
		month = 3;
		
		switch(month){
			case 1 : case 3: case 5 : case 7 : case 8 : case 10 : case 12 :
				day = 31;
				break;
			case 2 :
				day = 28;
				break;
			default :
				day = 30;
		}
		System.out.println(day);
		
		//점수를 받아 A, B, C, D, F 인지를 출력하는 프로그램을 작성하시오.
		
		int score = 100;
		int grade1 = score/10 ;
		
		switch (grade1) {
			case 10 :
				System.out.println("A");
				break;
			case 9 :
				System.out.println("B");
				break;
			case 8 :
				System.out.println("C");
				break;
			case 7 :
				System.out.println("D");
				break;
			case 6 :
				System.out.println("E");
				break;
			default :
				System.out.println("E");
				break;
				
		}
			
//		학생의 키와 몸무게를 받아서 BMI를 계산해서 아래 표에 맞게 출력!
//		- 18.5 이하 : 저체중
//		- ~25: 정상
//		- ~30: 과체중
//		- ~40: 비만
//		- 그 이상: 고도비만
//		- BMI 계산방법 : 몸무게/ 키(제곱)(키는 m, 몸무게는 kg)
//		    - ex> 키가 170이고 몸무게가 50kg이면 50/1.70^2 = 17.30이니 저체중
		
		double studentHeight = 150;
		double studentWeight = 45;

			
		double bmi =  studentWeight / ((studentHeight*0.01)*(studentHeight*0.01));
		
		System.out.println(bmi);
		
		if(bmi <= 18.5) {
			System.out.println("저체중");
		} else if(bmi <= 25) {
			System.out.println("정상");
		} else if(bmi <= 30) {
			System.out.println("과체중");
		} else if(bmi <= 40) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
		
		
	}

}
