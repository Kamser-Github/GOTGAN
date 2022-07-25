package day1;

public class SalaryExpr {
	
	private int bonus;
	public SalaryExpr() {
		this(0);
	}
	public SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	public int getSalary(int grade) {
		switch(grade) {
		case 1:
			bonus+=100;
			return bonus;
		case 2:
			bonus+=90;
			return bonus;
		case 3:
			bonus+=80;
			return bonus;
		case 4:
			bonus+=70;
			return bonus;
		default:
			return 0;
		}
	}
}
