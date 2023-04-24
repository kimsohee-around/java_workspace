package partA.day04;

public class A16ForBasic {
	
	public static void main(String[] args) {
		//1)반복문 제어 변수를 for() 에서 선언하기
		for(int i=0;i<10;i++) {			//여기서 선언된 변수는 for { } 안에서만 사용됩니다.
//			for( 1)초기식 int i=0; 2)조건식 i>10; 3)증감식 i++) {
//					4) 반복실행할 명령문
//			} 실행순서 : 1) => 2) => 2)번 조건식이 참일 때 4)명령문 실행 => 3)번 증감식 실행
//						  => 2) =>             "                =>      "    순서로 계속 반복,
//					  for문이 종료되는 것은 2)번 조건식이 거짓일 때입니다.			
			System.out.println("i="+i + "," + (i<10));
			System.out.println("하이~ hello~ ");    //반복 실행할 명령문	
			
		}
		
	//	System.out.println("i=" + i);		//오류 : 1)번은 여기서 사용할 변수 선언 i 없음.
		
		//2) 반복문 제어 변수를 for() 바깥에서 선언하기
		int j;
		for(j=0;j<10;j++) {
			//반복 명령문 없이 실행해봅시다.
		}
		
		System.out.println("j="+j + "," + (j<10));    //j=10, false   2)번은 변수 j가 선언 되었음.
		
		//3)처음 제어 변수의 값이 조건 거짓일때
		for (int i=0;i>10;i++) {
			System.out.println("나 3)번 for는 실행되나요?");
		}
		
		//4)for문의 초기식,조건식, 증감식이 모두 없을 때 - 5)번 명령 실행 안되므로 오류나서 주석처리
		//for(;;) {
		//	System.out.println("무한 반복 loop 상태 입니다.");
		//}
		
		//5)초기식 없이 사용하는 경우
		for(;j>0;j--) {
			System.out.println("j="+j + "," + (j>0));
		}
	}

}






