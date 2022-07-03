package arrayList_Pratice_0702;

import java.util.ArrayList;

public class Arrayformation {
	/*
	ArrayList<String> int1 = new ArrayList<String>();
	ArrayList<Integer> num2 = new ArrayList<Integer>();
	ArrayList<Character> cha = new ArrayList<Character>();
	
	ArrayList<String> str = new ArrayList<String>();
	ArrayList<Integer> int2 = new ArrayList<Integer>();
	
	ArrayList<Integer> int3 = new ArrayList<Integer>(10); //크기가 10
	*/
	
	public static void main (String[] args) {
		
		/*
		ArrayList<String> kang = new ArrayList<String>(3);
		kang.add("kang");
		kang.add("park");
		kang.add("kim");
		
		System.out.println(kang); //[kang, park, kim]
		
		//할당량을 3을 줬을경우 추가를 해봤다
		
		kang.add("park");
		System.out.println(kang);//[kang, park, kim, park] 가변이라 추가가 된다
		kang.add(3, "lee");
		System.out.println(kang);//[kang, park, kim, lee, park] 그 사이로 밀어내고 추가된다;
		
		//값 변경 set 그 자리를 지우고 들어간다;
		
		kang.set(3, "jin");
		System.out.println(kang);//[kang, park, kim, jin, park]
		
		//삭제하기
		//clear() 전체 삭제;
		//remove(?) 
		//1.remove("kang")
		kang.remove("kang");
		System.out.println(kang);// [park, kim, jin, park]
		//2.remove(index) //park가 0인지도 확인;
		kang.remove(0);
		System.out.println(kang); //[kim, jin, park] 인덱스로 지우나 뭘로 지우나 땡겨진다
		
		//크기 구하기
		System.out.println(kang.size()); //[kim, jin, park]  3나온다
		
		//값 출력하기
		//get(index)
		
		System.out.println(kang.get(2)); // park 밖으로 꺼내진다.
		
		for(String a : kang) {
			System.out.println(a);
		}
		
		//검색하기
		
		//contains - 값 존재 여부 boolean 값;
		//indexOf - 있으면 index 없으면 -1;
		
		System.out.println(kang.contains("park")); //true
		System.out.println(kang.contains("pak")); //false
		
		System.out.println(kang.indexOf("park")); // 2
		
		
		//add 추가 remove 지우기 clear 초기화 인데 갑자기 궁금해진거
		ArrayList<String> sin = new ArrayList<String>(10);
		System.out.println(sin.size()); // 사이즈 0;
		
		*/
		
		//Array 객체 배열 다시 되새김질
		//크기와 양을 조절 잘하자;
		
		Student1[] studentList = new Student1[5];
		//이렇게 되면 인스턴스 주소값만 할당받는다. 건물이 없고 부동산 계약만 한거다;
		studentList[0] = new Student1("kang");
		studentList[1] = new Student1("ang");
		studentList[2] = new Student1("ng");
		studentList[3] = new Student1("g");
		studentList[4] = new Student1("");
		
		Student1[] studentListCoppy = new Student1[5];
		System.arraycopy(studentList, 0, studentListCoppy, 0, 5);
		
		for(Student1 s : studentListCoppy) {
			System.out.println(s.getStudentName());
		}
		
		System.out.println("-----절취선-----");
		
		for(Student1 s : studentList) {
			
				System.out.println(s);
//				arrayList_Pratice_0702.Student1@1bc6a36e
//				arrayList_Pratice_0702.Student1@1ff8b8f
//				arrayList_Pratice_0702.Student1@387c703b
//				arrayList_Pratice_0702.Student1@224aed64
//				arrayList_Pratice_0702.Student1@c39f790
		}
		
		System.out.println("------절취선------");
		
		
		for(Student1 s : studentListCoppy) {
			
			System.out.println(s);
//			arrayList_Pratice_0702.Student1@1bc6a36e
//			arrayList_Pratice_0702.Student1@1ff8b8f
//			arrayList_Pratice_0702.Student1@387c703b
//			arrayList_Pratice_0702.Student1@224aed64
//			arrayList_Pratice_0702.Student1@c39f790
			//위는 진퉁
			//-------
			//아래는 복사본 주소가 같다 따라서 할당된 값을 변경하면 복사본의 할당값도 변경된다;
//			arrayList_Pratice_0702.Student1@1bc6a36e
//			arrayList_Pratice_0702.Student1@1ff8b8f
//			arrayList_Pratice_0702.Student1@387c703b
//			arrayList_Pratice_0702.Student1@224aed64
//			arrayList_Pratice_0702.Student1@c39f790
	}
		
		//다른 할당량으로 바꾸자
		
		for(int i = 0 ; i < studentList.length ; i++) {
			studentListCoppy[i].setStudentName(studentList[i].getStudentName());
		}
		
		for(Student1 s : studentListCoppy) {
			s.showInfo();
		}
		
		
		
	}
	




}




class Student1 {
	
	private static int studentID = 1000;
	private int studentId;
	private String studentName;
	
	public Student1() {}
	
	public Student1(String studentName) {
		studentID++;
		this.studentName = studentName;
		studentId = studentID;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println(getStudentId());
		System.out.println(getStudentName());
	}
}
	