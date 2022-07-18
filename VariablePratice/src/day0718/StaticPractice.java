package day0718;

import java.util.ArrayList;

public class StaticPractice {
	public static void main(String[] args) {
		
	}
}

class School01{
	private String name;
	private String location;
	private int totalOfStudent;
	
}

class Student01{
	
	private static int count;
	private String studentName;
	private int studentId;
	private char gender;
	private int totalScore;
	private double avg;
	ArrayList<Subject01> subject01;
	
	//������ �����
	public Student01(String name,char gender) {
		count++;
		studentId = count;
		studentName = name;
		this.gender = gender;
		subject01 = new ArrayList<Subject01>();
	}
	
	//�޼��� �����
	
	//getter
	public String getName() {return studentName;}
	public int getStudentId() {return studentId;}
	public char getGender() {return gender;}
	
	//setter
	public void setName(String name) {studentName = name;}
	
	//�л� ���� �ֱ�
	public void addSubject(String subject,int score) {
		Subject01 sub = new Subject01(subject,score);
		subject01.add(sub);
	}
	
	//�л��� ����/����ִ� ����
	public void showStudentSubjectInfo() {
		String subjects = " ";
		for(Subject01 a : subject01) {
			subjects += a.getSubject();
		}
		System.out.printf("�л� �̸� : %s\n�л� ��ȣ : %d\n�л� ���� : %c\n��� ����: %s"
				,studentName,studentId,gender,subjects);
	}
	//�л��� ����
	//�л��� ������ ������ ������ �ʿ��ϴ�.
	public void showStudentScore() {
		for(Subject01 a : subject01) {
			System.out.print(a.getSubject()+"���� : "+a.getScore());
			totalScore += a.getScore();
		}
		avg = (double)totalScore/subject01.size();
		System.out.printf(" *%s �л�*\n���� : %d\n��� : %f",studentName,totalScore,avg);
	}
	
	
}

class Subject01{
	private int score;
	private String subject;
	private int rank;
	
	public Subject01(String subject,int score) {
		this.score = score;
		this.subject = subject;
	}
	
	public void setScore(int score) {this.score = score;}
	public void setSubject(String subject) {this.subject = subject;}
	public void setRank(int rank) {this.rank=rank;}
	
	public int getScore() {return score;}
	public String getSubject() {return subject;}
	public int getRank() {return rank;}
}