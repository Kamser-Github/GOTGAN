package follow.threed;

public class ThreadEx09 {

	public static void main(String[] args) throws Exception {
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		// ThreadGroup(ThreadGroup parent, String name){
		 ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");
		 
		 grp1.setMaxPriority(3);
		 /*Thread 그룹 grp1의 최우선순위를 3으로변경
		  */
		 Runnable r = new Runnable() {
			 public void run() {
				 try {
					 Thread.sleep(1000);
				 } catch(InterruptedException e) { }
			 }
			 
		 };
		 
		 Thread th1 = new Thread(grp1,		r,"th1");
		 Thread th2 = new Thread(subGrp1,	r,"th2");
		 Thread th3 = new Thread(grp2,		r,"th3");
		 th1.start();
		 th2.start();
		 th3.start();
		 
		 System.out.println(">>Listof ThreadGroup : "+ main.getName()
				 			+",Active ThreadGroup : "+ main.activeGroupCount()
				 			+",Active Thread : + " +main.activeCount());
		 
		 main.list();
		 
		
	}
}
