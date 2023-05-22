package partC.day20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class C09StringSplitTest {
	//문자열 쪼개기(나누기) 
	public static void main(String[] args) {
		
		String temp = "모모 90 88 79";	//특정문자열을 중심(기준)으로 분리하기
		String[] result = temp.split(" ");  //split 메소드 리턴 타입은 String[], 인자는 분리기준 문자열

		System.out.println("1. temp 문자열 분리 split 결과 배열 : " + Arrays.toString(result));
		System.out.println(result.length);
		for(String t : result)
			System.out.println(t);
		
//		temp = "모모xy90xy88xy79xy33";   //1)
		temp = "모모xy90xy88xy79xy33y999x1111";   //2)
		result = temp.split("xy");			//2)에서 정확히 문자열 "xy" 기준으로만 분리. 배열 크기  5
 		System.out.println("temp 문자열 분리 split 결과 배열 : " + Arrays.toString(result));
		System.out.println(result.length);
		for(String t : result)
			System.out.println(t);
		
		//split 메소드는 분리된 결과를 배열로 짠~!!  , 토크나이저는 nextToken()으로 직접 하나씩 가져오기
		System.out.println("\n2. 문자열 토크나이저 (토큰: 어휘분석의 단위를 가리키는 컴퓨터용어이다.-위키백과 ");
		temp = "모모 90 88 79";
		
		StringTokenizer stk = new StringTokenizer(temp);   //구분기호 생략 : 공백 과 줄바꿈
		System.out.println("1.nextToken() 메소드 결과");
		System.out.println(stk.nextToken());   //자동(기본)으로 공백 기준   //모모
		System.out.println(stk.nextToken());   //90
		System.out.println(stk.nextToken());   //88
		System.out.println(stk.nextToken());   //79
//		System.out.println(stk.nextToken());	//오류 : next로 가져올 데이터 없음.
		
		//토크나이저는 재사용 못하므로 다시 생성
		stk = new StringTokenizer(temp);
		System.out.println("\n2. 반복문으로 실행하기 : hasMoreTokens-더 가져올것이 있니?");
		int count =0;
		while (stk.hasMoreTokens()) {
			System.out.println("count=" + count++ + ",다음 토큰 값 = " + stk.nextToken());
			//count++ 는 println 후에 증가(++)
		}
		System.out.println("총 토큰 값 갯수 = " + count);    //예상 값은 4
		
		
		//
		System.out.println("\3. 기준문자열(delimiter) 가 공백이 아닐 떄");
//		temp = "모모xy90xy88xy79xy33";		//1)
		temp = "모모xy90xy88xy79xy33y999x1111";	//2) 
		stk = new StringTokenizer(temp,"xy");	//2) 에서, 토큰 갯수 7. "xy"정규식 표현("x"또는"y")
		count =0;
		while (stk.hasMoreTokens()) {
			System.out.println("count=" + count++ + ",다음 토큰 값 = " + stk.nextToken());
		}
		System.out.println("총 토큰 값 갯수 = " + count);    //예상 값은 1)번 5  , 2)번은 7
	}

}







