package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		//�ڵ� Ÿ�� ��ȯ
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '��';   //�ϳ��� char�϶��� single qutation�� ��� �Ѵ�.
		intValue = charValue;
		System.out.println("���� �����ڵ�: " + charValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;     // �޸𸮴� long�� float ���� ũ���� �������� �Ǽ��� ����ȯ�� �Ͼ��.
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;      // F�� ���� ������ double(8byte)�� �Ҵ�ȴ�.
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		

	}

}
