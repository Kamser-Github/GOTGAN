package day1;

public class FriendTest {
	
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("홍길동","123456","네이버"),
				new Friend("마리오","1231256","야후"),
				new Friend("아이언맨","121256","구글"),
				new Friend("피카츄","124256","판도라"),
				new Friend("둘리","1216256","다음"),
		};
		
		TotalInfo(friends);
	}
	
	public static void TotalInfo(Friend[] a) {
		System.out.println("이름\t전화번호\t메일주소");
		System.out.println("-----------------------");
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i].getInfo());
		}
	}
}
