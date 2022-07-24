package kr.co.interface5;

public interface Orderable {
	
	void addMenu(String name,int price);
	void printOrder();
	void totalPrice();
	int getWaitingOrder();
}
