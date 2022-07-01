package array_7_1;

public class School {
	
	public static void main(String[] args) {
		
		Student[] grade1 = new Student[4];
		grade1[0] = new Student("kang", 15,175);
		grade1[1] = new Student("kang1", 14,175);
		grade1[2] = new Student("kang2", 16,175);
		grade1[3] = new Student("kang3", 18,175);
		
//		Student[] grade2 = new Student[3];
//		
//		for(Student y : grade1) {
//			y.showInfo();
//		}
//		System.out.println("------");
//		System.arraycopy(grade1, 0, grade2, 0, 3);
//		
//		for(Student y : grade2) {
//			y.showInfo();
//		}
		
		//배열 4 + 배열 3 = 배열 7 만들어보자
		
		Student[] grade2 = new Student[3];
		grade2[0] = new Student("moon", 15,175);
		grade2[1] = new Student("moon", 14,175);
		grade2[2] = new Student("moon", 16,175);
		
		Student[] schoolStudent = new Student[7];
		
		System.arraycopy(grade1, 0, schoolStudent, 0, 4);
		System.arraycopy(grade2, 0, schoolStudent, 4, 3);
		
		//반복문으로 한개로 만들어보자
		
		grade1[1].showInfo();
		
		
		
		
	}
}
