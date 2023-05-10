package partB.day14.test;

import partB.day14.ClassA;

public class ClassAB extends ClassA {

	
	public void test() {
		//protected 필드 message 는 다른 패키지에서 사용할 수 있는 이유는? ClassA를 상속했기 때문에.
		super.message = "다른 패키지 자식 클래스 입니다.";
		this.message = "다른 패키지 자식 클래스 입니다.";  
		//message 는 부모필드이므로 자식 입장에서는 super, this 모두 사용 가능.정확히는 super
		System.out.println("메시지 =" + message);
	}
}
