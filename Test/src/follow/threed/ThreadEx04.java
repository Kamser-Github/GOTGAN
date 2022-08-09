package follow.threed;

public class ThreadEx04 {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0 ; i<500 ; i++) {
			System.out.printf("%s",new String("-"));
		}
		System.out.print("소요시간 1 :"+(System.currentTimeMillis()- startTime));
		
		for(int i=0 ; i<500 ; i++) {
			System.out.printf("%s",new String("|"));
		}
		System.out.print("소요시간 2:"+(System.currentTimeMillis()- startTime));
	}
	
	//소요시간 2:33
}

