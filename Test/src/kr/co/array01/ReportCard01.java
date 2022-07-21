package kr.co.array01;


//����ǥ
public class ReportCard01 {
	
	private double avg;
	private int totalScore;
	private int rank;
	private char grade;
	private int i = 0;
	
	public Subject01[] subjects;
	
	//������ �� ��ä�迭 �ʱ�ȭ
	public ReportCard01() {
		subjects = new Subject01[3];
	}
	
	//getter
	public double getAverage() {
		return avg;
	}
	
	//���� �ű��
	public static void giveRank(Student01[] s) {
		for(int i=0 ; i<s.length-1 ; i++) {
			boolean flag = false;
			for(int j=0 ; j<s.length-1-i ; j++) {
				if(s[j].getAvg()<s[j+1].getAvg()) {
					Student01 tmp = s[j];
					s[j] = s[j+1];
					s[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) return;
		}
	}
	
	//������ �����̸��� �߰�
	public void addSubjectScore(String name,int score) {
		subjects[i++]= new Subject01(name,score);
	}
	
	//���� ��������
	public void calcSumScore() {
		for(Subject01 a : subjects) {
			totalScore += a.getScore();
		}
	}
	
	//���� ��ճ���
	public void clacAverage() {
		if(totalScore==0)return;
		else {
			avg = (double)totalScore/3;
		}
	}
	
	//���� �ű��
	public void giveGrade() {
		switch((int)avg/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default :
			grade = 'D';
		}
	}
}
