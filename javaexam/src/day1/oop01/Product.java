package day1.oop01;

public class Product {
	
	private String name;
	private int balance;
	private int price;
	
	Product(){
		this("µàÅ©ÀÎÇü",5,10000);
	}
	Product(String name,int balance,int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	String getName() {
		return name;
	}
	
	int getBalance(){
		return balance;
	}
	int getPrice() {
		return price;
	}
}
