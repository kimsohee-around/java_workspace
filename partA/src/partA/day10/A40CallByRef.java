package partA.day10;

import java.util.Arrays;

//call by value : 메소드 인자로 데이터 값을 전달. 메소드 인자가 원시 타입
//call by reference : 메소드 인자로 객체의 참조값을 전달. 메소드 인자가 배열 또는 클래스 타입.
public class A40CallByRef {
	
	public static void main(String[] args) {
		int test = 100;
		changeTest(test);
		System.out.println("changeTest 실행 후 test = " + test);
		
		int[] intArr = {1,2,3,4,5};
		changeIntArr(intArr);
		System.out.println("changeIntArr 실행 후 intArr = " + Arrays.toString(intArr));
		System.out.println(intArr.hashCode());
		String temp = "hello";
		changeString(temp);
		System.out.println("changetString 실행 후 main 지역변수 temp = " + temp);

		//String 불변 객체인가 확인
		String temp2="hello";		//"hello"문자열 객체 이미 있으니 다시 생성 안함.
		System.out.println(temp.hashCode());	//객체의 해시코드값은 10진수로 출력
		System.out.println(temp2.hashCode());
		System.out.println("**temp==temp2 ? " + (temp==temp2) );
		System.out.println("**temp.equals(temp2) ? " + temp.equals(temp2));
		
		//"hello" 가 이미 있지만 그래도 새로 만들자.
		String temp3 = new String("hello");
		System.out.println(temp.hashCode());	//객체의 해시코드값은 10진수로 출력
		System.out.println(temp3.hashCode());
		System.out.println("**temp==temp3 ? " + (temp==temp3) );
		System.out.println("**temp.equals(temp3) ? " + temp.equals(temp3));
		//문자열 해시코드값은 문자열 구성이 같으면 동일하도록 변경(override)되어 있어
		//     객체는 다르지만 해시코드 값은 같습니다.
		
		String temp4 = new String("hello");
	}
	
	private static void changeString(String temp) {
		temp =temp.replace("ll", "**");	
		//문자열은 문자열 내용이 바뀌면 객체의 위치가 바뀝니다.(불변 객체)
		//   -> temp가 "hello" 를 참조했던 값에서 "he**o" 객체의 참조값으로 바뀝니다.
		System.out.println("changetString 메소드 지역변수 temp =" + temp);
		
	}
	private static void changeIntArr(int[] temp) {
	//temp는	changeIntArr 메소드의 지역변수이다. 메소드가 changeIntArr(intArr); 실행될 때
	//      intArr 배열의 참조값을 temp 가 전달받아 저장합니다.	
			temp[3]=100;	
	}

	private static void changeTest(int test) {
		test = 200;
	}

}
