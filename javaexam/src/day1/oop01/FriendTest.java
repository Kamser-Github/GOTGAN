package day1.oop01;

public class FriendTest {
	
	public static void main(String[] args) {
		
		Friend[] friend = {
				new Friend("��", "1544-1577","���̹�"),
				new Friend("���", "1544-1577","���̹�"),
				new Friend("�������", "1544-1577","���̹�"),
				new Friend("������", "1544-1577","���̹�"),
				new Friend("��", "1544-1577","���̹�")
		};
		
		System.out.println("�̸�\t��ȭ��ȣ\t\t�����ּ�");
		System.out.println("---------------------------------");
		for(Friend a : friend) {
			System.out.println(a.getInfo());
		}
	}
}
