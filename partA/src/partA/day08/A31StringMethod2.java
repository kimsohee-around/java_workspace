package partA.day08;

import java.util.Scanner;

//두번째 String 메소드 연습 - 특정 문자열 안에서 찾기/치환, 문자열추출 기능 
public class A31StringMethod2 {
	
	
	public static void main(String[] args) {
		String email = "koreait.sec2020@gmail.com";  //*마지막 문자 m 의 인덱스 = email.length()-1
		
		
		System.out.println("1. contains - 특정 단어(문자열)이 포함되어 있는지 검색");
		
		System.out.println("email.contains(\"gmail\") = " + email.contains("gmail"));   //"gmail 이 포함?"
		System.out.println("email.contains(\"gmail!\") = " + email.contains("gmail!"));   //"gmail 이 포함?"
		
		System.out.println("2. startsWith, endsWith - 맨앞 또는 맨뒤의 문자열 검색");
		System.out.println("email.startsWith(\"kor\") = " +email.startsWith("kor"));		//true
		System.out.println("email.startsWith(\"com\") = "+email.startsWith("com"));		//false
		System.out.println("email.endsWith(\"kor\") = "+email.endsWith("kor"));			//false
		System.out.println("email.endsWith(\"com\") = "+email.endsWith("com"));			//true
		
		//위의 2개는 리턴 타입이 boolean 이므로 조건식으로 사용
		System.out.println("\n\n3. indexOf, lastIndexOf - 찾는 문자열의 위치를 리턴");
		
		String message = "****korAbcd**korSecurity   kor!!! korea"; 
		System.out.println("01234567890123456789012345678901234567890");
		System.out.println(message);
		//indexOf 메소드는 first indexOf 입니다.
		System.out.println("message.indexOf(\"kor\") = "+message.indexOf("kor"));		//"kor"문자열이 인덱스 몇번에서 시작하는지 리턴
		System.out.println("message.indexOf(\"korSec\") = "+message.indexOf("korSec"));
		System.out.println("message.lastIndexOf(\"kor\") = " + message.lastIndexOf("kor"));	//"kor"문자열을 찾고 마지막 찾은 것의 위치 리턴
		System.out.println("반복해서 kor 찾기------------");
		System.out.println(message.indexOf("kor", 7));	//7번 위치 문자부터 "kor" 찾아서 위치 리턴
		System.out.println(message.indexOf("kor", 16));	//16번 위치 문자부터 "kor" 찾아서 위치 리턴
		System.out.println(message.indexOf("kor", 30));	//30번 위치 문자부터 "kor" 찾아서 위치 리턴
		System.out.println(message.indexOf("kor", 37));	//37번 위치 문자부터 "kor" 찾아서 위치 리턴
		//찾는 문자열 "kor"이 정해진 범위의 문자열에서 없으면 -1 리턴
		
		System.out.println("4. replace -  문자열 치환");
		System.out.println("kor을 모두 KOREA 로 치환하는 예시");
		message = message.replace("kor", "KOREA");
		System.out.println("치환 결과 : " + message);
		
		System.out.println("5. substring - 특정 범위로 문자열 추출");
		System.out.println("01234567890123456789012345678901234567890");
		System.out.println(message);
		System.out.println(message.substring(22));		//인덱스 22부터 마지막까지
		System.out.println(message.substring(22,message.length()));		//인덱스 22부터 마지막까지
		System.out.println(message.substring(22,35));	//인덱스 22부터 35-22개 추출(34 까지 35 포함 안함)
		
		
		//종합 예시 - 위의 email 에서 "@" 기준으로 앞에 문자열=> userid , 뒤에 문자열은 domain으로 저장하기
		//"koreait.sec2020@gmail.com" 에서 userid는 koreait.sec2020 , domain은 gmail.com 이 됩니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요. >>> ");
		email = sc.nextLine();
		
		//@를 찾는 것은 indexOf , 추출은 substring
		int temp = email.indexOf("@");
		System.out.println("email.indexOf(\"@\") = " + temp);
		//substring 메소드의 2번째 인자는 indexOf 메소드의 리턴값(정수) 으로 작성해 보았습니다.
		String userid= email.substring(0,email.indexOf("@"));
		
		String domain = email.substring(temp+1);
		
		System.out.println("아이디 = " + userid + ",이메일 서버 도메인 = " + domain);
		
	}
}





