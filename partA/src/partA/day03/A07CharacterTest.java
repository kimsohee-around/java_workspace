package partA.day03;

//char 문자형 데이터 연습
public class A07CharacterTest {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = 65;
		char c3 = '가';
		char c4 = '\uac00';			// \\u 는 유니코드를 나타내는 이스케이프 문자(16진수로 표시)
		char c5 = 44032;	//ac00 16진수에 대한 10진수 정수값
		
		System.out.println("c1 :" + c1);	// 출력결과 - A
		System.out.println("c2 :" + c2);	// 출력결과 - A
		System.out.println("c3 :" + c3);	// 출력결과 - 가
		System.out.println("c4 :" + c4);	// 출력결과 - 가
		System.out.println("c5 :" + c5);	// 출력결과 - 가
		
		char c6 = '힣'; 		//한글 마지막 문자
		//힣 의 유니코드값 10진수는 ?
		int code6 = c6;
		System.out.println("한글 마지막 문자 c6 : " + c6);
		System.out.println("한글 마지막 문자 코드값 code6 : " + code6);
		System.out.println("한글 유니코드 문자는 총 " + (code6-44032+1) + "개 입니다.");
		
		// 시작값~마지막값이 주어지면 이 범위의 해당되는 개수를 구하는 수식?  마지막값 - 시작값 + 1
		// 예시 : 14부터 20 => 20-14+1 = 7개
		
		//문자와 코드 정수값 
		int code1 = c1;			//c1은 'A' 를 int 로 자동 캐스팅하면 65
		code1+=1; 				//code1= code1+1 를 줄인 수식. 66
		System.out.println("변경된 code1 : " + code1);		//66
		System.out.println("변경된 c1 : " + (char)code1);		//int를 char로 강제 캐스팅. 'B'
		
		//
		int code3 = c3;			//c3은 '가' 를 int 로 자동 캐스팅하면 44032
		code3++;				//code3+=1  을 줄인 수식.  1씩 더하는 코딩이 많아서 편의성을 위한 방법
		
		System.out.println("변경된 code3 : " + code3);		//44033
		System.out.println("변경된 c3 : " + (char)code3);		//int를 char로 강제 캐스팅. '각'
		
		
		code3++;				//44034
		System.out.println("변경된 code3 : " + code3);		//44034
		System.out.println("변경된 c3 : " + (char)code3);		//int를 char로 강제 캐스팅. '갂'
		
		//문자형으로는 덧셈이 오류
		//c1 = c1 +1;
		c1++;		//증가연산자. 1씩 더하는 코딩이 많아서 편의성을 위한 방법. 자동으로 캐스팅하여 덧셈.
		
	}

}
