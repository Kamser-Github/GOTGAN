package kr.co.interface3;

public class JavaOfJungsuk7_11 {
	
	public static void action(Robot robot) {
		if(robot instanceof DanceRobot) 
			((DanceRobot) robot).dance();
		else if(robot instanceof SingRobot)
			((SingRobot)robot).sing();
		else if(robot instanceof DrawRobot)
			((DrawRobot)robot).draw();
		
	}
	public static void main(String[] args) {
		Robot[] arr = { 
				new DanceRobot(), 
				new SingRobot(), 
				new DrawRobot() 
				};
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main }
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("����   ��ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡��   �մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸���   �׸��ϴ�.");
	}
}