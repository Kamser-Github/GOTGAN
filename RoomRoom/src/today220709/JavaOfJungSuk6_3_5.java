package today220709;

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student1() {}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	public float getAverage() {
		float num =Math.round((float)getTotal()/3.0*10);
		return num/10;
	}
	
	public Student1 (String name,int ban,int no,int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return this.name +","+ this.ban +","+ this.no +","
				+ this.eng+"," + this.math+"," + getTotal()+"," + getAverage() ;
	}
}

public class JavaOfJungSuk6_3_5 {

	 //6-4 매서드를 추가하시오
	public static void main(String[] args) {
		 //6-3  해당 멤버 변수를 갖는 Student클래스를 만드시오
		Student1 s = new Student1();
		s.name = " ";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println(" :"+s.name); 
		System.out.println(" :"+s.getTotal()); 
		System.out.println(" :"+s.getAverage()); 
		
		Student1 q = new Student1("홍길동 ",1,1,100,60,76); 
		System.out.println(q.info());

	}
}
