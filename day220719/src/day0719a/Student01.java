package day0719a;

//import 타이핑으로 작성
import java.util.ArrayList;
import day0719b.Subject01;
/*
	오늘 코딩 목표
	1. 상속
	2. super사용
	3. import 사용
	4. 포함 사용


*/
public class Student01 {
	//학생 번호
	private static int count;
	//학생 정보
	private String name;
	private int id;
	private int totalScore;
	private double avg;
	
	//과목배열추가해보기
	ArrayList<Subject01> studentSubject;
	
	//생성자 만들기
	public Student01() {
		this("홍길동");
	} // 오류방지 디폴트 생성자
	public Student01(String name) {
		this.name = name;
		id = ++count;
		//객체배열 초기화하기
		studentSubject = new ArrayList<Subject01>();
	}
	
	//getter
	public int getTotalScore() { return totalScore; }
	public double getAvg() { return avg; }
	public String getName() { return name+id; }
	
	//setter
	public void setTotal(int num) {totalScore = num;}
	public void setAvg(double num) {avg = num;}

	//학생이 듣는 수업의 과목과 성적 추가하기.
	public void addScore(String subject,int score) {
		//과목의 메소드를 사용하기위해 생성자 소환
		Subject01 sub = new Subject01(subject,score);
		studentSubject.add(sub);
	}
	
	//총점 구하는 매서드 만들기
	public void addTotal() {
		for(Subject01 a : studentSubject) {
			totalScore+=a.getScore();
		}
	}
	
	// 평균 구하는 매서드 만들기
	public void addAvg(){
		if(totalScore!=0) {
			avg = (double)totalScore/studentSubject.size();
		}
		else return;
	}
	
	//학생 전체정보 출력해보기
	public void printStudentInfo() {
		if(totalScore==0) return;
		System.out.printf("\n학생 이름 : %s\n"
						+ "학생 번호 : %4d\n"
						+ "학생 총점 : %4d\n"
						+ "학생 평균 : %4f\n"
				,name,id,totalScore,avg);
	}
	
	//학생이 듣는 수업과 성적 출력 출력하기
	public void showStudentSubject() {
		System.out.println("학생 이름 : "+name);
		System.out.println("학생 번호 : "+id);
		for(Subject01 a : studentSubject) {
			//toString은 생략가능.
			System.out.println(a);
		}
		
	}
}//class end
