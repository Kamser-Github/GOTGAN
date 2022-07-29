package kr.co.stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;

class Person implements Serializable{
	
	private static final long serialVersionUID = 3943516161501766676L;
	String name;
	String title;
	
	public Person() {}
	public Person(String name,String title) {
		this.name = name;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return name+","+title;
	}
}
public class SerializationTest {
	
	public static void main(String[] args) {
		
		Person lee = new Person("이순신","명량해전");
		
		try(FileOutputStream fos = new FileOutputStream("c:/iotest/lee.dat"); 
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
			oos.writeObject(lee);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("c:/iotest/lee.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);){
			
			Object obj = ois.readObject();
			if(obj instanceof Person) {
				System.out.println(((Person) obj).toString());
			}
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
