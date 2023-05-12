package test;

import partB.day12.MyIntegerValue;
import solution.Bike;

public class B03AccessTest {

	public static void main(String[] args) {
		// MyIntegerValue의 필드 접근 범위 확인
		MyIntegerValue my = new MyIntegerValue();
//		my.value1 = 23; 	my.value2 = 45;		
//오류 : 패키지 접근 한정 필드 value1,value2는 다른 패키지에서는 접근 불가
		System.out.println("my.message 초기 상태 = " + my.message);
		my.message = "hi~~!!";
		System.out.println("my.message 값 대입 후 = " + my.message);
		System.out.println(my.result);
		System.out.println(my.isOk);
		
		System.out.println("\nsolution 패키지 클래스 테스트");
		Bike bike = new Bike();
//		Electronics electron = new Electronics();  //오류: 접근한정자 default 인 클래스
	}

}
