package partB.day15;

import partB.day14.Shape;

public class OCircle extends AShape{
	
	//원에는 반지름 필드 추가
	private double radius;
	
	public double getRadius() { return radius; 	}
	public void setRadius(double radius) { 	this.radius = radius; 	}

	public OCircle() {
		System.out.println("자식 클래스 OCircle 생성자 실행완료!!");
	}
	
	public OCircle(double radius) {
		//super();		//원 크기의 근접한 값으로 너비,높이	
		System.out.println("자식 클래스 OCircle 생성자 실행완료!!");
		this.radius = radius;
	}
	
	public void iamCircle() {
		System.out.println("I am Circle. -" + super.shapeName);
		System.out.println("반지름=" + this.radius);
	}
	
	@Override
	public int area() {
		return (int)(Math.PI * this.radius * this.radius);		
		//부모 area() 메소드 리턴 타입으로 캐스팅.리턴 타입을 변경하면 오버라이딩이 아님.
	}
	
	@Override
	public void resize(int size) {
		this.radius += size;
	}
	
	@Override
	public String toString() {
		return super.toString() + ",반지름 = " + this.radius;
	}
	
}
