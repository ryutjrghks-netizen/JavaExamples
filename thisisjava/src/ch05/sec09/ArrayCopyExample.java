package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//���� 3�� �迭
		String[] oldStrArray = {"java", "array", "copy" };
		//���� 5�� �迭�� ���� ����
		String[] newStrArray = new String[5];
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i = 0; i< newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}
	}

}
