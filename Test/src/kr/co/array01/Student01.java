package kr.co.array01;

public class Student01 {
	
	private String name;
	//����ǥ �ν��Ͻ��� ����
	public ReportCard01 report;
	
	//������ ȣ�� �� ���԰��� �ʱ�ȭ
	public Student01(String name) {
		this.name = name;
		report = new ReportCard01();
	}
	public double getAvg() {
		report.calcSumScore();
		report.clacAverage();
		return report.getAverage();
	}
}
