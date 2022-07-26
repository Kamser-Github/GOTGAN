package day2.emp;

public class Company {
	
	public static void main(String[] args) {
		
		Employee[] emp = {
				new Secretary("Duke", 1, "Secretary", 800),
				new Sales("Tuxi", 2, "Sales", 1200),
		};
		printEmployee(emp,false);
//		for(Employee a : emp) {
//			if(a instanceof Bonus) {
//				((Bonus) a).incentive(100);
//			}
//		}
//		System.out.println("[인센티브 100지급]");
		payBonus(emp,100);
		printEmployee(emp,true);
		
	}//main end
	
	public static void printEmployee(Employee[] emp,boolean isTax) {
		
		System.out.printf("%s\t%-15s%s","name","department","salary");
		if(isTax)
			System.out.printf("\t%s","tax");
		System.out.printf("\t%s\n","extra pay");
		
		System.out.println("----------------------------------------------");
		
		for(Employee a : emp) {
			System.out.printf("%s\t%-15s%d"
					,a.getName(),a.getDepartment(),a.getSalary());
			if(isTax)//세금 여부
				System.out.printf("\t%.1f",a.tax());
			if(a instanceof Sales) //추가 페이
				System.out.printf("\t%.1f",((Sales)a).getExtraPay());
			System.out.println();
		}//for end
		
		System.out.println();
	}//printEmployee end
	
	public static void payBonus(Employee[] emp,int incentive) {
		for(Employee a : emp) {
			if(a instanceof Bonus) {
				((Bonus) a).incentive(incentive);
			}
		}
		System.out.printf("[인센티브 %d지급]\n",incentive);
	}
}
