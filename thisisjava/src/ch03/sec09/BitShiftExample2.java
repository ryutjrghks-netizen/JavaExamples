package ch03.sec09;

public class BitShiftExample2 {

	public static void main(String[] args) {
		int value = 772;  // [00000000] [00000000] [00000011] [00000100]
		
		//���� 3 byte(24bit)�̵��ϰ� �� 1byte�� ����.
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("ù ���� ����Ʈ ��ȣ���� ��: " + int1);
		
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("�� ���� ����Ʈ ��ȣ���� ��: " + int2);
		
		byte byte3 = (byte) (value >>> 8);
		int int3 = Byte.toUnsignedInt(byte3);
		System.out.println("�� ���� ����Ʈ ��ȣ���� ��: " + int3);
		
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);;
		System.out.println("�� ���� ����Ʈ ��ȣ���� ��: " + int4);
		

	}

}
