package day2.emp;

public class Sales extends Employee implements Bonus{

	public Sales() {}
	public Sales(String name,int number,String department,int salary) {
		super(name, number, department, salary);
	}
	@Override
	public double tax() {
		return getSalary()*0.13;
	}
	@Override
	public void incentive(int pay) {
		setSalary((int)(getSalary()+pay*1.2));
	}
	public double getExtraPay() {
		return getSalary()*0.03;
	}
}