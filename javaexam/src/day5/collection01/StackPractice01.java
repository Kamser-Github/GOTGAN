package day5.collection01;
import java.util.Stack;

public class StackPractice01 {
	
	public static Stack<String>    back = new Stack<>();
	public static Stack<String> forward = new Stack<>();
	
	/*슈도코드 작성
	screenNow() 현재화면 버튼
	if(back.Empty가 비어있지 않으면)
	back.peek(),System.out.println("현재 화면");
	goBack() 뒤로가기 버튼
	back.pop()해서 forward.push()하기
	goForward() 앞으로 가기버튼
	forward.pop()해서 back.push()하기
	goURL(String str) 해당 URL로 이동
	back.push(str)하고 forward.isEmpty()해서 남은거 clear()
	showPast() 과거 어디 다녔는지 보여줌
	최근 5개.
	for(back.length만큼 반복)
	Search(Object obj)로 System.out.println으로 출력
	*/
	public static void screenNow() {
		//back에 검색내역이 있으면
		if(!back.empty()) {
			System.out.println(back.peek());
		}
	}
	
	public static void goBack() {
		//뒤로가기 버튼
		if(back.size()>2) {
			//back에서 하나 꺼내
			forward.push(back.pop());
			System.out.println(
					"  "+back.search(back.peek())+"."+back.peek());
		}//back stack이 2개 이상이 아니면 뒤로 갈수가 없다.
		else {
			System.out.println("뒤로 가실수 없습니다.");
		}
	}
	
	public static void goForward() {
		//뒤로 가기를 해서 앞으로 갈수있는지 확인
		if(!forward.isEmpty()) {
			back.push(forward.pop());
		}
	}
	
	public static void goURL(String url) {
		//새로운 url로 가면 앞으로가기를 초기화한다.
		if(!forward.isEmpty()) {
			forward.clear();
		}
		back.push(url);
	}
	
	public static void showPast() {
		//지나온 검색 결과 출력
		//최근검색한게 먼저 나와야한다.
		final int ORDER = back.size()-1;
		for(int i=ORDER ; i>=0 ; i--) {
			System.out.printf("%3d. %s\n"
					     ,back.search(back.get(i)),back.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		goURL("야후");
		goURL("네이버");
		goURL("넷마블");
		goURL("피망");
		goURL("정부24");
		
		showPast(); //good
		
		goBack();
		
		goURL("넥슨");
		
		
	}
}
