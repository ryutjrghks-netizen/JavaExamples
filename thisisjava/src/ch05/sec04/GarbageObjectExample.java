package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "����";
		hobby = null;				//"����"�� �ش��ϴ� Sring ��ü�� ������� ����
		
		String kind1 = "�ڵ���";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind2: " + kind2);
	}

}
