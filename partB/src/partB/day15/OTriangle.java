package partB.day15;

public class OTriangle extends AShape {
//The type OTriangle must implement the inherited abstract method AShape.resize(int)
//OTriangle 클래스는 상속받은 추상 메소드 resize(int)를 구현해야한다.
//추상클래스의 자식클래스는 추상메소드를 모두 재정의해야 한다.
	
	private int angle;    //삼각형의 각도
	
	public OTriangle() {
		System.out.println("자식클래스 OTrinangle의 기본 생성자 실행완료!");
	}
	
	@Override
	public void resize(int size) {
		this.angle +=  size;
	}
	
	@Override
		public int area() {
			return width*height/2;
	}
}
