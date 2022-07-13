package day3;

public class HomeWork02 {
	
	public static void main(String[] args) {
		
		//구구단 가로로 하기
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d ",j,i);
			}
			System.out.println();
		}
	}
}
