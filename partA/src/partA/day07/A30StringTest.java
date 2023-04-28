package partA.day07;

import java.util.Scanner;

public class A30StringTest {
	//A29 클래스에서 연습한 String 메소드 활용해 보기
	public static void main(String[] args) {
		
		//1.프로그램 사용자에게 메시지를 입력받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("보낼 메시지를 입력하세요. >>> ");
		String message = sc.nextLine();
		//2.총길이를 알려주고, 
		System.out.println("당신이 입력한 메시지의 문자 갯수는 " + message.length() + " 입니다.");
		//3.대문자/소문자/숫자 각각 포함된 개수를 알려주기
		int numericCount=0;
		int upperCaseCount =0;
		int lowerCaseCount =0;
		int hangulCount =0;
		int symbolCount =0;
		
		//3-1 먼저 for문으로 문자를 1개씩 가져와 봅니다.반복횟수는 message 문자열의 길이.
		for(int i=0;i<message.length();i++) {
			char temp =message.charAt(i);			//마지막 i값은 message.length()-1
			System.out.println(temp);
			if(isUpperCase(temp)) upperCaseCount++;
			if(isLowerCase(temp)) lowerCaseCount++;
			if(isNumeric(temp)) numericCount++;
			if(isHangul(temp)) hangulCount++;
			if(isSymbol(temp)) symbolCount++;
		}
		
		System.out.println("당신의 메시지는 대문자 " + upperCaseCount + "개, ");
		System.out.println("            소문자 " + lowerCaseCount + "개, ");
		System.out.println("            숫자 " + numericCount + "개, ");
		System.out.println("            한글 " + hangulCount + "개, ");
		System.out.println("            특수문자 " + symbolCount + "개 입니다. ");
		
	}

	private static boolean isSymbol(char temp) {
		// TODO Auto-generated method stub
		return temp<=' ' && temp<='/' || temp <= ':' && temp >= '@' || 
				temp >= '[' && temp <= '`'  || temp>='{' && temp <= '~';
	}

	private static boolean isHangul(char temp) {
		// TODO Auto-generated method stub
		return temp >= '가' && temp <='힣';   
	}

	private static boolean isUpperCase(char temp) {	//temp 가 대문자일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= 'A' && temp <='Z';
	}

	private static boolean isLowerCase(char temp) {	//temp 가 소문자일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= 'a' && temp <='z';
	}
	private static boolean isNumeric(char temp) {	//temp 가 숫자일때 '참', 그렇지 않으면 거짓 리턴
		return temp >= '0' && temp <='9';
	}

	//한글은 '가' ~ '힣'  => isHangul
	//특수문자 ' ' ~ '/' 또는 ':' ~ '@' 또는 '[' ~ '`'  또는 '{' ~ '~' => isSymbol
	
	
	
}
