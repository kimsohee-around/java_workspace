package partB.day15;

public class OLadderShape extends AShape {
	
	private int topLength;				//윗변
	private int bottomLength;			//아랫변
	
	public OLadderShape() {
		System.out.println("자식 클래스 OLadderShape 기본 생성자 실행완료!!");
	}
	
	//부모클래스의 width=0 으로 사용하지 않음. 생성자/getter와 setter
	public OLadderShape(String shapeName,int height, int topLength,int bottomLength) {
		super(shapeName);
		System.out.println("자식 클래스 OLadderShape 커스텀 생성자 실행완료!!");
		super.height = height;
		this.topLength = topLength;
		this.bottomLength = bottomLength;
	}
	
	//day15에 추가. 자식 LadderShaper의 인스턴스 메소드
	public void iamLadder() {
		System.out.println("I am Ladder. -" + super.shapeName);
		System.out.println("윗변=" + this.topLength + ",아랫변=" + this.bottomLength);
	}
	
	//사다리꼴 넓이 구하는 공식으로 메소드 재정의 해보세요.(윗변+아랫변)*높이/2
	@Override
	public int area() {
		int sum = this.topLength + this.bottomLength;
		return sum*super.height/2;
	}
	
	@Override
	public void resize(int size) {		//도형 크기를 변경하는 수식이면 모두 가능합니다.
		this.topLength +=size;
		this.bottomLength += size;
	}
	
	//toString 재정의 하세요. Shape 의 toString() 활용하려면?
	@Override
	public String toString() {
		return super.toString() + ",윗변 : " + this.topLength + ",아랫변 : " + this.bottomLength;
	}
	
}
