package array_7_1;

public class Student {
	
	private String name;
	private int id;
	private int height;
	
	Student() {}
	public Student(String name,int id,int height) {
		this.name = name;
		this.id = id;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void showInfo() {
		System.out.println(name + "," + id + "," + height);
	}
	
}
