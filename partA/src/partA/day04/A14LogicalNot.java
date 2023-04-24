package partA.day04;

import java.util.Scanner;
//한꺼번에 import 단축키는 ctrl+shift+o
//       변수명 다른 이름으로 수정하고 싶을 때 alt+shift+r

public class A14LogicalNot {		
	//not 논리연산 연습 : true은 false 로 , false는 true 로 변경합니다.연산기호는 !
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아스키 코드 정수값 0~127 입력하세요.");
		int code = sc.nextInt();
		
		System.out.println("1)0~127 범위 확인 : " + (code>=0 && code <128));
		System.out.println("2)0~127 범위가 아닌지 확인 : " + (code <0 || code >= 128));
		System.out.println("3)0~127 범위가 아닌지 확인 : " + !(code>=0 && code <128));  //2)번과 같은 조건식
		
		
		System.out.println(":: 아스키 코드값 중에 문자로 출력 가능한 범위는 32~126");
		
//연습:32~126 일때만 출력하도록 합니다.그렇지 않으면 '출력할수 없는 문자'로 출력하세요. 
//		(not 연산으로 해보세요.)
		if(!(code<32 || code > 126))   //if(code>=32 && code <=126)  와 동일
			System.out.println("입력 문자 =>" + (char)code);		
		else 
			System.out.println("출력할 수 없는 문자입니다.");
		
				
		sc.close();
	}

}
