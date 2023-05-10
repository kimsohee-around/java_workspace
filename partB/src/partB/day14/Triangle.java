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
	
}
