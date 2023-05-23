package partC.day23;

import java.util.Scanner;

public class C15UnCheckedExceptionTest {
	
	//어떠한 RuntimeException 이 생기는지 확인하기.
	//         ㄴ NullPointerException, InputMismatchException , NumberFormatException의 부모클래스입니다.
	public static void main(String[] args) {
		
		//예시1 :
		String message = "hello";
		//String message = null;			 //java.lang.NullPointerException
		char temp = message.charAt(0);   //ㄴ객체가 지정되지 않은 null 상태. 메소드 실행못합니다.
		System.out.println("temp =" + temp);
		
		
		//예시2
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력하세요.(1) >>> ");
		int a = sc.nextInt();	//java.util.InputMismatchException
								// 숫자가 아닌 문자 입력하면 정수로 처리(nextInt)할 수 없어서 발생합니다.
		System.out.println("입력 값(1) = " + a);
		
		sc.nextLine();		//위의 nextInt() 가 가져가지 않은 문자 엔터를 처리하기 위한 명령.
		
		//예시3
		System.out.print("정수 입력하세요.(2) >>> ");
		a = Integer.parseInt(sc.nextLine());   //java.lang.NumberFormatException
		// 				  //숫자가 아닌 문자 입력하면 정수로 처리(parseInt)할 수 없어서 발생합니다.
		System.out.println("입력 값(2) = " + a);
		
		
	}
}
