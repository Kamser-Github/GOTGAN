package day1.oop01;

public class Book {
	
	String title,author;
	int price;
	
	Book(){
		this("�ڹ��� ����","���ü�",26500);
	}
	Book(String title,String author,int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return title+" "+author+" "+price;
	}
}
