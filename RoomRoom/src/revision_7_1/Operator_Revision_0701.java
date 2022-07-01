package revision_7_1;

public class Operator_Revision_0701 {

	public static void main(String[] args) {
		
		//기본 연산자
		//주의할점
		//대입,복합 대입을 제외하고는 변수를 대입하지 않으면 값은 그대로다;
		
		//주의할것
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1); //151;;
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2); //150;
		
		//대입하기 전에 더 했고;
		
		int gameScore_ = 150;
		
		int lastScore_1 = gameScore_++;
		System.out.println(lastScore_1); //150 
		
		int lastScore_2 = gameScore--;
		System.out.println(lastScore_2); //150
		
		//대입하고 나서 더 했다;
		
		int value = 10;
		int num = value++;
		
		System.out.println(num); // 10
		
		int value_ = 10;
		int num_ = ++value_;
		
		System.out.println(num_); // 11
		
		//변수 본인 자체는 앞이나 뒤나 상관이 없음
		//허나 다른 변수에 대입하게 되면 달라진다;
		
		//주의할점
		
		int num4 = 8;
		int i = 3;
		
		boolean value__ =((num4 = num4 + 10)< 10 ) && ((i = i + 2) < 10);
		
		System.out.println(num4); //18
		System.out.println(i); //3
		
		int num4_ = 8;
		int i_ = 3;
		
		boolean value___ =((num4_ = num4_ + 10) > 10 ) || ((i_ = i_ + 2) < 10);
		
		System.out.println(num4); //18
		System.out.println(i); //3
		
		// &&연산자는 면접과 같다;
		// 서류에 떨어지면 뒤에 있는건 볼 필요도 없다. 최종면접까지 다 통과해야한다;
		// || 는 그 반대;
		
		// 재밋는 >><< 비트 연산자
		// <<는 2의 n 만큼 곱하면 된다
		// >>는 2의 n 으로 나눈 몫이 나온다. 쓸데가 있을까 싶긴하다;
		
		
		
	}

}
