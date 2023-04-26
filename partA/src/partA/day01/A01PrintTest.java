package partA.day01;
//패키지 이름은 com.naver.api 과 같은 도메인주소 형식입니다.
/*
 * 복습 : 1. 출력문 System.out.println  2. 사용자정의한 메소드 aboutClass,aboutSystem
 *       3. 문자열은 일반적으로 문장을 말합니다."(큰 따옴표) 안에 작성. 큰 따옴표 출력하고 싶으면 \(역슬래쉬)와 같이 사용 
 *       4. 역슬래쉬와 같이 쓰는 문자 - 이스케이프 문자. \n , \t , \" 등등
 */

//보라색은 예약어(키워드)
public class A01PrintTest {		//개발자가 만든 클래스

	public static void main(String[] args) { // main 이라는 이름의 메소드 : 실행프로그램의 메소드
		System.out.println("::::::: 첫번째 연습 - 표준 출력 ::::::");
		System.out.println("*출력문 연습 : 큰 따옴표 기호안에 출력하고 싶은 문자열을 작성한다.*");
		System.out.println("1. 클래스 이름 A01PrintTest 은 소스파일명과 동일해야 한다.");
		aboutClass();		//개발자 정의한 메소드 실행(호출)
		System.out.println("2. main 은 \"프로그램을 실행하는 기능\"으로 정해진 메소드 이름이다.");
		System.out.println("3. System 은 자바에서 만들어 놓은 클래스 이다. jdk에 포함된다.");
		aboutSystem();
		System.out.println("=== 메소드로 만들면 코드 재사용이 됩니다. ===");
		aboutClass();
		aboutSystem();
		System.out.println(Math.rint(4.5));
		System.out.println(Math.round(4.5));
	}

	public static void aboutClass() {       // aboutClass 이라는 이름의 메소드 정의 : 개발자가 정한 이름
		System.out.println("- 클래스는 여러 기능을 갖기 위해 필요한 메소드를 정의한다.");
		System.out.println("- 클래스의 이름은 대문자로 시작한다.(Rule)");
		System.out.println("- 메소드의 이름은 소문자로 시작하고 괄호 ()가 따라온다.(Rule)");
	}

	public static void aboutSystem() {
		System.out.println("- System 은 운영체제를 통해 얻을 수 있는 기능과 정보를 제공하는 자바의 클래스이다.");
		System.out.println("- out 은 System 클래스의 구성요소로 출력과 관련된 특징과 기능을 갖는다. ");
		System.out.println("- println 은 out이 갖고 있는 메소드(기능)이다.  ");
		System.out.println("- System 은 out 을 , out은 println을 구성요소로 포함하고 있다.");
		System.out.println("  명령으로 작성할 때 .(dot)기호로 포함관계를 표시한다.");
	}
}

/*
 * 이클립스 단축키 : 
 * 		저장 : Ctrl+s , 실행 : Ctrl + F11 , 한줄 복사 : Ctrl+Alt+위/아래방향키 , 
 *  	한줄 삭제 :Ctrl+d , 자동 완성 : Ctrl+스페이스바 , 라인 이동 : Alt + 위/아래방향키
 *  	오류 수정 가이드 : ctrl+1
 * 
 */

