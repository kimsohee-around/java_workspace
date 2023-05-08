package partB.day12;

import java.util.Arrays;

//웹에서 회원가입할 때 사용하는 회원 정보를 예시로 클래스를 정의
public class Member {
	private String id;
	private String name;
	private int age;
	private double point;
	private String[] message;		//getter 와 setter는 ?
	
	//private 필드에 대한 접근 메소드 : getter(읽기) , setter(쓰기)
	//getter : 현재 필드값을 리턴하는 형식이 필요
	public String getId() { return id; }
	public String getName() { return name; 	}
	public int getAge() { return age;	}
	public double getPoint() { return point; }
	public String[] getMessage() { return message; }
	//setter : 인자값을 받을 매개 변수 선언 필요
	public void setId(String id) { 	this.id=id;  }
	public void setName(String name) { this.name=name; }
	public void setAge(int age) { this.age= age; }
	public void setPoint(double point) {this.point = point; }
	public void setMessage(String[] message) {this.message=message; }
	
	//객체 필드값 정보 리턴
	public String member() {
		return String.format("id=%s , name = %s , age=%d , point=%.1f , message= %s\n", 
				id,name,age,point,Arrays.toString(message));
	}
}



