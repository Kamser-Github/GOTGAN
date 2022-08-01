package kr.co.collection;
import java.util.Stack;
public class StackEx01 {
	
	public static Stack back	= new Stack();
	public static Stack forward= new Stack();
	
	public static void main(String[] args) {
		
		goURL("1.네이트");
		goURL("2.네이버");
		goURL("3.다음");
		goURL("4.피망");
		
		printStatus();
		
		goback();
		System.out.println("= '뒤로'버튼을 누른후 =");
		printStatus();
		
		goback();
		System.out.println("= '뒤로'버튼을 누른후 =");
		printStatus();
		
		goForward();
		System.out.println("= '앞으로'버튼을 누른후 =");
		printStatus();
		
		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 =");
		printStatus();
	}
	
	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면은 "+back.peek()+"입니다.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())//forward가 비어있지 않으면
			forward.clear();//forward를 다 지운다.
	}
	
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	public static void goback() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	}
	
}
