package day1.oop01;

public class SalaryExpr {
	
	private int bonus;
	SalaryExpr(){}
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
	public int getSalary(int grade) {
		switch(grade) {
		case 1:
			return bonus+=100;
		case 2:
			return bonus+=90;
		case 3:
			return bonus+=80;
		default:
			return bonus+=70;
		}
	}
}
