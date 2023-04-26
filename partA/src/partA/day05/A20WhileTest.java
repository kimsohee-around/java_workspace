package partA.day05;

import java.util.Scanner;

//반복문 while
public class A20WhileTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		//while문은 () 안에 초기식과 증감식이 포함되지 않습니다.
		
		while(status) {		//while(조건식) : 조건식이 참인 동안 {...} 반복 실행
			System.out.print("정수값 1개를 입력하세요. >>>");
			int n = sc.nextInt();
			if(n==-999) break;				//이하의 명령들을 실행하지 않고 while 끝내기
//			if(n==-999) status=false;     //이하의 명령들을 실행.
			
			System.out.println("::::" + n + "::::");
		}
		
		//for(int i=0;i<10;i++)  System.out.println("i="+i+"," + (i<10)); 와 동일합니다.
		int i=0;
		while(i<10) {
			System.out.println("i="+i+"," + (i<10));
			i++;
		}
		
		
		sc.close();
		System.out.println("프로그램 종료합니다.");
	}

}
