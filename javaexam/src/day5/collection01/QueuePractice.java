package day5.collection01;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueuePractice {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하시면 도움말을 볼수있습니다.");
		
		while(true) {
			System.out.print(">>");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				
				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근 입력한 명령어"
								+MAX_SIZE+"개 보여줍니다.");
				}
				else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					//입력 받은 명령어 저장
					save(input);
					//LinkedList의 내용을 보내준다.
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
					
				}
				else {
					save(input);
					System.out.println(input);
				}
			} catch (Exception e) {
				System.out.println("오류 입니다.");
			}
		}
		
	}
	public static void save(String input) {
		//queue에 저장
		if(!"".equals(input)) {
			q.offer(input);
		}
		if(q.size() > MAX_SIZE) {
			q.remove();
		}
	}
	
}
