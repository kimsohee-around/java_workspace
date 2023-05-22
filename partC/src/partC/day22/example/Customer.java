package partC.day22.example;

public class Customer {

	String name;
	String address;
	String grade;
	
	//파일이 저장되는 형태 오버라이딩
	@Override
	public String toString() {
		return name +"\t"+address+"("+grade+")";
	}
	
	//생성자
	public Customer(String name, String address, String grade) {
		this.name = name;
		this.address = address;
		this.grade = grade;
	}
	
	//getter, setter정의
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = switch(grade) {	//자바 12부터 사용가능
		case "1" -> "일반고객";
		case "2" -> "직원";
		case "3" -> "VIP";
		default -> throw new IllegalArgumentException("Unexpected (value =1 or 2 or 3) : "+grade);
		
		};
	}

	
	
}
