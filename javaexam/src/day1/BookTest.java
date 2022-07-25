package day1;

public class BookTest {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("칼의노래","이순신",12500);
		Book book3 = new Book("정보처리산업기사","이젠아카데미",0);
		Book book4 = new Book("이것이 자바다","신용권",27500);
		Book book5 = new Book("웹 프로젝트","이젠",0);
		book1.getBookInfo();
		book2.getBookInfo();
		book3.getBookInfo();
		book4.getBookInfo();
		book5.getBookInfo();
	}
}
