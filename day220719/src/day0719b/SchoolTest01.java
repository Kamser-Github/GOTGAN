package day0719b;
//임포트 직접하기
import day0719a.Student01;


public class SchoolTest01 {
	
	public static void main(String[] args) {
		Student01 lee = new Student01("이순신");
		lee.addScore("영어", 95);
		lee.addScore("수학", 88);
		lee.addScore("미술", 99);
		lee.addScore("국어", 65);
		
		//학생 정보 점수계산하기
		lee.addTotal();	
		//학생 총점 평균 구하기.
		lee.addAvg();
		
		//학생이 듣는 수업과 점수 출력해보기
		lee.showStudentSubject();
		
		//학생 정보 출력해보기
		lee.printStudentInfo();
	}
}
