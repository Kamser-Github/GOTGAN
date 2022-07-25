package day1;

public class Book {
	
	String title;
	String author;
	int price;
	
	Book(){
		this("자바의정석","남궁석",28000);
	}
	Book(String title,String author,int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void getBookInfo() {
		System.out.print("\n저자 : "+title+"작가 : "+author+"가격 : "+price);
	}
}
