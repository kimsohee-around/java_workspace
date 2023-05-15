package partC.day17;

//InterfaceA 의 구현 클래스 (구현체,실체)
//InterfaceA의 추상메소드를 꼭 정의(구현)해야 합니다.
public class ClassA implements InterfaceA{
	
	//인스턴스 필드
	
	
	
	//인스턴스 메소드
	
	
	
	//InterfaceA 의 추상메소드 구현
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceA 의 methodA 정의(구현)합니다.");
	}

	@Override
	public int methodB(int num) {
		System.out.println("InterfaceA 의 methodB 정의(구현)합니다.");
		return 999+num;
	}

}
