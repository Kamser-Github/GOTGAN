package follow.threed;
import java.util.ArrayList;
public class WaitEx01 {
	
	public static void main(String[] args) throws Exception {
		
		TableEx1 table = new TableEx1();
		
		new Thread(new CookEx1(table),"COOK1").start();
		new Thread(new CustomerEx1(table,"donut")).start();
		new Thread(new CustomerEx1(table,"buger")).start();
		
		Thread.sleep(100);
		System.exit(0);
	}
	
}

//공유 객체
class TableEx1 {
	//요리명
	String[] dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public void add(String dish) {
		//테이블에 놓을수 있는 숫자보다 많으면
		if(dishes.size() >= MAX_FOOD)
			return;
		dishes.add(dish);
		System.out.println("Dishes :"+dishes.toString());
	}
	
	public boolean remove(String dishName) {
		//지정된 요리와 일치하는 건 제거
		final int FOOD = dishes.size();
		for(int i=0 ; i<FOOD; i++) {
			//배열에서 하나씩 비교해서 겹치는게 있으면 제거하고 true 반환
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}
		}
		return false; // 없으면
	}
	
	public int dishNum() { return dishNames.length; }
}
//요리사
class CookEx1 implements Runnable{
	private TableEx1 table;
	
	public CookEx1(TableEx1 table){ this.table = table; }
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(1);} catch (InterruptedException e) {}
		}
	}
}
//손님
class CustomerEx1 implements Runnable {
	private TableEx1 table;
	private String food;
	
	public CustomerEx1(TableEx1 table,String food) {
		this.table = table;
		this.food= food;
	}
	@Override
	public void run() {
		while(true) {
			try {Thread.sleep(10);}catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			if(eatFood()) {
				System.out.println(name+"ate a"+food);
			}
			else {
				System.out.println(name+"을 먹지못했습니다");
			}
		}
	}
	
	boolean eatFood() { return table.remove(food);}
}