package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16UnCheckedTryCatch {

	// 어떠한 RuntimeException 이 생기는지 확인하기.
	// ㄴ NullPointerException, InputMismatchException , NumberFormatException의
	// 부모클래스입니다.
	public static void main(String[] args) {

		// 예시1 :
		// String message = "hello";
		try {
			String message = null; // java.lang.NullPointerException
			char temp = message.charAt(0); // ㄴ객체가 지정되지 않은 null 상태. 메소드 실행못합니다.
			System.out.println("temp =" + temp);
		}
//		catch (InputMismatchException e) {	 //InputMismatchException 만 처리합니다.
//		catch (NullPointerException e) {	//NullPointerException만 catch(처리) 합니다.
		catch (RuntimeException e) { // RuntimeException의 자식 클래스Exception catch(처리) 합니다.
			System.err.println("예외 : Null객체로 메소드를 실행하였습니다.");
		}

		// try~ catch 로 예외를 처리하면 정상적으로 프로그램이 진행됩니다.(try{} 블럭 이후의 명령어들 실행)

		// 예시2
		Scanner sc = null;
		int a;
		try {
			sc = new Scanner(System.in);
			System.out.print("정수 입력하세요.(1) >>> ");
			a = sc.nextInt(); // java.util.InputMismatchException
								// 숫자가 아닌 문자 입력하면 정수로 처리(nextInt)할 수 없어서 발생합니다.
			System.out.println("입력 값(1) = " + a);

		} catch (InputMismatchException e) {
			System.err.println("예외 : 숫자가 아닌 문자 입력하면 정수로 처리(nextInt)할 수 없습니다.");
		}

		sc.nextLine(); // 위의 nextInt() 가 가져가지 않은 문자 엔터를 처리하기 위한 명령.
		
		// 예시3
		try {
			System.out.print("정수 입력하세요.(2) >>> ");
			a = Integer.parseInt(sc.nextLine()); // java.lang.NumberFormatException
			// 숫자가 아닌 문자 입력하면 정수로 처리(parseInt)할 수 없어서 발생합니다.
			System.out.println("입력 값(2) = " + a);
		} catch (NumberFormatException e) {
			System.err.println("예외 :  숫자가 아닌 문자 입력하면 정수로 처리(parseInt)할 수 없습니다.");
		}
	}
}
