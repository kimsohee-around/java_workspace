package partA.day05;

import java.util.Scanner;

//아스키코드 정수값 입력  -> 문자 출력 반복하기
public class A21AsciiCodePrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean status=true;
		while(status) {
			System.out.print("아스키코드 정수값 32~126 입력하세요.(종료는 0 입력) >>> ");
			int code = sc.nextInt();
			if(code==0) break;			//while 종료 조건
			//32~126이 아닐 때는 `잘못된 입력`이라고 알려주기.-> if문
			if(!(code<32 || code > 126))	//A14 예제와 같은 조건사용하려고 합니다.
				System.out.println("아스키코드 =" + code + ",문자 = " + (char)code);
			else 
				System.out.println("잘못된 입력입니다.");
			
		}
		System.out.println("첫번째 while 종료합니다.");
	
		System.out.println("두번째 while 시작합니다.");
		int code = 999;
		int count =0;		//초기화 필수
		while(code!=0) {	//1)정수값 저장할 code 변수 이용한 조건식.
			System.out.print("아스키코드 정수값 32~126 입력하세요.(종료는 0 입력) >>> ");
			code = sc.nextInt();  count++;
		//	if(code==0) break;			 	//2)종료조건
			
			//32~126이 아닐 때는 다시 입력받기. //1)번이 있고 0값이 아래 countinue 조건에 해당하면 2)번 필요없음.
			if(!(code>=32 && code <= 126))		//continue를 위한 조건
					continue;				//이하의 명령들을 실행하지 않고 while 처음으로 갑니다.
			
			System.out.println("아스키코드 =" + code + ",문자 = " + (char)code);
			
		}
		//문제 : 두번째 while 문의 sc.nextInt() 명령이 몇번 실행됬는지 구해봅시다.
		System.out.println("정수값 입력 시도 횟수는 " + count + " 입니다.");

		System.out.println("두번째 while 종료합니다.");
		
		//break,continue 제어문은 for문에서도 쓰입니다.
		sc.close();
		
	}
	
}
