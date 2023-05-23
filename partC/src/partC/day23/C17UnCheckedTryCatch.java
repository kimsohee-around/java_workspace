package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C17UnCheckedTryCatch {
	
	//어떠한 RuntimeException 이 생기는지 확인하기.
	//         ㄴ NullPointerException, InputMismatchException , NumberFormatException의 부모클래스입니다.
	public static void main(String[] args) {
		
		try {
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
		} //try{ } 블럭안에서 예외가 발생했을 떄 , 
		  //어떤 예외 타입인지 catch에서 비교하고 타입이 일치한 catch{} 블럭을 처리합니다.
		  //발생한 예외 객체는 catch() 블록 매개 변수 e 로 참조합니다.
/*		
		catch (RuntimeException e) {
			System.out.println("실행 중에 생기는 예외를 처리합니다.");
			//부모 타입 RuntimeException 으로 하면 아래 자식 타입 예외는 처리가 안될 것이므로 컴파일 오류 발생합니다.
		}
*/		 
		catch (NumberFormatException e) {
			System.err.println("숫자가 아닌 문자는 parseInt 못합니다." + e.getMessage());
		} 
		catch (NullPointerException e) {
			System.err.println("null 객체로 메소드실행 못합니다." + e.getMessage());
		} 
		catch (InputMismatchException e) {
			System.err.println("숫자가 아닌 문자는 nextInt 못합니다." + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("실행 중에 생기는 예외를 처리합니다." + e.getMessage());
			//부모 타입 RuntimeException 으로 위의 3개 예외 이외의 모든 RuntimeException을 처리합니다.
		}
		//multi-catch
		
	}
}
