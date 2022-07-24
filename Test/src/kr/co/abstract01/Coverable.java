package kr.co.abstract01;

public interface Coverable {
	
	public static final int RED = 0;
	public static final int WHITE = 1;
	public static final int BLUE = 2;
	public static final int BLACK = 3;
	
	public static final int AUTO = 0;
	public static final int MANUAL = 1;
	
	void checkGear();
	void changeCover();
	
}
