package partC.day18;

//day17 Member 클래스와 비교 : Comparable 인터페이스 사용하지 않음-> 비교 필드를 고정시키지 않음.
public class User  {    
	private String id;
	private String name;
	private int age;
	private double point;
	
	public User(String name,int age) {
		this.name=name;
		this.age = age;
	}
	
	public String getId() { return id; }
	public String getName() { return name; 	}
	public int getAge() { return age;	}
	public double getPoint() { return point; }
	public void setPoint(double point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return String.format("id=%s , name = %s , age=%d , point=%.1f \n", 
				id,name,age,point);
	}

}



