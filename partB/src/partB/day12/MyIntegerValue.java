package partB.day12;

//데이터를 저장하고 그 데이터에 처리 기능을 갖는 메소드로 구성되는 클래스
//		인스턴스 필드와 인스턴스 메소드로 구성 (static 아님)
//		인스턴스는 새로운 객체를 생성해서 데이터를 저장하고 실행
public class MyIntegerValue {

		//1)클래스의 특성 즉 인스턴스 필드 선언
		int value1;
		int value2;
		
		//3) private 변수 선언과 테스트
		private String name;
		private int test;
		
		//private 변수값 저장할 메소드
		public void name(String name) {
			this.name = name;	//현재(this) 객체의 name 필드값을 매개변수 name으로 참조값 받아라.
		}
		//private 변수값 리턴할 메소드
		public String getName() {
			return name;
		}
		
		// private 변수값 출력할 메소드
		public void printName() {
			System.out.println("이 객체의 name = " + name);
		}
		
		//private test 의 메소드
		
		
		
		
		//2)처리기능(동작) 즉 인스턴스 메소드 선언
		public int add() {
			return value1+ value2;
		}
		public int subtract() {
			return value1- value2;
		}
		public int multiply() {
			return value1* value2;
		}
		public int divide() {
			return value1/value2;
		}
		public int remaind() {
			return value1% value2;
		}
	
}
