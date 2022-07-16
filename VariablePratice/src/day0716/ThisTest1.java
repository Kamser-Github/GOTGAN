package day0716;

public class ThisTest1 {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.door);
		Car car2 = new Car(car);
		car2.showInfo();
	}

}

class Car{
	int door;
	String color;
	String gear;
	Navi navi = new Navi();
	
	Car(){
		this(4,"white","Auto");
	}
	
	Car(int door,String color,String gear){
		this.door = door;
		this.color = color;
		this.gear = gear;
	}
	
	Car(Car a){
		door = a.door;
		color = a.color;
		gear = a.gear;
	}
	
	public void showInfo() {
		
		System.out.println(door+color+gear);
	}
	
}

class Navi{
	
	String price = "40¸¸¿ø";
	
	
}