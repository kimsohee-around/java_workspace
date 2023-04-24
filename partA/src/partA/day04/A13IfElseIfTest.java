package partA.day04;

import java.util.Scanner;

// if ~ else if ~ else if ~ ....
public class A13IfElseIfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menu;

		System.out.println(":::: 쇼핑몰 사용자 마이페이지 ::::");
		System.out.println("1:장바구니   2:찜 상품   3.배송 조회   4.구매 목록  5.종료");
		System.out.print("선택 하세요. >>>> ");
		
		menu = sc.nextInt();
		
		//동일한 값인지 비교 : 관계연산자 == 또는 != 
		if(menu==1) {
			System.out.println("장바구니 🎁🎁🎁🎁 .많이 담아 주세요.");
		}else if(menu ==2) {
			System.out.println("찜 상품 입니다.❤❤");
		}else if(menu ==3) {
			System.out.println("배송 조회 🚚🚛🚚🚛 ");
		}else if(menu ==4) {
			System.out.println("구매 목록 입니다.");
		}else if(menu ==5) {
			System.out.println("종료 입니다.");
		}else {
			System.out.println("잘못된 선택 입니다.");
		}
		
		System.out.println("메뉴 선택 종료합니다.");
		
		System.out.println("\n\n:::: 아스키코드값으로 문자 종류 확인하기 ::::");
		System.out.print("아스키 코드 정수값(0 ~127) 입력 하세요. >>> ");
		int code = sc.nextInt();
		
		//0~127 일때만 실행되도록 if 문을 중첩시킵니다.
		if(code>=0 && code<128) {
			if(code>=65 && code <=97) {
				System.out.println("대문자 입니다.");
			}else if(code>=97 && code <=122) {
				System.out.println("소문자 입니다.");
				
			}else if(code>=48 && code <=57) {
				System.out.println("숫자 입니다.");
				
			}else {
				System.out.println("특수 문자 입니다.");
			}
			
			System.out.println("입력 문자 => " + (char)code);
			
		}else {
			System.out.println("아스키코드값 범위는 0~127 입니다.");
			//보통은 프로그램 안에서 다시 입력 받거나 이 후에 코드는 실행하지 않게 하거나 등등의 방법으로 처리합니다.
		}
	}
	
}
/*
1) 아스키코드 정수값 입력  0~127 범위로 받으세요.
(* 0 ~ 127 사이의 값이 아닐 때 처리는 같이 할께요.)

2) 입력 받은 값으로 아래 4개 중 하나로 분류해서 종류를 출력하고

- 대문자   <=  65~90        조건식은  num>=65 && num <=97
- 소문자   <=  97 ~ 122
- 숫자       <= 48~57
- 특수문자  <= 나머지

3) 입력한 정수 코드값에 해당하는 문자를 출력하기.
 
 */
