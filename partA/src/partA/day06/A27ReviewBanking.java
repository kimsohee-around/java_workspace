package partA.day06;

import java.util.Scanner;

public class A27ReviewBanking {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance =0;		//잔고,잔액
		int money;			//예금 또는 출금액
		boolean status = true;
		while(status) {
			
			System.out.println("-----------------------------------------------");
			System.out.println("  1:예금하기 | 2:출금하기 | 3:잔액 확인 | 4:프로그램 종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 >>> ");
			int menu = sc.nextInt();
			
			switch (menu) {  //검사할 값은 메뉴 선택값 저장한 변수
				case 1:
					System.out.print("예금 금액 >>> ");
					money=sc.nextInt();
					balance+=money;
					System.out.println("현재 잔고 금액 = " + balance);
					break;
					
				case 2:
					System.out.print("출금 금액 >>> ");
					money=sc.nextInt();
					if(balance >= money)
						balance-=money;
					else //balance < money
						System.out.println("잔고 금액이 부족하여 출금할 수 없습니다.");
					System.out.println("현재 잔고 금액 = " + balance);
					break;
					
				case 3:
					System.out.println("현재 잔고 금액 = " + balance);
					break;
					
				case 4:		// while 반복 종료하는 조건
					System.out.println("프로그램을 종료합니다.");
					status = false;
					break;

				default:		//1~4 이외의 menu 값일때
					break;
			} //switch end
	
		
		}//while end
		
		
	}//main end

}
