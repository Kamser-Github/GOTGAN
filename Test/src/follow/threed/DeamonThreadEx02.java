package follow.threed;

import java.util.Map;
import java.util.Iterator;
public class DeamonThreadEx02 {
	
	public static void main(String[] args) throws Exception {
		ThreadNo1 t1 = new ThreadNo1("Thread1");
		ThreadNo2 t2 = new ThreadNo2("Thread2");
		t1.start();
		t2.start();
		
	}
}

class ThreadNo1 extends Thread {
	ThreadNo1(String name){
		super(name);
	}
	@Override
	public void run() {
		try {
			sleep(5*1000);//5초다.
		} catch (InterruptedException e){}
	}
}
class ThreadNo2 extends Thread {
	ThreadNo2(String name){
		super(name);
	}
	
	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x=0;
		while(it.hasNext()) {
			Object obj = it.next();
			Thread t =(Thread)obj;
			StackTraceElement[] ste = (StackTraceElement[])(map.get(obj));
			
			System.out.println("["+ ++x +"] name : "+ t.getName()
										+", group : "+ t.getThreadGroup()
										+", deamon : "+ t.isDaemon());
			for(int i=0; i< ste.length ; i++) {
				System.out.println(ste[i]);
			}
			System.out.println();
		}
	}			
}