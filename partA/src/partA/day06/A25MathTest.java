package partA.day06;

import java.util.Random;

//메소드 형식 연습 : 자바의 Math 클래스를 예시로 합니다.
public class A25MathTest {

	public static void main(String[] args) {
		
		System.out.println("1.최대값 max, 최소값 min 구하기");
		System.out.println("Math.max(56,12) ="+ Math.max(56,12));
		System.out.println("Math.max(56.34,99.123)="+ Math.max(56.34,99.123));
		int min = Math.min(45, 56);
		//double dmin = Math.min(45, 56);	//자동 캐스팅
		double dmin = Math.min(56.78, 111.44);
		//int imin = (int)Math.min(56.78, 111.44);		//강제 캐스팅
		
		System.out.println("min = "+min);
		System.out.println("dmin = "+dmin);
		
		//3개의 값 - 45,78,33  - 중 가장 큰값, 가장 작은 값
		int a= 45, b=78,c=93;
		System.out.println("a= 45, b=78,c=33 max = "+Math.max(Math.max(a, b),c));
		System.out.println("a= 45, b=78,c=33 min = "+Math.min(Math.min(a, b),c));
		
		System.out.println("2. 반올림 round , rint - 실수를 반올림하여 정수로 리턴");
		System.out.println("Math.round(3.141519) ="+  Math.round(3.141519));
		System.out.println("Math.round(3.14) ="+ Math.round(3.14));
		System.out.println("Math.round(5.64) ="+ Math.round(5.64));
		System.out.println("Math.round(3.5) ="+ Math.round(3.5));	//
		System.out.println("Math.round(-3.5) ="+ Math.round(-3.5));	//
		System.out.println("Math.round(-3.6) ="+ Math.round(-3.6));	//
		System.out.println("Math.round(-3.2) ="+ Math.round(-3.2));	//
		System.out.println("Math.rint(3.5)="+ Math.rint(3.5));		//
		System.out.println("Math.rint(-3.5)="+ Math.rint(-3.5));		//
		System.out.println("Math.rint(-3.6)="+ Math.rint(-3.6));		//
		
		//해결 : 3.141519를 소수점 3번째 자리까지로 반올림 하세요.
		System.out.println("Math.round(3.141519*1000) ="+Math.round(3.141519*1000));
		System.out.println("Math.round(3.141519*1000) /1000.0 ="+Math.round(3.141519*1000)/1000.0);
		System.out.println("Math.round(3.141219*1000) ="+Math.round(3.141219*1000));
		System.out.println("Math.round(3.141219*1000) /1000.0 ="+Math.round(3.141219*1000)/1000.0);
		
		//1231, 1236 를 십의 자리까지 반올림은 / 하고 *  => 복습으로 해보세요.
		
		System.out.println("3. 올림 ceil");
		System.out.println("Math.ceil(3.141519) ="+  Math.ceil(3.141519));
		System.out.println("Math.ceil(3.14) ="+ Math.ceil(3.14));
		System.out.println("Math.ceil(5.64) ="+ Math.ceil(5.64));
		System.out.println("Math.ceil(3.5) ="+ Math.ceil(3.5));	//
		System.out.println("Math.ceil(-3.5) ="+ Math.ceil(-3.5));	//
		
		
		System.out.println("4. 내림 floor");
		System.out.println("Math.floor(3.141519) ="+  Math.floor(3.141519));
		System.out.println("Math.floor(3.14) ="+ Math.floor(3.14));
		System.out.println("Math.floor(5.64) ="+ Math.floor(5.64));
		System.out.println("Math.floor(3.5) ="+ Math.floor(3.5));	//
		System.out.println("Math.floor(-3.5) ="+ Math.floor(-3.5));	//
		
		System.out.println("5. 난수(컴퓨터가 만들어주는 임의 값) - random");
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		System.out.println("Math.random() = " + Math.random());
		// 0 < 난수 < 1    => 로또 값처럼 1 <= 로또번호 <= 45
		//  원래 범위에 0 < 난수*45 < 45   , 다시 +1 하면 1< 난수*45+1 < 46
		
		for (int i=0 ; i<6 ;i++) {
			double d = Math.random()*45+1;
			int rnd =(int)d;
			System.out.println(d);
			System.out.println(rnd);
		}
		
		
	}
}






