package partC.day17;

//Member 클래스의 객체를 비교가능하도록 인터페이스 사용하기
public class Member implements Comparable<Member> {    
	private String id;
	private String name;
	private int age;
	private double point;
	
	public Member(String name,int age) {
		this.name=name;
		this.age = age;
	}
	
	public String getId() { return id; }
	public String getName() { return name; 	}
	public int getAge() { return age;	}
	public double getPoint() { return point; }

	@Override
	public String toString() {
		return String.format("id=%s , name = %s , age=%d , point=%.1f \n", 
				id,name,age,point);
	}

	//Comparable<Member> 인터페이스의 추상메소드 정의하기
	@Override
	public int compareTo(Member o) {   
		// name 필드로 비교한다면 //this.name과 인자 객체인 o의 name 비교
		//return this.name.compareTo(o.getName());
		//age 필드로 비교한다면   //age 필드는 int형이므로 뺄셈식으로 리턴.
		return this.age-o.age;
	}


}



