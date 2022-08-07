package algorithm.sort;

import algorithm.sort.InsertionSortExClass01;
import java.util.Comparator;

public class SortTest02 {
	
	private static final int MAX_COUNT = 30;
	
	public static void main(String[] args) {
		
		Integer[] arr = new Integer[MAX_COUNT];
		//조건문은 왠만하면 상수로 지정하는게 좋다고 배웠음.
		for(int i=0 ; i < MAX_COUNT ; i++) {
			arr[i]= (int)(Math.random()*MAX_COUNT);
		}
		
		System.out.println("정렬전 기본클래스 데이터");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Integer[] insertionCloneArray = arr.clone();
		System.out.println("정렬후 기본클래스 데이터");
		InsertionSortExClass01.sort(insertionCloneArray);
		
		for(int i : insertionCloneArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("---------");
		System.out.println("---------");
		
		//main이 끝나면 사라지는 매서드 내부 클래스
		class Student {
			String name;
			int age;
			
			public Student(String name,int age) {
				this.name = name;
				this.age = age;
			}
			
			@Override
			public String toString() {
				return "name = '"+name+"\'"
						+" ,age = "+age;
			}
		}
		
		Student[] students  = new Student[5];
		students[0] = new Student("아이언맨", 11);
        students[1] = new Student("헐크", 4);
        students[2] = new Student("토르", 15);
        students[3] = new Student("블랙위도우", 13);
        students[4] = new Student("캡틴", 4);
		
        System.out.println("클래스 정렬전 데이터");
        for(int i=0; i<students.length ; i++) {
        	System.out.println(students[i]);
        }
		System.out.println();
		
		System.out.println("클래스 정렬후 데이터(나이 내림차순)");
		
		InsertionSortExClass01.sort(students,new Comparator<Student>() {
			@Override
			public int compare(Student o1,Student o2) {
				if(o1.age < o2.age) {
					return 1;
				}
				else if(o1.age == o2.age) {
					return 0;
				}
				else {
					return -1;
				}
			}
			//이렇게 그대로 생성자를 만들어 오버라이딩해서 쓸수있다.
			//단 Integer같은경우 compare(Integer[0] Integer[1])
			//이게 더 간단하다
		});
		
		for(int i=0; i<students.length ; i++) {
			System.out.println(students[i]);
		}
	}
}
