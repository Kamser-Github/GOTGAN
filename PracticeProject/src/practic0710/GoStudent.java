package practic0710;

public class GoStudent {
	
	public String goStudentName;
	public int goStudenGrade;
	public int money;
	
	public GoStudent(String name,int money) {
		this.goStudentName = name;
		this.money = money;
		
	}
	
	public void takeBus(TakeBus bus) {
		bus.take(1000);
		this.money -= 1000;
		
	}
	
	public void takeSub(TakeSubway way) {
		way.take(1500);
		this.money -= 1500;

	}
	
	public void showInfo() {
		System.out.println(goStudentName + "님의 남은 돈은" + money + " 입니다 .");
	}
	public static void main(String[] args) {

	}

}