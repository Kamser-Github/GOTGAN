package day2;

import java.util.Scanner;

public class Jungol813 {

	public static void main(String[] args) {
		/*
		1번은 개, 
		2번은 고양이, 
		3번은 병아리로 정하고, 
		"Number? "라는 문장으로 물어본 후에 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오. 
		해당 번호가 없으면 "I don't know."라고 출력한다.​ */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("number?");
		int choice = sc.nextInt();
		String animal;
		
		switch(choice) {
		case 1 :
			animal = "개";
			break;
		case 2 : 
			animal ="고양이";
			break;
		case 3 :
			animal = "병아리";
			break;
		default :
			animal = "I don't know";
		}
		
		System.out.println(animal);
		
		sc.close();
	}
}
