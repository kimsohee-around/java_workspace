package partC.day19.review;

public class Cat extends Animal {
	static final String TYPE ="고양이";		//상수 필드명이 부모에 있는것과 동일하지만 상관없습니다.
	
	@Override
	public String getType() {
		return "고양이";
	}
	
	@Override
	public void sound() {
		System.out.println(super.getColor() +" 고양이는 야옹 😽 하고 소리를 냅니다.");
	}

}
