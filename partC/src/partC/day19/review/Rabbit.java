package partC.day19.review;

public class Rabbit extends Animal {
	static final String TYPE ="토끼";

	@Override
	public String getType() {
		return "토끼";
	}

	@Override
	public void sound() {
		System.out.println(super.getColor() + "토끼는 🐰🐰조용합니다.");
	}

}
