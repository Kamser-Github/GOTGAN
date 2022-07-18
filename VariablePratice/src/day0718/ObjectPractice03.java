package day0718;

public class ObjectPractice03 {
	
	public static void main(String[] args) {
		
		Elevator[] arr = new Elevator[5];
		Elevator lee1 = new Elevator(5,"약국");
		Elevator lee2 = new Elevator(15,"병원");
		Elevator lee3 = new Elevator(32,"학원");
		Elevator lee4 = new Elevator(22,"커피샵");
		Elevator lee5 = new Elevator(19,"미용실");

		arr[0] = lee1;
		arr[1] = lee2;
		arr[2] = lee3;
		arr[3] = lee4;
		arr[4] = lee5;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i ; j++) {
				if(arr[j].floor<arr[j+1].floor) {
					Elevator tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		for(Elevator a : arr) {
			System.out.println(a.name);
		}
			
		
		
		
	}
}

class Elevator{
	int floor;
	String name;
	
	Elevator(int floor,String name){
		this.floor = floor;
		this.name = name;
		
	}
	
}