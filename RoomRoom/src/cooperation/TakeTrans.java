package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 5000);
		Student tomas1 = new Student("Tomas1", 5000);
		Student tomas2 = new Student("Tomas2", 5000);
		Student tomas3= new Student("Tomas3", 5000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		Subway subwayGreen = new Subway(2);
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		tomas1.takeSubway(subwayGreen);
		tomas1.showInfo();
		subwayGreen.showInfo();
		
		tomas2.takeSubway(subwayGreen);
		tomas2.showInfo();
		subwayGreen.showInfo();
		
		tomas3.takeSubway(subwayGreen);
		tomas3.showInfo();
		subwayGreen.showInfo();
	}
	
}
