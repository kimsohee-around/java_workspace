package partB.day13;

//불변객체로 정의하는 예시.
//1. 필드는 모두 final   2.커스텀 생성자로 모든 필드 초기화    3.getter 메소드만 정의
public class User {
	//상수 적용 예시
	private static final double MAX_POINT = 10000;		//point 필드값 최대는 10000
	
	//final 은 값의 변경이 불가능.
	private final String id;
	private final String name;
	private final int age;
	private double point;
	
	//커스텀 생성자
	public User(String id,String name, int age, double point) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.point = point;
	}
	
	//모든 필드값 출력 문자열
	public String user() {
		return String.format("id=%s , name=%s ,age=%d ,point=%.2f", 
				id,name,age,point);
	}

	//변경이 필요한 필드 point 는 setter 메소드
	public void setPoint(double point) {
	// if(point <=MAX_POINT )  this.point = point;  else this.point = MAX_POINT;
		this.point = Math.min(point, MAX_POINT);	//if 안쓴 방법의 코드
	}
	
	//getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getPoint() {
		return point;
	}
//아래 setter 는 오류 : final 필드는 변경 불가.	
/*
	public void setId(String id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
*/	
	
	
}
