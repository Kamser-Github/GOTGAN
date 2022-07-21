package kr.co.array01;

public class Student01 {
	
	private String name;
	//성적표 인스턴스를 포함
	public ReportCard01 report;
	
	//생성자 호출 및 포함관계 초기화
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
