package day0717;

import java.util.ArrayList;

public class ObjectPractice10 {

	public static void main(String[] args) {
		BuyCart kang = new BuyCart(190);
		kang.addBook(new CleanCode());
		kang.addBook(new DeepDive());
		kang.addBook(new JavaOfSimple());
		
		kang.BookSummary();
	}
}

class Book{
	int price;
	int disCount;
	Book(int price)	{
		this.price = price;
		this.disCount = (int)(price*0.85);
	}
}

class CleanCode extends Book{
	public CleanCode() {
		super(150);
	}
	public String toString() {
		return "java";
	}
}

class JavaOfSimple extends Book{
	public JavaOfSimple() {
		super(100);
	}
	public String toString() {
		return "java";
	}
}

class DeepDive extends Book{

	DeepDive() {
		super(80);
	}
	public String toString() {
		return "javascript";
	}
}

class BuyCart{
	int money;
	ArrayList<Book> aladin;
	String bookName = " ";
	BuyCart(int money){
		this.money=money;
		aladin = new ArrayList<Book>();
	}
	
	public void addBook(Book book) {
		if(money<book.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}else {
			money-=book.disCount;
			aladin.add(book);
			System.out.println(book+"를 결제했습니다.");
		}
	}
	
	public void countBook(Book book) {
		if(aladin.remove(book)) {
			money += book.disCount;
			System.out.println(book+"를 취소했습니다.");
		}else {
			System.out.println("결제하신 내역이 없습니다.");
		}
	}
	
	public void BookSummary() {
		int total = 0;
		for(int i=0 ; i<aladin.size() ; i++) {
			Book book = (Book)aladin.get(i);
			total += book.disCount;
			bookName += book.toString();
		}
		System.out.println("총 구매하신 금액은"+total+"입니다");
		System.out.println("구매한 서적의 종류는"+bookName+"입니다.");
	}
}