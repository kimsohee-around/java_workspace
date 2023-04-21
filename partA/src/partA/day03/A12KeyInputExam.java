package partA.day03;

import java.util.Scanner;

//A10 번 클래스를 age, point 를 키보드입력 받아 업데이트 하세요.
public class A12KeyInputExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age;			//초기값 없음.
		boolean isAdult=false;			
		
		System.out.print("나이를 입력하세요. >>> ");			//나이 입력
		age = sc.nextInt();
		
		System.out.println("입력된 나이는 " + age );
		System.out.println("조건식 미리 확인 : " + (age >=20));
		if(age >= 20) {			//age가 16이면 거짓		, age가 26이면 참
			isAdult= true;		//      "     실행 안함   ,       "     실행합니다.
		}
		
		System.out.println("isAdult : " + isAdult);
		System.out.println(":::::::::::::::::::");
		
		int point;		//처리사항 : 1)point 가 70 이상이면 vip, 70미만이면 일반회원으로 출력합니다.
							// 	2)vip 회원이면 이벤트 포인트 100 포인트 추가, 일반회원 50 포인트 추가
		
		System.out.print("point 를 입력하세요. >>> ");
		point = sc.nextInt();
		System.out.println("입력된 point 는 " + point);
		if(point >=70) {
			System.out.println("Vip 회원이십니다.💕💕");
			point += 100;
		}else {		//	point < 70 일때 실행
			System.out.println("일반 회원이십니다.🤞🤞");
			point +=50; 
		}
		
		System.out.println("고객님의 최종 포인트는 " + point + " 입니다.");
		sc.close();
	}
}
