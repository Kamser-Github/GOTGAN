package day1.oop01;

public class SalaryExam {
	
	public static void main(String[] args) {
		
		int month=(int)(Math.random()*12)+1;
		int grade=(int)(Math.random()*4)+1;
		SalaryExpr men;
		if(month%2==0) {
			men = new SalaryExpr(100);
		}else
			men = new SalaryExpr();
		int money = men.getSalary(grade);
		System.out.printf("%d월 %d등급의 월급은 %d원입니다",month,grade,money);
	}
}
