package partB.day14;

//'도형-삼각형,사각형,원,..' 들의 부모클래스
public class Shape {

	private String shapeName;		//도형 이름
	private int width;				//도형의 크기 중 너비
	private int height;				//           높이
	
	//생성자
	public Shape(String shapeName, int width, int height) {
		this.shapeName = shapeName;
		this.width = width;
		this.height = height;
	}
	
	//toString 을 재정의(다시 정의하기)
	@Override			
	public String toString() {
		return String.format("도형이름 : %s, 너비 : %d, 높이 : %d", 
				shapeName,width,height);
	}
	
	//getter,setter
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	//
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	//
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
}
