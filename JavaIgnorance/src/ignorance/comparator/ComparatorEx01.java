package ignorance.comparator;
import java.util.Collections;
import java.util.Comparator;
//Comparator
/*
Comparator를 사용하려면 Array나 List Collections일때 가능
정렬기준을 Arrays.sort() , Collections.sort()에서 사용가능
1.숫자 오름차순
2.숫자 내림차순
3.문자열 정렬
4.다중배열 정렬
5.참조변수 정렬

//참조 : https://blue-boy.tistory.com/182#--%--Comparator
*/
class Person {
	
	private int no;
	private String name;
	private String hobby;
	
	public Person(int no,String name,String hobby) {
		setNo(no);
		setName(name);
		setHobby(hobby);
	}
	
	@Override
	public String toString() {
		return getNo()+" "+getName()+" "+getHobby();
	}
	
	//getter setter
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
/*
Comparator<클래스타입> 클래스명 = new Comparator<클래스타입>()
일반적으로 compare 메소드를 오버라이딩해서 사용한다.
비교대상 2개를 지역변수 o1,o2로 선언하고 return값으로 양,0,음수로 반환정렬한다.

*/
public class ComparatorEx01 {
	
	public static void main(String[] args) {
		
		Comparator<Person> comp = new Comparator<Person>() {
			@Override
			public int compare(Person o1,Person o2) {
				
				return 0;
			}
		};
		
		//Collections.sort(list,comp);
		//위와 같은 모양일 것이다.
		
		/*
		Collections.sort(list,new Comparator<Person>(){
			
			@Override
			public int compare(Person o1,Person o2) {
				//o1보다 o2가 넘버가 크면
				//no기준 오름차순 정렬
				if(o1.getNo()<o2.getNo()) {
					return -1;
				}
				else if(o1.getNo()>o2.getNo()) {
					return 1;
				}
				else {
					return 0;
				}
			}
			
		});
		매개변수가 참조변수이고 원하는 변수가 private이라면
		이렇게 getter를 통해서 비교를 하면된다
		return이 음수라면 오름차순 양수라면 내림차순이 된다.
		
		*/
		
		/*
		Arrays.sort(arr,new Comparator<Integer[]>(){
			@Override
			public int compare(Integer[] o1,Integer o2){
				return Integer.compare(o1[0] o2[0);
			}
		});
		각 배열의 맨처음을 비교해서 정렬을 하고자 한다면 위와 같이 된다.
		Integer.compare를 통해서 자연스럽게 비교를 해주기 때문에
		o1이 크면 오른쪽으로 , 작으면 왼쪽으로 보내준다.
		
		*/
		
		//문자열 비교 (Name을 기준으로 오름차순)
		/*
		Collections.sort(list,new Comparator<Person>() {
			@Override
			public int compare(Person o1,Person o2) {
				//왼쪽이 작은경우
				//ex)a 와 c일때 a-c는 마이너스이므로 왼쪽이 작다
				if(o1.getName().compareTo(o2.getName())<0) {
					return -1;
				}
				return 1;
			}
		});
		
		*/
		
		
		
		
	}//main end
	
}
