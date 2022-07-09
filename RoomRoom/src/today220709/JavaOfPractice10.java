package today220709;
//클래스 변수 초기화와 인스턴스 변수 초기화 연습 4;

class Document{
	static int count = 0;
	String name;
	
	Document(){
		this("제목없음"+ ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서"+ this.name + "가 생성되었습니다.");
	}
}

public class JavaOfPractice10 {

	public static void main(String[] args) {

		Document d1 = new Document();
		Document d2 = new Document();
		Document d3 = new Document("자바");
		Document d4 = new Document();
	}
}
