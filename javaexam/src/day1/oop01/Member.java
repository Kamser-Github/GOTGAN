package day1.oop01;

import java.awt.event.ActionEvent;

public class Member {
	//��������
	public String name,account,passwd;
	public int birthyear;
	
	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		
		//������ �ʱ�ȭ
		m1.name = "��ī��";
		m1.account = "��ī��";
		m1.passwd = "�鸸��Ʈ";
		m1.birthyear = 1985;
		
		m2.name = "���̸�";
		m2.account = "���̸�";
		m2.passwd = "�Ҳɹ߻�";
		m2.birthyear = 1985;
		
		m3.name = "������";
		m3.account = "������";
		m3.passwd = "������";
		m3.birthyear = 1985;
		
		System.out.printf("ȸ��1 : %s(%s,%s,%d)\n",m1.name,m1.account,m1.passwd,m1.birthyear);
		System.out.printf("ȸ��2 : %s(%s,%s,%d)\n",m2.name,m2.account,m2.passwd,m2.birthyear);
		System.out.printf("ȸ��3 : %s(%s,%s,%d)\n",m3.name,m3.account,m3.passwd,m3.birthyear);
		
		//�����ڰ� �� ������� ������ �����ϰ� �Ǿ���.
	}
}

