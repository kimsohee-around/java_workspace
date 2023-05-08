package partB.day12;

//자바의 Math 클래스 메소드를 간단히 구현해보기
//					ㄴ  static 메소드 또는 static 필드 : 클래스 이름으로 사용한다.
//실행에 필요한 main 메소드 제외하여 이 클래스를 라이브러리
//클래스로 만들어 봅니다.
public class MySimpleMath {
	//메소드 시그니처 : 메소드 이름, 메소드 인자(갯수,타입에 따른 순서)
	//*메소드 오버로딩(overloading) : 메소드 시그니처 중에 `인자의 타입과 개수`가 다르고 
	//			실행 동작이 같을때 (명령어는 다를 수 있습니다.)
	//			메소드 이름을 동일하게 하여 사용하도록 하는 것 입니다.
	
	public static final double PI=3.14;		//변수 선언.(필드)
							//static final 은 상수(변경될 수 없는 값)
	public static double test = 1.345;
							//static 필드. 변경할 수 있는 값.
	//두 개의 실수를 덧셈하기.
	public static double add(double value1,double value2) {
		return value1 + value2;
	}
	
	//두 개의 실수를 뺄셈하기.
	public static double subtract(double value1,double value2) {
		return value1 - value2;
	}
	
	//두 개의 실수를 곱셈하기.
	public static double multiply(double value1,double value2) {
		return value1 * value2;
	}
	
	//두 개의 실수를 나눗셈하기.
	public static double divide(double value1,double value2) {
		return value1 / value2;
	}
	
	//인자가 없는 메소드   *인자:메소드에 전달되는 값, 매개변수:인자값을 저장하기 위해 선언된 변수
	//   인자 즉 매개변수에 대한 타입과 갯수가 달라지는 오버로딩 예시
	public static double remaind(double test) {
		return 0.0;
	}
	
	
	
	//두 개의 정수를 덧셈하기.
	public static int add(int value1, int value2) {
		return value1 + value2;
	}
	
	//메소드 오버로딩 오류 예시 : 매개변수의 갯수와 형식(즉 시그니쳐) 가 같다.
	//		리턴타입만 변경되는 것은 불가능
	//public static long add(int value1, int value2) {
	//	return value1 + value2;
	//}
	
	
	//두 개의 정수를 뺄셈하기
	public static int subtract(int value1,int value2) {
		return value1-value2;
	}
	//두 개의 정수를 곱셈하기 => 곱셈 결과는 long
	public static long multiply(int value1, int value2) {
		return value1*value2;
	}  //정수값 최대 2147483647 . 
	
	//두 개의 정수를 나누기 => 몫
	public static int divide(int value1, int value2) {
		return value1/value2;
	}
	
	//두 개의 정수를 나누기 => 나머지
	public static int remaind(int value1, int value2) {
		return value1%value2;
	}
	
}
