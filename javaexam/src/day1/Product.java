package day1;

import java.text.DecimalFormat;

public class Product {
	
	DecimalFormat df = new DecimalFormat("###,###");
	private String name;
	private int balance;
	private int price;
	
	public Product() {
		this("µàÅ©ÀÎÇü",5,10000);
	}
	public Product(String name,int balance,int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int  getBalance() {
		return balance;
	}
	public int  getPrice() {
		return price;
	}
	
	public String toString() {
		return "("+name+" "+balance+" "+df.format(price)+"¿ø)";
	}
	
}
