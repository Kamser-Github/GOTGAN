package day0716;

public class Button01 {
	
	int size;
	String color;
	String shape;
	String way;
	String letter;
	
	Button01(){
		this(2, "white", "square", "touch");
	}
	
	Button01(int size,String color,String shape,String way,String letter){
		this.size = size;
		this.color = color;
		this.shape = shape;
		this.way = way;
		this.letter = letter;
	}
	
	Button01(int size,String color,String shape,String way){
		this.size = size;
		this.color = color;
		this.shape = shape;
		this.way = way;
	}
	
	void pressBrieflyButton() {} //ª�� ������.
	void pressHold() {} //��� ������
	void pressTwice() {} //�ι� ������.
	void pressThreeTimes() {} //���� ������.
	
}
