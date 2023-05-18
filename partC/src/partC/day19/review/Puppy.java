package partC.day19.review;

public class Puppy extends Animal {
	static final String TYPE ="강아지";
	
	public Puppy() {
	}
	
	public Puppy(String color) {
		super(color);
		//this.setColor(color);		//위의 super 생성자 활용이 더 정확합니다.
	}
	
	@Override
	public String getType() {
		return "강아지";
	}

	@Override
	public void sound() {
		System.out.println(super.getColor() +" 강아지는 멍멍 🐶🐶하고 짖습니다. ");

	}

	
}
