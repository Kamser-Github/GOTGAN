package test01;

import kr.co.abstract01.*;
public class RealCarTest01 {
	
	public static void main(String[] args) {
		
		Car[] cars = {
				new Sonata("�ҳ�Ÿ",Coverable.RED,Coverable.MANUAL),
				new Avante("�ҳ�Ÿ",Coverable.BLACK,Coverable.AUTO),
				new Grandeur("�ҳ�Ÿ",Coverable.WHITE,Coverable.MANUAL),
				new Genesis("�ҳ�Ÿ",Coverable.BLACK,Coverable.AUTO)
		};
		for(Car a : cars) {
			a.drive();
			a.changeCover();
		}
	}
}
