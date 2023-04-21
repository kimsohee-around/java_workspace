package partA.day03;

public class A09PrefixPostfixTest {
	
	public static void main(String[] args) {
		
		char start ='A';
		
		//증가 또는 감소연산자 (증감연산)는 다른 명령문과 같이 쓰일때 위치가 중요합니다.
		System.out.println("== postfix 확인 (출력 후에 +1)==");
		System.out.println(start++);		//출력 후에 +1
		System.out.println(start++);		//출력 후에 +1
		System.out.println(start++);		//출력 후에 +1
		System.out.println(start++);		//출력 후에 +1

		start = 'A';
		System.out.println("== prefix 확인 (+1 후에 출력) ==");
		System.out.println(++start);		// +1 후에 출력
		System.out.println(++start);
		System.out.println(++start);
		System.out.println(++start);
		
	}

}
