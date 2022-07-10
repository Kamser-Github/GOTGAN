package practic0710;

public class VariablePractice {
	
	public static void main(String[] args) {
		//printf 익숙해지기
//		int age = 14;
//		System.out.printf("%o",age);
		
		int finger = 10;
		System.out.printf("finger = [%10d]%n",finger); //[        10]
		System.out.printf("finger = [%3d]%n",finger); //[ 10]
		System.out.printf("finger = [%-3d]%n",finger);//[10 ]
		System.out.printf("finger = [%-10d]%n",finger);//[10          ]
		System.out.printf("finger = [%03d]%n",finger);//[010]
		System.out.printf("finger = [%010d]%n",finger);//[0000000010]
		System.out.printf("finger = [%010x]%n",finger);//[000000000a]
		//[ ] 모양에 %에 안붙으면 띄어쓰기,-은 리버스,0은 0으로 채운다.
		
		String url = "www.naver.com/weather";
		System.out.printf("[%.8s]%n",url);//[www.nave] .을 붙이면 해당숫자까지만 나온다.
		

		
		
	}
}
