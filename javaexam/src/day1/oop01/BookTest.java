package day1.oop01;

public class BookTest {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("칼의 노래", "이순신", 17800);
		Book book3 = new Book("칼의 노래1", "이순신", 17800);
		Book book4 = new Book("칼의 노래2", "이순신", 17800);
		Book book5 = new Book("칼의 노래3", "이순신", 17800);
		
		System.out.println(book1.getBookInfo());
		System.out.println(book2.getBookInfo());
		System.out.println(book3.getBookInfo());
		System.out.println(book4.getBookInfo());
		System.out.println(book5.getBookInfo());
		
		//생성자로 초기화 하는게 간편하다는 걸느꼇고.
		//생성자가 여러번 생성 할경우에
		//그 생성자 정보를 얻으려면 하나하나 프린트매서드를 써야한다.
		//이게 만약 1억개이상이였다면 죽을때까지 못한다.
	}
}
