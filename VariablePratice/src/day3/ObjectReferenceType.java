package day3;

public class ObjectReferenceType {
	
	public static void main(String[] args) {
		
		Data3 data3 = new Data3();
		data3.x=10;
		System.out.println("현재 data3.x의 값은"+data3.x);
		
		Data3 d3 = copy(data3);
		System.out.println("현재 d3.x의 값은"+d3.x);
		
		//여기서 배우고자 하는건 매서드 안에 있는
		//지역변수 lv는 사라지기때문에
		//참조형 변수로 선언해서 인스턴스 주소를 인자로받아서
		//값을 대입받은뒤에
		//d3에 그 주소를 저장했다.
		//d3는 new 생성자 없이 Data타입의 data3의 값을 가져왓다.
	}
	
	static Data3 copy(Data3 data3) {
		Data3 tmp = new Data3();
		tmp.x=data3.x;
		return tmp;
	}
}
class Data3{
	int x;
}