package day1;

public class BookTest {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Į�ǳ뷡","�̼���",12500);
		Book book3 = new Book("����ó��������","������ī����",0);
		Book book4 = new Book("�̰��� �ڹٴ�","�ſ��",27500);
		Book book5 = new Book("�� ������Ʈ","����",0);
		book1.getBookInfo();
		book2.getBookInfo();
		book3.getBookInfo();
		book4.getBookInfo();
		book5.getBookInfo();
	}
}
