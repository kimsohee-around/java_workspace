package partC.day17;

public class C01InterfaceATest {
	public static void main(String[] args) {
		System.out.println("1.InterfaceA의 상수 필드 확인");
		System.out.println("SIZE = " + InterfaceA.SIZE);
		System.out.println("2.인터페이스는 직접 객체 생성하지 않습니다.");
		//InterfaceA ia = new InterfaceA();		//오류
		System.out.println("3. static 메소드 실행하기");
		InterfaceA.methodC();
		System.out.println("4. InterfaceA의 구현클래스로 객체 생성하기");
		System.out.println("==구현 클래스 타입 변수로 선언하기");
		ClassA ca = new ClassA();
		System.out.println("==인터페이스 타입 변수로 선언하기");
		InterfaceA ia = new ClassA();
		System.out.println("5.구현클래스의 오버라이드 메소드 실행하기");
		ca.methodA();
		ia.methodA();
		System.out.println(ca.methodB(123));
		System.out.println(ia.methodB(1123));
	}
}
