package day1;

public class Book {
	
	String title;
	String author;
	int price;
	
	Book(){
		this("�ڹ�������","���ü�",28000);
	}
	Book(String title,String author,int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void getBookInfo() {
		System.out.print("\n���� : "+title+"�۰� : "+author+"���� : "+price);
	}
}
