package follow.threed;
//쓰레드
/*동시에 작업을 여러개를 할수있고
 * 결국 공장은 하나이기 때문에 완료되는 시간은 더 늘어날수밖에없다
 * 그러나 싱글 쓰레드가 입력을 받을 경우
 * 그 빈시간동안 멀티쓰레드는 작업을 하기때문에
 * 작업시간이 감소되기는 하지만
 * 작업 우선순위를 잘못매기거나
 * 동기화 오류때문에 에러가 날수있어서 주의해야한다.
 */
public class ThreadEx01 {
	public static void main(String args[]) {
		
		ThreadExtendsVer exVer = new ThreadExtendsVer();
		ThreadImplementsVer imVer = new ThreadImplementsVer();
		//결국 Thread 클래스의 매소드중 start()로
		//또다른 쓰래드를 만들고 거기에 run()을 돌리는거기 때문에
		//Thread에게 빌려써야한다.
		//하지만 구현해서 쓰는게 좋은이유는
		//다중 상속이 자바에서는 불가능하기 때문에
		//확장성은 runnable을 구현하는 방식이 더 낫다.
		Thread threadImver = new Thread(imVer);
		//생성자중에서 runnable을 구현한 애가들어오는게 있다
		//ArrayList 생성자중에서도
		//ArrayList(Collection c) Collection을 구현한 애들이 올수있는데
		//TreeMap같이 정렬이 없는 컬렉션을
		//Set으로 형변환을 하고
		//다시 Set은 Collection을 구현했기때문에
		//List로 다시 형변환을 해서
		//Collections로 정렬이 가능하다.
		//복기 해보려고 작성해보았다.
		exVer.start();
		threadImver.start();
		
	}
}

class ThreadExtendsVer extends Thread{
	public void run() {
		for(int i=0 ; i<5 ; i++) {
			System.out.println(getName());
		}
	}
}
class ThreadImplementsVer implements Runnable{
	@Override
	public void run() {
		for(int i=0; i < 5; i++) {
		    System.out.println(Thread.currentThread().getName());
		    //Thread 이름은 private이기 때문에
		    //위와 같이 매서드로 꺼내야한다.
		}
	}
}