package partB.day14;

public class Circle extends Shape{
	
	//원에는 반지름 필드 추가
	private double radius;
	
	public double getRadius() { return radius; 	}
	public void setRadius(double radius) { 	this.radius = radius; 	}

	//자식 클래스 커스텀 생성자
	public Circle(double radius) {
		super("원",2*(int)radius,2*(int)radius);		//원 크기의 근접한 값으로 너비,높이	
		this.radius = radius;
	}
}
