package day1;

public class FriendTest {
	
	public static void main(String[] args) {
		Friend[] friends = {
				new Friend("ȫ�浿","123456","���̹�"),
				new Friend("������","1231256","����"),
				new Friend("���̾��","121256","����"),
				new Friend("��ī��","124256","�ǵ���"),
				new Friend("�Ѹ�","1216256","����"),
		};
		
		TotalInfo(friends);
	}
	
	public static void TotalInfo(Friend[] a) {
		System.out.println("�̸�\t��ȭ��ȣ\t�����ּ�");
		System.out.println("-----------------------");
		for(int i=0 ; i<a.length ; i++) {
			System.out.println(a[i].getInfo());
		}
	}
}
