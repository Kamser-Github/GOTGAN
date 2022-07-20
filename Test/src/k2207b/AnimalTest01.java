package k2207b;

import k220719.Animal01;
import k220719.Cat01;
import k220719.Dog01;

public class AnimalTest01 {
	
	public static void main(String[] args) {
		//Animal01 ani01 = new Animal01(); �߻� Ŭ������ �������.
		
		//
		
//		Cat01 cat01 = new Cat01(3, "����", 0, "����");
//		Dog01 dog01 = new Dog01(2,"���",1500,1);
//		Cat01 cat02 = new Cat01(1, "�渷��", 900, "���");
//		Dog01 dog03 = new Dog01(4,"�λ�",1200,5);
		//��ü ���⼺���� �Ѳ����� ó���� ����������.
		//��� 1
		Animal01[] anilist = new Animal01[4];
		anilist[0] = new Cat01(3, "����", 0, "����");
		anilist[1] = new Dog01(2,"���",1500,1);
		anilist[2] = new Cat01(1, "�渷��", 900, "���");
		anilist[3] = new Dog01(4,"�λ�",1200,5);
		
		//���2 �ٷ� �ʱ�ȭ�� �ϸ� new�����ڴ� ������ ����������.
		Animal01[] anilist2 = { 
				new Cat01(3, "����", 0, "����"),
				new Dog01(2,"���",1500,1),
				new Cat01(1, "�渷��", 900, "���"),
				new Dog01(4,"�λ�",1200,5)
		};
		
		//1.��� ���
		/*anilist ���������� ���� ���� ���ִµ�
		 * �ű⸦ ���󰡸� ���������� ������� �����Ǿ��ִ�
		 * �迭�� ���´�. �迭 �����θ��� �� �������� �̱⶧����
		 * �������� ����ְ� �ű⿡ �ν��Ͻ��� �����Ǿ��ִ�
		 */
		for(int i=0 ; i<anilist.length ; i++) {
			anilist[i].bark();
			anilist[i].character();
			//���⼭ �ڼ��� ���� ���� �ż���� ȣ���� �ȵȴ�
			//����Ÿ���� animal�̱� �빮�� ȣ���ų ������ ����.
			//���� instanceof��� �����ڷ� �Ȱ������
			//���ǹ��� ���� ����Ѵ�.
			if(anilist[i] instanceof Cat01) {
				((Cat01)anilist[i]).hateMotion();
			}else if(anilist[i] instanceof Dog01){
				((Dog01)anilist[i]).happyMotion();
			}
		}//for end
		
		//2. �׻�� for��
		
		for(Animal01 a : anilist) {
			a.bark();
			a.character();
			if(a instanceof Cat01) {
				((Cat01)a).hateMotion();
			}else if(a instanceof Dog01) {
				((Dog01)a).happyMotion();
			}
		}
		
		//�� �����ϴ�. �̶� ����ȯ�� �ʿ��ϴ�
	}//main end
}
