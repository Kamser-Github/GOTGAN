package day1.oop01;

public class BookTest {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Į�� �뷡", "�̼���", 17800);
		Book book3 = new Book("Į�� �뷡1", "�̼���", 17800);
		Book book4 = new Book("Į�� �뷡2", "�̼���", 17800);
		Book book5 = new Book("Į�� �뷡3", "�̼���", 17800);
		
		System.out.println(book1.getBookInfo());
		System.out.println(book2.getBookInfo());
		System.out.println(book3.getBookInfo());
		System.out.println(book4.getBookInfo());
		System.out.println(book5.getBookInfo());
		
		//�����ڷ� �ʱ�ȭ �ϴ°� �����ϴٴ� �ɴ�����.
		//�����ڰ� ������ ���� �Ұ�쿡
		//�� ������ ������ �������� �ϳ��ϳ� ����Ʈ�ż��带 ����Ѵ�.
		//�̰� ���� 1�ﰳ�̻��̿��ٸ� ���������� ���Ѵ�.
	}
}
