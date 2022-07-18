package day0718;

public class ArrayTest03 {
	static int count = 0;
	
	public static void main(String[] args) {
		Student02 lee = new Student02(15,"lee");
		lee.addScore(80, "국어");
		lee.addScore(70, "영어");
		lee.addScore(85, "수학");
		lee.addScore(95, "체육");
		lee.addScore(45, "미술");
		for(int i=0 ; i<lee.arr.length-1 ; i++) {
			for(int j=0; j<lee.arr.length-1-i ; j++) {
				if(lee.arr[j+2]==null) break;
				if(lee.arr[j].score<lee.arr[j+1].score) {
					Subject02 tmp = lee.arr[j];
					lee.arr[j] = lee.arr[j+1];
					lee.arr[j+1] = tmp;
				}
			}
		}//for end
		
		//배열이 비어있으면 에러가 뜬다
		for(Subject02 a : lee.arr) {
			System.out.println(a.name+a.score);
		}
		
	}//main end
}//class end


class Student02{
	int id;
	String name;
	Subject02[] arr;
	int i = 0;
	
	Student02(int id,String name){
		this.id = id;
		this.name = name;
		arr = new Subject02[10];
	}
	//이 매서드를 쓸때마다 arr배열에 점수를 추가.
	void addScore(int score,String name) {
		Subject02 math = new Subject02(score,name);
		if(i>10) return;
		arr[i++]=math;
	}
}

class Subject02{
	
	int score;
	String name;
	
	Subject02(int score,String name){
		this.score = score;
		this.name = name;
	}
	
}