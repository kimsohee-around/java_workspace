package partA.day05;

public class A23MethodTest {

	public static void main(String[] args) {

		//methodA  호출(실행)
		int result = methodA();
		System.out.println("methodA 실행 결과 : " + result);
		
		//result = methodAA();		//오류 : main에서는 static 만 사용 가능
		
		methodB(425);
		//methodB(4.25);			//오류 : 매개변수의 형식과 실제값의 형식이 불일치
		//result = methodB(425);		//오류 : 리턴값이 없는 메소드이므로
	}
	
	//1.리턴값 있는 형식 예시 : 항상 정수값 1234 를 리턴하는 메소드
	//리턴이란 ? 메소드를 호출(실행)한 곳으로 값을 전달하는 것.
	//private (사적인): 다른 클래스에서는 사용할 수 없다.
	private static int methodA() {		//리턴형식 : int.  void이면 리턴 없음.
		//return "1234";   //오류
		//return 12.345;		//오류
		return 1234;		//정상: 리턴형식 int 와 일치하는 값을 return
	}						//     값을 전달하는 리턴은 메소드 마지막에 실행합니다.
	
	//2.static (정적인) : 간단히 설명하자면, main은 꼭 static 입니다. static 은 static만
	//				   사용할 수 있습니다.
	//static 이 없으면 인스턴스 메소드라고 합니다.
	public int methodAA() {
		return 1234;
	}
	
	//3. 인자가 있는 형식 예시 : 인자를 정수값을 1개 받아서 출력하기. 리턴은 없음.
	public static void methodB(int number) {   
		//int number가 메소드가 처리할 데이터(재료)를 저장합니다.실제 데이터는 실행할 때 전달받습니다.
		System.out.println("number = " + number);
		//void일 때는 값을 return 하지 않습니다.
	}
	

}
