package day1.oop01;

public class FriendTest {
	
	public static void main(String[] args) {
		
		Friend[] friend = {
				new Friend("껌", "1544-1577","네이버"),
				new Friend("라면", "1544-1577","네이버"),
				new Friend("삶은계란", "1544-1577","네이버"),
				new Friend("구운계란", "1544-1577","네이버"),
				new Friend("물", "1544-1577","네이버")
		};
		
		System.out.println("이름\t전화번호\t\t메일주소");
		System.out.println("---------------------------------");
		for(Friend a : friend) {
			System.out.println(a.getInfo());
		}
	}
}
