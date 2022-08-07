package kr.co.jenetics;

//Enum 열거형 배열 멤버 추가하기
enum Direction2 {
	
	EAST(1,">"), SOUTH(2,"V"),WEST(3,"<"),NORTH(4,"^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	//열거형 전체를 배열로 반환하는 매소드 .values();
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
	}
	public int getValue() {return value;}
	public String getSymbol() {return symbol;}
	
	public static Direction2 of(int dir) {
		if (dir<1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value : "+dir);
		}
		return DIR_ARR[dir-1 ];
	}
	
	//Direction2가 방향을 나타내기때문에 방향 회전하는 매소드이다.
	public Direction2 rotate(int num) {
		num = num % 4;
		//4보다 클경우 나누어서 나머지만 계산하면된다.
		if(num<0) num+=4;
		//0보다 작다면 반대편으로 간다.
		return DIR_ARR[(value-1+num)%4];
		//value는 객체의 value이기때문에 this는 생략이 가능하다.
	}
	
	public String toString() {
		return name()+getSymbol();
	}
}

public class EnumEx02 {
	
	public static void main(String[] args) {
		for(Direction2 d : Direction2.values()) {
			System.out.printf("%s=%d%n",d.name(),d.getValue());
		}
		
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);
		
		System.out.printf("%d1=%s, %d%n",d1.name(),d1.getValue(),d1.getSymbol());
		System.out.printf("%d2=%s, %d%n",d2.name(),d2.getValue(),d2.getSymbol());
		
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.valueOf("EAST").rotate(1));
		System.out.println(Direction2.of(1).rotate(1));
		System.out.println(Enum.valueOf(Direction2.class, "EAST").rotate(1));
		//위 4개가 다 같은 표현이다.
		
	}
	
}
