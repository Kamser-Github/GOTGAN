package follow.threed;
import java.util.ArrayList;
//WaitEx에서 Wait 와 notify를 추가해서
//좀더 원활한 쓰레드를 구성해보는 예제
class CustomerEx2 implements Runnable{
	//공동 객체로 Table을 받는다.
	private TableEx2 table;
	private String food;
	
	CustomerEx2(TableEx2 table,String food){
		this.table = table;
		this.food = food;
	}
	@Override
	public void run() {
		while(true) {
			try { Thread.sleep(100);} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name+"ate a "+food);
		}
	}
	
	//손님 클래스는
	//테이블이라는 공용 객체를 받아서 
	//start()할경우 0.1초쉬고 이 클래스를 사용한 쓰레드의 이름을 받고
	//table에 있는 음식을 먹고 이름을 출력한다.
}

class CookEx2 implements Runnable{
	private TableEx2 table;
	
	CookEx2(TableEx2 table){ this.table=table; }
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			//테이블에 넣을수 있는 음식갯수만큼 종류를 추가해서 넣는다
			table.add(table.dishNames[idx]);
			try {Thread.sleep(10);} catch(InterruptedException e) {}
			
		}
	}
}

class TableEx2 {
	String[] dishNames = {"donut","donut","burger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name+"님이 기다리는중");
			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify(); //일시정지 상태애들 깨운다.
		System.out.println("지금 테이블 상태"+dishes.toString());
	}
	
	public void remove(String dishName) {
		
		synchronized(this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size()==0) {
				System.out.println(name+"님이 기다리는중");
				try {
					wait();
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}
			
			//idx가 0이라서 마냥 기다리지 말고 일시정지로 보내버리고
			while(true) {
				for(int i=0 ; i<dishes.size() ; i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();
						return;
					}
				}
				try {
					System.out.println(name+"님이 기다리는중");
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			//누가 여기에 접근해서 음식을 지우는순간 다시 작동한다.
		}
	}
	public int dishNum() { return dishNames.length; }
}

public class WaitEx02 {
	
	public static void main(String[] args) throws Exception {
		TableEx2 table = new TableEx2();
		
		new Thread(new CookEx2(table),"Cook1").start();
		new Thread(new CustomerEx2(table,"donut"),"CUST1").start();
		new Thread(new CustomerEx2(table,"burger"),"CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}
	
}
