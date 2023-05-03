package partA.day10;

import java.util.Arrays;

public class A39CharArrayTest {
	
	public static void main(String[] args) {
		
		//char 배열 테스트
		char[] chs = {'하','이','~','자','바','ㅋ','ㅋ'};
		
		int[] nums = {1,2,3,4,5};
		
		System.out.println("정수 배열 이름으로 print");
		System.out.println(nums);
		System.out.println("문자타입 배열 이름으로 print");
		System.out.println(chs);	//char 배열은 문자열과 유사하게 다룰 수 있습니다.
									//char 배열요소값을 나열하면 문자열이 됩니다.(자동변환)
		
		//문자열과 char 배열 사이의 변환 메소드
		System.out.println("1.문자열을 char배열로 변환");
		String temp = "hello~java!";
		char[] tempArr =temp.toCharArray();
		for(int i=0;i<tempArr.length;i++)
			System.out.println(String.format("tempArr[%d] = %c\n", i,tempArr[i]));
		System.out.println(Arrays.toString(tempArr));
		
		System.out.println("2.char배열을 문자열로 변환");
		tempArr[5]='*';
		temp = String.valueOf(tempArr);		
		System.out.println(temp + ",문자열 길이 : " + temp.length());
		System.out.print(tempArr);		//tempArr 을 출력을 위해 자동으로 String변환
		System.out.println(",배열 길이 : " + tempArr.length);
		System.out.println(tempArr + ",배열 길이 : " + tempArr.length);
		//문자열과 char배열의 + 연산을 실행하면 char 배열의 String 자동변환 하지 않음.
		
		//[C@7a79be86 에서 7a79be86 는 해시코드값이고 해시함수를 통해서 만들어지는 4바이트 값.
		//	  자바의 객체들을 식별하기 위해 객체가 갖는 여러가지 값들을 복합적으로 계산해서 만듭니다.
	}

}
