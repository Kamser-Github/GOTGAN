package follow.threed;
import java.util.ArrayList;
public class ThreadEx16 {
	//wait() , notify()
	//Object 메서드로 , 자기 자신을 정지시키고
	//다른 쓰레드를 부르는 매서드다
	
	public static void main(String[] args) {
		
	}
	
}

class Customer implements Runnable{
	private Table table;
	private String food;
	
	Customer(Table table,String food){
		this.table = table;
		this.food = food;
	}
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(10); } catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood()) {
				System.out.println(name +" ate a "+food);
			}
			else {
				System.out.println(name + " failed to eat. :(");
			}
		}//while
	}
	
	boolean eatFood() { return table.remove(food); }
}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) { this.table = table; }
	
	@Override
	public void run() {
		while(true) {
			//임의의 요리를 선택해서 table에 추가한다.
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			
			try { Thread.sleep(1); } catch (InterruptedException e) {}
			
		} //while
	}
}
class Table {
	String[] dishNames = {"donut","donut","burger"}; //donut을 더 넣엇다.
	final int MAX_FOOD = 6;
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public void add(String dish) {
		//테이블에 음식이 가득있으면 ,추가하지 않는다.
		if(dishes.size() >= MAX_FOOD) {
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes : "+dishes.toString());
	}
	public boolean remove(String dishName) {
		//겹치는 요리는 제외한다.
		for(int i=0 ; i<dishes.size() ; i++) {
			if(dishName.equals(dishes.get(i))) {
				dishes.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public int dishNum() { return dishNames.length; }
}

