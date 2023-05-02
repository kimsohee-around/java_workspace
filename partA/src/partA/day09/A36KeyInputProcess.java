package partA.day09;

import java.util.Scanner;

public class A36KeyInputProcess {
	//nextLine() 과 nextInt() 2개 메소드를 같이 사용할 때 문제점.
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("문자열 입력 후 정수 입력~~ ");
		//키보드 입력한 문자가 저장되는 메모리 영역에는
		// 예시 : 김땡땡(엔터)22(엔터)
		System.out.print("이름 입력하세요. >>> ");
		name = sc.nextLine();		//nextLine 은 엔터까지 가져옵니다.
		
		//22엔터
		System.out.print("나이 입력하세요. >>> ");
		age = sc.nextInt();
		
		System.out.println("name = " + name +",age=" + age);
		
		System.out.println("\n정수 입력 후 문자열 입력~~ ");
		//키보드 입력한 문자가 저장되는 메모리 영역에는
		// 예시 : 22엔터
		System.out.print("나이 입력하세요. >>> ");
		age = sc.nextInt();			//nextInt는 엔터 바로 전까지만 가져옵니다. 22만 가져가서 정수로 변환
		
		//해결방법 1 :
		sc.nextLine();
		
		//엔터
		System.out.print("이름 입력하세요. >>> ");
		name = sc.nextLine();       //입력커서 없이 남은 엔터를 가져갑니다.

		System.out.println("name = " + name +",age=" + age);
		
		
		sc.close();
	}
}
