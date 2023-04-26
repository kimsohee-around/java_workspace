package partA.day05;

//반복문 do ~ while (조건식)
public class A22DoWhileTest {

	public static void main(String[] args) {
		
		int i=0;
		while(i>10) {	//1단계 :조건검사 
			System.out.println("나는 while 반복문입니다.");   //2단계 : 명령문 실행
		}
		
		System.out.println("---------");
		
		do {
			System.out.println("나는 do while 반복문 입니다.");   //1단계 : 명령문 실행
		}while(i>10);		//2단계 : 조건검사
		System.out.println("==========");
		
		//문제해결을 위한 흐름이 어느것이 더 적합한지 생각해서 골라쓰기
	}
}
