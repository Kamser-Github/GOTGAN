package algorithm.datastructure;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BeakJoon11660 {
	
	public static void main(String[] args) throws IOException{
		
		/*슈도코드 작성하기
		N(배열의 크기) M(질문의 개수) 저장
		for(N만큼 반복){
			for(N만큼 반복){
				원래 배열 생성
			}
		}
		합배열 만들기
		for(N+1만큼 반복){
			for(N+1만큼 반복){
				D[i][j]=D[i-1][j]+D[i][j-1]+A[i][j]-D[i-1][j-1];
			}
		}
		
		for(M만큼 반복){
			숫자 4개 받기
			큰수 X2,Y2
			작은수 X1,Y1
			result = D[X2][Y2]-D[X1-1][Y2]-D[X2][Y1-1]+D[X1-1][Y1-1];
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(br.readLine());
		
		int arr2DSize = Integer.parseInt(stz.nextToken());
		int calcTimes = Integer.parseInt(stz.nextToken());
		
		int[][] baseArr = new int[arr2DSize+1][arr2DSize+1];
		
		for(int i=1; i<=arr2DSize ; i++) {
			stz = new StringTokenizer(br.readLine());
			for(int j=1; j<=arr2DSize ; j++) {
				baseArr[i][j]=Integer.parseInt(stz.nextToken());
			}
		} //baseArr end
		
		//누적 합배열 만들기
		int[][] sumArr = new int[arr2DSize+1][arr2DSize+1];
		for(int i=1 ; i<=arr2DSize ; i++) {
			for(int j=1 ; j<=arr2DSize ; j++) {
				sumArr[i][j]=sumArr[i-1][j]+sumArr[i][j-1]
								-sumArr[i-1][j-1]+baseArr[i][j];
			}
		}
		
		//계산하기
		for(int i=0 ; i<calcTimes ; i++) {
			stz = new StringTokenizer(br.readLine());
			int sX = Integer.parseInt(stz.nextToken());
			int sY = Integer.parseInt(stz.nextToken());
			int lX = Integer.parseInt(stz.nextToken());
			int lY = Integer.parseInt(stz.nextToken());
			
			int result = sumArr[lX][lY]-sumArr[sX-1][lY]-sumArr[lX][sY-1]+sumArr[sX-1][sY-1];
			System.out.println(result);
		}
	}
}
