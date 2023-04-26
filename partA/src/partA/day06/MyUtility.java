package partA.day06;

public class MyUtility {
	//필드는 클래스의 구성요소인 `특성(데이터)`을 나타내는 변수. 위치를 고려하면 전역(global) 변수
	//전역변수는 이 클래스 어디서나 쓸 수 있습니다.
	public static final double VERSION = 1.1;
	//public static final 는 상수. 대문자로 표기
	// 상수는 변하지 않는 의미있는 값을 이름을 붙여준 것입니다.값을 변경할수 없습니다.
	
	public static int TEST = 1234;
	public static final int TEMP = 9999;   
	
	private static int toAscii(char ch) {		
	//private은 이 클래스의 다른 메소드가 사용하는 것이 목적입니다.
		
		//int code = ch;		//자동 캐스팅
		//return code;
		System.out.println(VERSION);
		return ch;		//정상 : 리턴값도 자동 캐스팅
	}
	
	private static char toChar(int code) {
		return (char)code;
	}
	
	public static void alphabetPrint(int i) {
		char start='A';					//메소드의 지역(local)변수
		if(i==1) start='a'; 
		for(char ch= start;ch<start+26;ch++) {		//i값에 따라 start 결정됩니다.
			System.out.print(ch);					//마지막값은 알파벳 26개이므로 start+26
		}
//		toAscii('#');		//테스트 
//		toChar(67);
		System.out.println();
	}

	public static double sumThreeDouble(double d, double e, double f) {
		return d+e+f;
	}

	public static int sumThreeNumber(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
	}


	public static int sumFromNToM(int n, int m) {
		int sum=0;
		for(int i=n;i<=m;i++) {
			sum+=i;
		}
		//sum은 1부터 n까지의 합
		return sum;
		}

	public static int sumToN(int n) {		//void??  //n 오류??
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		//sum은 1부터 n까지의 합
		return sum;
	}
	
	//매개변수는 개수의 제한이 없습니다. int n , int m  또는 int start, int end 와 같이 나열합니다.
	
	//메소드 만들기 문제.
	
	
	
}
