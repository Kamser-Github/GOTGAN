package day1;

public class SalaryExam {

	public static void main(String[] args) {
		
		int month = (int)(Math.random()*12)+1;
		int grade = (int)(Math.random()*4)+1;
		SalaryExpr sal;
		switch(month%2) {
		case 0:
			sal = new SalaryExpr(100);
			break;
		default :
			sal = new SalaryExpr(0);
		}
		int money = sal.getSalary(grade);
		System.out.printf("%d월 %d등급의 월급은 %d입니다.",month,grade,money);
	}

}
