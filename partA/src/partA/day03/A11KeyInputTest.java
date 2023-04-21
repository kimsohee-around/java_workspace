package partA.day03;

import java.util.Scanner;	//기본클래스는 java.lang 패키지에 있고 그 이외의 자바클래스는 import 합니다.

//키보드를 통한 데이터 입력과 변수 저장 : 
public class A11KeyInputTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		//*키보드 입력을 위한 객체 생성
		
		int num;
		System.out.print("정수값 1개 입력하세요. >>> ");
		num = sc.nextInt();			//*사용자가 키보드로 입력한 것을 정수형식으로 처리하기 위한 메소드 사용
									//변환된 정수를 num에 저장
		System.out.println("num = " + num);
		
		int sum = num;			//첫번째 입력값 num 이 sum의 초기값이 됩니다.
		
		System.out.print("정수값 1개 입력하세요. >>> ");
		num = sc.nextInt();	
		System.out.println("num = " + num);
		
		sum = sum + num;		//두번째 입력값 num 이 sum에 더해지고 sum은 그 결과값으로 변경됩니다.
		System.out.println("sum = " + sum);
		
		sc.close();				//*키보드 입력 종료
		num = sc.nextInt();		//오류 : 자원을 close 한 후에는 사용못함.
		
	}
}
