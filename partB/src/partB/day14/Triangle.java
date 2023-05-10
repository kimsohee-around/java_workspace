package partB.day14;

//삼각형 클래스 
public class Triangle extends Shape {
		//자식 클래스의 필드와 메소드
		private int angle;			//삼각형의 각도
		
		public int getAngle() { return angle; 	}
		
		public void setAngle(int angle) { 	this.angle = angle; }
		
		//숨어있는 기본 생성자
		public Triangle() {
		//	super();		//오류; super 기본생성자는 Shape 클래스에 없습니다.
			super("아직모름",0,0);		//super 커스텀생성자 호출하면 오류 해결!!
		}
	
		//부모클래스의 area() 메소드를 삼각형 넓이 공식으로 재정의 합니다.
		@Override
		public int area() {
			return super.area() / 2;
		}
		
//메소드 재정의(overriding)  : 부모클래스가 정의한 메소드 동작을 자식에 맞도록 또는 필요한 처리 기능으로
//                   다시 정의하는 것입니다.
		
}


