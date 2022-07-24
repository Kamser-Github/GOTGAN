package test01;

import kr.co.abstract01.*;
public class RealCarTest01 {
	
	public static void main(String[] args) {
		
		Car[] cars = {
				new Sonata("소나타",Coverable.RED,Coverable.MANUAL),
				new Avante("소나타",Coverable.BLACK,Coverable.AUTO),
				new Grandeur("소나타",Coverable.WHITE,Coverable.MANUAL),
				new Genesis("소나타",Coverable.BLACK,Coverable.AUTO)
		};
		for(Car a : cars) {
			a.drive();
			a.changeCover();
		}
	}
}
