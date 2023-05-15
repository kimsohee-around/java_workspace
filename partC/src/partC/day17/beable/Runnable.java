package partC.day17.beable;

public interface Runnable extends BeAble{

	String run(int speed);		//달리다.
	
	//이 시점까지 정상적으로 인터페이스를 사용하여 클래스를 정의했습니다.(프로그램 버전v1)
	// 그런데... 애플리케이션 개발 후에 재정의가 필요한 메소드가 생겼고 그리고 이것을 아래와 같이 추상메소드로 정의한다면
	//void temporary();
	//v1의 Dog, Human이 오류가 생깁니다. 그래서 이럴 때 버전v2에서 새로운 기능 추가로 필요한 메소드를 default 로 정의합니다.
	default void temporary() {
		//오류가 안생기도록 default 메소드로 정의하고 나중 버전의 클래스들이 사용하도록 합니다.
	}
}
