package partA.day06;

public class A26MyUtilityTest {
	
	public static void main(String[] args) {
		
		//MyUtility의 static 즉 `클래스 메소드`를 테스트 합니다. 사용방법은 클래스이름.메소드()
		//   ㄴ private은 다른 클래스에서 사용할 수 없는 접근 제한입니다.
		//int code = MyUtility.toAscii("$");		//오류 : private 메소드
		
		MyUtility.alphabetPrint(0);
		MyUtility.alphabetPrint(1);
		
		double result = MyUtility.sumThreeDouble(3, 4, 5.2);
		System.out.println("result = " + result);
		
		//메소드는 클래스의 구성요소인 `동작(데이터 처리)`입니다.
		//필드는 클래스의 구성요소인 `특성(데이터)`을 나타내는 변수 입니다.
		System.out.println("MyUtility 필드 TEST 값 = " + MyUtility.TEST);
		System.out.println("MyUtility 필드 TEMP 값 = " + MyUtility.TEMP);
		
		MyUtility.TEST =31419;
		//MyUtility.TEMP=31419;		//오류:final 변수는 값을 바꿀수 없습니다.

		System.out.println("MyUtility 필드 TEST 값 = " + MyUtility.TEST);
		
		
	}

}
