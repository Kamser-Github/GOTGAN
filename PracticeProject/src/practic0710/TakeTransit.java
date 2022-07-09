package practic0710;

public class TakeTransit{

	public static void main(String[] args) {
		
		GoStudent lee = new GoStudent("lee",3500);
		
		TakeBus bus1311 = new TakeBus(1311);
		TakeSubway sub2line = new TakeSubway(2);
		lee.takeBus(bus1311);
		lee.takeSub(sub2line);
		lee.showInfo();
		
	}
}