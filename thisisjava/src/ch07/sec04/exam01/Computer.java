package ch07.sec04.exam01;

public class Computer extends Calculator{
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer °´Ã¤ÀÇ areaCircle() ½ÇÇà");
		return Math.PI*r*r;
	}

}
