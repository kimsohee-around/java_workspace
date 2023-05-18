package partC.day19.review;

public abstract class Animal {
	//static : 공유 자원(데이터)
	static final String TYPE ="동물";
	
	//인스턴스 필드
	private String color;
	private String name;    //동물 이름 예)마루
	
	//생성자
	public Animal() {
		System.out.println("새로운 반려동물 가족이 생겼습니다.");
	}
	
	public Animal(String color) {
		this();		//기본생성자 메소드 호출
		this.color=color;
	}
	
	//추상메소드: 공통적인 기능
	public abstract void sound();
	public abstract String getType();		//코드 구현 방식 비교를 위해서 작성-꼭 필요하지 않습니다.

	
	//일반 인스턴스 메소드
	//필드가 private 이면 읽고 쓰기 -> getter, setter
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
