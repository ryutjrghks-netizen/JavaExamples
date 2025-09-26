package ch03.sec08;

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("-------------------------");
		
		byte recieveData = -120;
		
		//��� 1 : ��Ʈ ���� �������� Unsigned ���� ���
		int unsignedInt1 = recieveData & 255;
		System.out.println(unsignedInt1);
		
		//��� 2 : �ڹ� API�� �̿��ؼ� Unsigned ���� ���
		int unsignedInt2 = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest);   // 4byte ������ �ִ� 136�� 1byte�� ��ȯ�ϸ鼭 ���ڸ��� �߷�����.
		
		
		
		
	}
}
