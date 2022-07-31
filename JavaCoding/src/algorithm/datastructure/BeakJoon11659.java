package algorithm.datastructure;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BeakJoon11659 {
	
	public static void main(String[] args) throws IOException{
		
		//구간의 합을 구하시오
		
		//첫번째 숫자 n1 n2 (n1은 배열의길이 , n2는 연산 횟수)
		//두번째는 숫자 배열 
		//세번재는 구간 입력
		/*슈도코드 작성하기
		int형 lengthNumber에 배열의 길이 받기
		int형 timesNumber에 연산횟수 받기
		String형 integerArray에 숫자배열
		integerArray를 toArray
		for(조건식 i는 n2보다 작다){
		Int형 numI에 작은숫자
		Int형 numJ에 큰숫자 받기
		이게 아니네
		suNo(숫자개수),quizNo(질의 개수) 저장
		for(숫자의 개수만큼 반복){
		합 배열 생성하기(S[i]=S[i-1]+A[i])
		}
		for(질의 개수만큼 반복하기){
		질의 범위 받기(i~j)
		구간합 출력하기(S[j]-S[i-1])
		}
		*/
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = 
				new StringTokenizer(br.readLine());
		//StringTokenizer 받은 문자를 묶음별로 쪼갠다.
		//nextToken은 하나씩 그걸 반환한다.
		int suNo = Integer.parseInt(stz.nextToken());
		int quizNo = Integer.parseInt(stz.nextToken());
		long[] S = new long[suNo+1];
		
		stz = new StringTokenizer(br.readLine());
		for(int i=1; i<=suNo ;i++) {
			S[i]=S[i-1]+Integer.parseInt(stz.nextToken());
		}
		for(int q=0 ; q< quizNo; q++) {
			stz = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(stz.nextToken());
			int j = Integer.parseInt(stz.nextToken());
			System.out.println(S[j]-S[i-1]);
		}
		
	}
}
