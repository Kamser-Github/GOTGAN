package day1.oop01;

public class Book {
	
	String title,author;
	int price;
	
	Book(){
		this("자바의 정석","남궁석",26500);
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
