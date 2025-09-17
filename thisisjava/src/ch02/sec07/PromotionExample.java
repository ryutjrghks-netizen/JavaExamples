package ch02.sec07;

public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';   //하나의 char일때는 single qutation을 써야 한다.
		intValue = charValue;
		System.out.println("가의 유니코드: " + charValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;     // 메모리는 long이 float 보다 크지만 정수에서 실수로 형변환이 일어난다.
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;      // F를 쓰지 않으면 double(8byte)이 할당된다.
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		

	}

}
