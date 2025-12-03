package ch07.sec05.exam02;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed+=10;
	}
	
	@Override		// 오버라이트 불가. Car 클래스에서 stop() 메소드가 final 으로 작성되었음.
	public void stop() {
		System.out.println("스포츠카를 멈춤.");
		speed = 0;
	}

}
