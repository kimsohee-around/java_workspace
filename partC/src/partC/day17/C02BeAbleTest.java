package partC.day17;

public class C02BeAbleTest {

	public static void main(String[] args) {
		Thinkable th1 = new Human();
		Thinkable th2 = new AI();
//		Thinkable th3 = new Dog();		//오류 : Dog 은 Thinkable의 구현클래스가 아님.
		Runnable run1 = new Dog();
//		Runnable run2 = new AI();		//오류 : AI 은 Runnable의 구현클래스가 아님.

		Thinkable[] thinks = new Thinkable[2];
		thinks[0] = th1;
		thinks[1] = th2;

		// 다형성 예시 : Human,AI 객체로 각각 생성되었지만 같은 인터페이스 Thinkable로 참조합니다.
		// 이 때 calculate 메소드는 각각 다른 내용으로 실행됩니다.
		for (Thinkable t : thinks) {
			System.out.println("Thinkable 인터페이스의 calculate 메소드 실행 결과===");
			if (t instanceof Human)
				System.out.println("나 휴먼 계산 중입니다......");
			else if (t instanceof AI)
				System.out.println("나 AI 계산 중입니다...... ");
			else {
				System.out.println("알 수 없는 객체입니다.");
				break;
			}
			System.out.println("결과 = " + t.calculate(999999, 1234567));
		}
	}

}
