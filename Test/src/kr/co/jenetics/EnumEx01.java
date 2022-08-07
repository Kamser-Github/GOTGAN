package kr.co.jenetics;

enum Direction { EAST, SOUTH , WEST , NORTH }


public class EnumEx01 {
	
	public static void main(String[] args) {
		
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		Direction d4 = Direction.WEST;
		Direction d5 = Direction.valueOf("WEST");
		Direction d6 = Enum.valueOf(Direction.class,"WEST");
		
		Direction d7 = Direction.SOUTH;
		Direction d8 = Direction.valueOf("SOUTH");
		Direction d9 = Enum.valueOf(Direction.class,"SOUTH");
		
		Direction d10 = Direction.NORTH;
		Direction d11 = Direction.valueOf("NORTH");
		Direction d12 = Enum.valueOf(Direction.class, "NORTH");
		
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);
		
		System.out.println("d1==d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		System.out.println("d1.equals(d3) ?"+d1.equals(d3));
		//System.out.println("d2>d3 ?" +(d1>d3)); 열거형은 비교가 안된다. 객체이니까
		System.out.println("d1.compareTo(d3) ? "+(d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+(d1.compareTo(d2)));
		
		//비교 연산자로 True False는 안된다.
		//똑같다 , 아니면 compareTo로 크면 + , 같으면 0 , 작으면 - 로 구분한다.
		//전체 객체를 배열로 꺼내고 싶을때는
		//객체 이름 Direction[] arr = Direction.values();
		//d1.name()은 String형태로 상수명이 반환되고
		//d1.ordinal()은 객체가 저장된 순서가 반환된다.
		//이때 순서가 반환된거지 value같은 값이 반환된건 아니다!
		
		
		switch(d1) {
		case EAST :
			System.out.println("The direction is EAST.");
			break;
		case SOUTH :
			System.out.println("The direction is SOUTH."); 
			break;
		case WEST:
			System.out.println("The direction is WEST."); 
			break;
		case NORTH:
			System.out.println("The direction is NORTH."); 
			break;
		default :
			System.out.println("Invalid direction.");
		//enum형으로 switch를 만들때는 객체가 다 포함되어야한다.
		//안그러면 겅고가 뜬다.
		}
		
		Direction[] dArr = Direction.values();
		for(Direction d : dArr) {
			System.out.printf("%s=%d%n",d.name(),d.ordinal());
			//여기서 ordinal() 은 값이 아니라 저장된 순서를 나타낸다.
			
			
		}
	}
}
