package day0715;

import java.util.Scanner;

public class ArrayDoublePractice01 {

	public static void main(String[] args) {
		
		//내 생각대로 코딩해보기
		
		//로또번호 6자리 당첨해보기.
		
		//1.배열길이가 45인 int배열 만들기.
		int[] loto = new int[45];
		
		//2.배열에 차례대로 숫자 1부터 45까지 넣기
		for(int i=0 ; i<loto.length ; i++) {
			loto[i] = i+1;
		}
		
		//3.제대로 넣었는지 확인해보기
		int count = 0;
		for(int i=0 ; i<9 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.printf("%2d|",loto[count]);
				count++;
			}
			System.out.println();
		}
		
		//4.배열 순서를 랜덤으로 바꿔기.
		for(int i=0 ; i<loto.length ; i++) {
			int random = (int)(Math.random()*45);
			int tmp = loto[i];
			loto[i]	= loto[random];
			loto[random] = tmp;
		}
		
		//5.잘 섞였는지 확인해보기
		System.out.println("섞인후 로또번호");
		
		for(int i=0 ; i<6 ; i++) {
			System.out.printf("%2d|",loto[i]);
		}
		//잘 섞인다.
		//5.5 내가 쓴 로또번호를 넣을 배열을 만든다.
		int[] MyLoto = new int[6];
		
		
		//6.이제 내가 로또 번호 6개를 입력한다.
		Scanner sc = new Scanner(System.in);
		
		/*
		for(int i=0 ; i<6 ; i++) {
			System.out.printf("%d번째 로또번호를 입력하세요\n.",i+1);
			MyLoto[i] = sc.nextInt();
		}
		*/
		//위 방식으로 하니가 문제가 생각났다.
		//입력하는 사람이 1~45가 아니라 다른 숫자를 입력할 경우를 놓쳤다.
		/*
		while(true) {
			int i = 0;
			System.out.printf("%d번째 로또번호를 입력하세요\n.",i+1);
			if(sc.nextInt()>45||sc.nextInt()<1) {
				continue;
			}
			
		}
		*/
		//또 다른 문제.
		//사람이 똑같은 번호를 안뽑게 해야된다.
		//중복이 안되게 하는 매서드가 필요한거같다.
		//1.번호 뽑을때 1~45가 아니면 다시 뽑게하기.
		//2.번호를 뽑았을때 중복이 아니게 하기.
		//3.뽑은 번호와 내가 만든 로또 번호 비교하기.
		
		//하나씩 해보자.
		int lotoNum = 0;
		int countNum = 0;
		
		while(countNum<6) {
			System.out.printf("\n%d번째 로또번호를 입력하세요\n",countNum+1);
			lotoNum = sc.nextInt();
			lotoNumber(lotoNum,MyLoto);
			if(lotoNum>45||lotoNum<1)
				continue;
			MyLoto[countNum]=lotoNum;
			countNum++;
		}
		
		//2.중복일 경우 다시 되돌아가기.
		
//		for(int i=0 ; i<MyLoto.length ; i++) {
//			if(lotoNum==MyLoto[i]) {
//				lotoNum=46;
//			}
//		}
		sc.close();
	}//main of end
	public static int lotoNumber(int x,int[] y) {
		for(int i=0 ; i<y.length ; i++) {
			if(x==y[i]) {
				return x=46;
			}
		}
		return x;
	}
}//class of end
