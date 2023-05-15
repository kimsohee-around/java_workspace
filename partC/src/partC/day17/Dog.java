package partC.day17;

public class Dog implements Runnable{
	private String name;
	
	@Override
	public String run(int speed) {
	
		return "name=" + name + ",speed=" + speed + " 달리기 잘합니다.";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
