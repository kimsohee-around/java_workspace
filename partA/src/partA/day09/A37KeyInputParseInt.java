package partA.day09;

import java.util.Scanner;

public class A37KeyInputParseInt {
	
	//A36 해결방법 2: 실제로 사용할 방식입니다. 모든 키보드 입력은 nextLine() 으로 합니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("\n정수 입력 후 문자열 입력~~ ");
		//키보드 입력한 문자가 저장되는 메모리 영역에는
		// 예시 : 22엔터
		System.out.print("나이 입력하세요. >>> ");
		age = Integer.parseInt(sc.nextLine());			
		//**nextInt 메소드를 nextLine 메소드로 입력받기 => 정수로 변환(문자열의 " "  가 제거된다고 생각하기)
		// sc.nextLine() 에서 입력 "23"을  정수 23 으로 변환. 
		
		System.out.print("키를 입력하세요. >>> ");
		double height = Double.parseDouble(sc.nextLine());		//키보드 입력 문자에 . 기호 포함 가능
		
		System.out.print("이름 입력하세요. >>> ");
		name = sc.nextLine();       //입력커서 없이 남은 엔터를 가져갑니다.

		System.out.println("name = " + name +",age=" + age + ",height=" + height);
		
		//결론 : 모든 키보드 입력을 문자열로 받아 원하는 형식으로 변환시키도록 합니다.
		//		앞으로 배울 여러가지 데이터 교환에서도 문자열이 기본입니다.
		
	}
// Boolean,Character,Integer,Long,Double,.... 원시 타입에 대한 처리 기능을 갖은 Wrapper 클래스
//  ㄴ String 에서 int,double,long,.... 원시타입으로 변환 : Wrapper 클래스.parseXXXX("문자열");
//  ㄴ int,double,long,.... 원시타입에서 String으로 변환 : String.valueOf(원시타입데이터);
	
}







