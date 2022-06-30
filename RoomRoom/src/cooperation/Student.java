package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String name,int money) {
		this.studentName = name;
		this.money = money;
	}
	//객체 협업
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
		
	}
	public void takeSubway(Subway Subway) {
		Subway.take(1500);
		money -= 1500;
		
	}
	
	public void showInfo() {
		System.out.println(studentName + "남은 돈은" + money);
	}
	
}
