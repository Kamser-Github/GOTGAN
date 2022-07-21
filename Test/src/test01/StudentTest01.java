package test01;

import kr.co.array01.Student01;
import kr.co.array01.*;

public class StudentTest01 {
	
	public static void main(String[] args) {
		Student01[] students = {
				new Student01("lee"),
				new Student01("kang"),
				new Student01("park"),
				new Student01("choi"),
				new Student01("hwang")
		};
		
		students[0].report.addSubjectScore("국어", 93);
		students[0].report.addSubjectScore("영어", 93);
		students[0].report.addSubjectScore("수학", 92);
		
		System.out.println(students[0].getAvg());
	}
}
