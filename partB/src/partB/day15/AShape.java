package partB.day15;

public abstract class AShape {   
	//abstract 키워드 : 부모 클래스를 추상화(구체화되지 않은 상태). 객체를 생성하지 않는 추상 클래스
	//				  자식 클래스들에게 필요한 추상 메소드 선언({ } 안에 코드가 없음.)
	//				  -> 자식들이 구체화해야할 추상 메소드를 선언.
	
	//자식클래스는 getter/setter 없이 필드 사용합니다.
	protected String shapeName;
	protected int width;
	protected int height;

	public AShape() {
		System.out.println("추상클래스 AShape의 기본 생성자 실행완료!");
	}
	
	public AShape(String shapeName) {
		System.out.println("추상클래스 AShape의 커스텀 생성자 실행완료!");
		this.shapeName=shapeName;
	}
	
	//추상메소드 : 자식클래스가 재정의를 꼭(must) 하고 쓰도록 선언.
	public abstract int area();					//도형 넓이 계산
	public abstract void resize(int size);		//도형 크기 변경 메소드
	
	//인스턴스 메소드 정의도 가능합니다.
	public void aShape() {
		System.out.println("추상클래스 AShape의 인스턴스 메소드 실행!!");
	}

	@Override
	public String toString() {
		return "AShape [도형이름=" + shapeName + ", 너비=" + width + ", 높이=" + height + "]";
	}
	
	
	
}
